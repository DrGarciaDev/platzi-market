package com.platzi.market.persistence.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.platzi.market.domain.Category;
import com.platzi.market.persistence.entity.Categoria;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
//	Los mapeadores sirven para mapear o convertir entitys en objetos de dominio
//	en este caso categorias en categorys y productos en products
//	y comenzar a enfocar toodo a dominio para desacoplar nuestra api de 
//	una base de datos en específico
	
	@Mappings({
		@Mapping(source = "idCategoria", target = "categoryId"),
		@Mapping(source = "descripcion", target = "category"),
		@Mapping(source = "estado", target = "active"),
	})
	Category toCategory(Categoria categoria);
	
	@InheritInverseConfiguration
	@Mapping(target = "productos", ignore = true)
	Categoria toCategoria(Category category);
}
