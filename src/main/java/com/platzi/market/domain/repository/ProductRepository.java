package com.platzi.market.domain.repository;

import java.util.List;
import java.util.Optional;

import com.platzi.market.domain.Product;

/**
 * @author García Rodríguez Luis
 *
 */
public interface ProductRepository {
//	En este repositorio solo se ponen los nombres de los métodos
//	que queremos que cualquier repositorio que trabaje con productos
//	tenga que implementar 
	
	List<Product> getAll();
	Optional<List<Product>> getByCategory(int categoryId);
	Optional<List<Product>> getScarseProducts(int quantity);
	Optional<Product> getProduct(int productId);
	Product save(Product product);
	void delete(int productId);
}
