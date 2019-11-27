package com.springBoot3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springBoot3.dao.IUserDAO;
import com.springBoot3.model.User;

@Service
public class UserService implements IUserService {
	@Autowired
	IUserDAO dao;

	@Override
	public User read(int userId) {
		 return dao.findByUserId(userId);
	}

	@Override
	public User create(User user) {
		return dao.save(user);

}

	@Override
	public User update(User user) {
		return dao.save(user);
	}
	
	public User delete(int userId)
	{
		User user=dao.findByUserId(userId);
		if(user!=null)
		    dao.deleteById(userId);
		return user;
	}
	public List<User> readAll()
	{
		return (List<User>) dao.findAll();
	}
}
	
