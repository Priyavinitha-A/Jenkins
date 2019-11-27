package com.springBoot3.dao;

import org.springframework.data.repository.CrudRepository;

import com.springBoot3.model.User;

public interface IUserDAO extends CrudRepository<User, Integer> {

	User findByUserId(int userId);

}
