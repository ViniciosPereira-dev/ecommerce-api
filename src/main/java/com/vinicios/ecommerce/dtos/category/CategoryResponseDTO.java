package com.vinicios.ecommerce.dtos.category;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CategoryResponseDTO {
    private Long id;
    private String name;
    private String description;
    private String slug;
}
