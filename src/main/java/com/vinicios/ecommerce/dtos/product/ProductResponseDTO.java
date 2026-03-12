package com.vinicios.ecommerce.dtos.product;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductResponseDTO {

    private Long id;
    private String name;
    private String description;
    private Double price;
    private Integer stockQuantity;
    private Boolean active;
    private Long categoryId;

}

