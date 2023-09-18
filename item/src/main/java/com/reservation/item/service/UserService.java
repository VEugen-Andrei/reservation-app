package com.reservation.item.service;

import com.reservation.item.entity.User;
import com.reservation.item.model.UserDto;

import java.util.List;

public interface UserService {
    public List<UserDto> getUsers();
    public UserDto getUserById(Long id);
    public UserDto addUser(User user);
    public UserDto addProductToUser(Long userId, Long productId);
    public UserDto updateUser(Long id, User user);
    public UserDto deleteUser(Long id);
    public void deleteAll();
}