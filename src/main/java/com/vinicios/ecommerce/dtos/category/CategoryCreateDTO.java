package com.vinicios.ecommerce.dtos.category;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CategoryCreateDTO {

    @NotBlank
    private String name;

    @NotBlank
    private String description;
}
