package com.vinicios.ecommerce.mappers;

import com.vinicios.ecommerce.dtos.user.UserCreateDTO;
import com.vinicios.ecommerce.dtos.user.UserResponseDTO;
import com.vinicios.ecommerce.entities.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User toEntity(UserCreateDTO dto);

    UserResponseDTO toResponseDTO(User entity);
}

