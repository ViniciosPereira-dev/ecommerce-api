package com.vinicios.ecommerce.dtos.user;

import java.time.LocalDate;

public class UserResponseDTO {
    private Long id;
    private String name;
    private String email;
    private String phone;
    private LocalDate createdAt;
    private Boolean active;
}

