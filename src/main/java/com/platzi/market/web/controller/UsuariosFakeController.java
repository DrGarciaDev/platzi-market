package com.platzi.market.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.platzi.market.domain.dto.UsuariosFakeResponse;
import com.platzi.market.domain.service.UsuariosFakeService;

@RestController
@RequestMapping("/usuarios")
public class UsuariosFakeController {
    @Autowired
    private UsuariosFakeService usuariosFakeService;

    @GetMapping("/get-all")
	public ResponseEntity<List<UsuariosFakeResponse>> showUsersFake() {
        return new ResponseEntity<>(usuariosFakeService.readUsersFake() ,HttpStatus.OK);
	} 
}
