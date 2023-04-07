package com.platzi.market.persistence;

import java.util.List;

import com.platzi.market.persistence.crud.ProductoCrudRepository;
import com.platzi.market.persistence.entity.Producto;

public class ProductoRepository {
	private ProductoCrudRepository productoCrudRepository;
	
	public List<Producto> getAll() {
		return (List<Producto>) productoCrudRepository.findAll();
	}
}
