package com.vengeang.esala.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vengeang.esala.models.User;
import com.vengeang.esala.repositories.UsersRepository;
import com.vengeang.esala.services.UserService;

@Service
public class UsersServiceImplementation implements UserService{
	

	private UsersRepository userRepository;
	
	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		
//		Business rule  
		
		return this.userRepository.getAll();
	}

	@Override
	public boolean saveUser(User user) {
		// TODO Auto-generated method stub
		return this.userRepository.saveUser(user);
	}

	@Override
	public User getOne(Integer id) {
		// TODO Auto-generated method stub
		return this.userRepository.getOne(id);
	}

	@Override
	public boolean userUpdate(User user) {
		// TODO Auto-generated method stub
		return this.userRepository.updateUser(user);
	}

	@Override
	public boolean delete(Integer id) {
		// TODO Auto-generated method stub

		return this.userRepository.delete(id);
	}

}
