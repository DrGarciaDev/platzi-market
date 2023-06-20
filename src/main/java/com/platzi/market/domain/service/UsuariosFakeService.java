package com.platzi.market.domain.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.platzi.market.domain.dto.UsuariosFakeResponse;

@FeignClient(name="posts", url="https://jsonplaceholder.typicode.com")
public interface UsuariosFakeService {
    @GetMapping("/posts")
    List<UsuariosFakeResponse> readUsersFake();
}
