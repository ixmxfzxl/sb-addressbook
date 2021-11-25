package com.bridgelabz.addressbook.service;

import com.bridgelabz.addressbook.dto.UserDTO;
import com.bridgelabz.addressbook.model.User;

import java.util.List;


public interface IUserService {
    User saveUser(UserDTO userDTO);
    List<User> fetchUsers();
}