package com.project.project2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AwalHalaman {
	
	// localhost:port/path/
	@RequestMapping("/formulir")
	public String formulir(){
		
		String html = "/formulir";
		return html;
	}
	
	@RequestMapping("/modal")
	public String modal(){
		
		String html = "/modal";
		return html;
	}
	
	// kalau sudah send ke W.A Japri, tampilan browser dan syntax controller
	
	// Task : Buat 3 Mapping untuk halaman Laptop, Menu, Mahasiswa
	
	// didalam template terdapat folder office, didalam office ada folder karyawan dan didalam karyawan ada karyawan.html
	
	// buatlah controller dan front endnya
	
	
	/*
	 * localhost:8282/satrioweb/ber
	 * 
	 * 
	 * */

}
