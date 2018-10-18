package com.capgemini.uas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MacController {
	
	//@Autowired
	/*private GService gService;*/
	
	
	@ExceptionHandler(Exception.class)
	public String handleError(Exception e) {
		//send email to control center
		System.out.println(e.getMessage());
		return "dataerror";
	}
}
