package com.project.project2.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.project2.model.LaptopModel;
import com.project.project2.repository.LaptopRepository;

@Service
@Transactional
public class LaptopService {
	
	@Autowired
	private LaptopRepository laptopRepository;

	/*
	 * public List<LaptopModel> bacaData() { return
	 * this.laptopRepository.readData(); }
	 */
	
}
