package com.vengeang.esala.services;

import java.util.List;

import com.vengeang.esala.models.User;

public interface UserService {
	List<User> getAll();
	boolean saveUser(User user);
	User getOne(Integer id);
	boolean userUpdate(User user);
	boolean delete(Integer id);
}
