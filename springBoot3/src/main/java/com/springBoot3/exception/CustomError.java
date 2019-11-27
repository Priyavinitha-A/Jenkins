package com.springBoot3.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;

import java.time.LocalDateTime;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class CustomError {
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date date;
	private String message;
	private String details;
	
	//constructor
	public CustomError(Date date, String message, String details) {
		super();
		this.date = date;
		this.message = message;
		this.details = details;
}
}
