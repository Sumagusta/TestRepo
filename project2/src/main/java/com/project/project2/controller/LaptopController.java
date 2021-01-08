package com.project.project2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LaptopController {

	@RequestMapping("/laptop/list")
	public String listLaptop() {
		String html = "/laptop/list";
		return html;
	}
	
	
	
}
