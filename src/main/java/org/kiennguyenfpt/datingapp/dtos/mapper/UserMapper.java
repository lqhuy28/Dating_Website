package org.kiennguyenfpt.datingapp.dtos.mapper;

import org.kiennguyenfpt.datingapp.dtos.responses.UserResponse;
import org.kiennguyenfpt.datingapp.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    @Mapping(source = "password", target = "password")
    UserResponse userToUserResponse(User user, String password);
}
