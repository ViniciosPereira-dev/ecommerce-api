package com.vinicios.ecommerce.mappers;

import com.vinicios.ecommerce.dtos.category.CategoryCreateDTO;
import com.vinicios.ecommerce.dtos.category.CategoryResponseDTO;
import com.vinicios.ecommerce.entities.Category;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

    Category toEntity(CategoryCreateDTO dto);

    CategoryResponseDTO toResponseDTO(Category entity);
}
