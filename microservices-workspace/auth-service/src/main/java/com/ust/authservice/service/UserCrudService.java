package com.ust.authservice.service;

import com.ust.authservice.dto.UserDtoResponse;
import com.ust.authservice.model.UserModel;

public interface UserCrudService {

    public UserDtoResponse saveUser(UserModel user);

}
