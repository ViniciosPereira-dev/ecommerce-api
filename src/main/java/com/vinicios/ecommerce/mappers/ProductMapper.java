package com.vinicios.ecommerce.mappers;

import com.vinicios.ecommerce.dtos.product.ProductCreateDTO;
import com.vinicios.ecommerce.dtos.product.ProductResponseDTO;
import com.vinicios.ecommerce.entities.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    @Mapping(target = "categoryId", source = "category.id")
    ProductResponseDTO toResponseDTO(Product entity);

    Product toEntity(ProductCreateDTO dto);
}

