package com.springBoot3.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springBoot3.model.User;
import com.springBoot3.service.IUserService;
@Validated
@RestController
public class MainController {
	
	@Autowired
	IUserService service;
   
	@GetMapping(value="/read/{abc}")
	public User read(@PathVariable("abc") int id)
	{
		return service.read(id);
	}
	
	@GetMapping(value="/readAll")
	public List<User> readAll()
	{
		List<User> list=service.readAll();
		return list;
	}
	
	@PostMapping(value="/create")
	public User create(@Valid @RequestBody User user)
	{
		return service.create(user);
	}
	
	@PutMapping(value="/update")
	public User update(@RequestBody User user)
	{
		return service.update(user);
	}
	
	@DeleteMapping(value="/delete")
	public User delete(@RequestParam("userId")int userId)
	{
		return service.delete(userId);
	}

}
