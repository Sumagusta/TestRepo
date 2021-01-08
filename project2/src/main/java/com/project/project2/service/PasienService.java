package com.project.project2.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.project2.model.PasienModel;
import com.project.project2.repository.PasienRepository;

@Service
@Transactional
public class PasienService {
	
	// Depencies Injection
	@Autowired 
	private PasienRepository pasienRepository;
	
	public List<PasienModel> baca() {
		return pasienRepository.findAll();
	}
	
	public PasienModel cariKataKunci(String namaPasien) {
		return this.pasienRepository.cariKataKunci(namaPasien);
	}
	
	public void savePasien(PasienModel pasienModel) {
		pasienRepository.save(pasienModel);
	}
	
	public void update(PasienModel pasienModel) {
		pasienRepository.save(pasienModel);
	}
	
	public PasienModel readByID(String idPasien) {
		return pasienRepository.noPasien(idPasien);
	}
	
	/*
	 * public void delete(String noPasien) { pasienRepository.deleteById(noPasien);;
	 * }
	 */
	
	public void delete(PasienModel pasienModel) {
		pasienRepository.delete(pasienModel);
	}
	
}
