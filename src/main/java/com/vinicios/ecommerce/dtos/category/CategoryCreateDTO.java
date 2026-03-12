package com.vinicios.ecommerce.dtos.category;

import jakarta.validation.constraints.NotBlank;

public class CategoryCreateDTO {

    @NotBlank
    private String name;

    @NotBlank
    private String description;
}
