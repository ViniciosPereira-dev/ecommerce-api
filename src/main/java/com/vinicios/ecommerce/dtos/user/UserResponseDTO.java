package com.vinicios.ecommerce.dtos.user;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;

@Getter
@Setter
public class UserResponseDTO {
    private Long id;
    private String name;
    private String email;
    private String phone;
    private LocalDate createdAt;
    private Boolean active;
}

