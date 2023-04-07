package com.platzi.market.persistence.crud;

import org.springframework.data.repository.CrudRepository;

import com.platzi.market.persistence.entity.Producto;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {

}
