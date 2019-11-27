package com.springBoot3.service;

import java.util.List;

import com.springBoot3.model.User;

public interface IUserService {
	public User read(int userId);
	public User create(User user);
	public User update(User user);
	public User delete(int userId);
	public List<User> readAll();
}
