package com.sbsk.service.services.user;

import com.sbsk.dtos.user.UserRequestDto;
import com.sbsk.dtos.user.UserResponseDto;

public interface UserService {

  public UserResponseDto createUser(UserRequestDto userRequestDto);

}