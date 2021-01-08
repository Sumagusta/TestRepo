package com.project.project2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.project.project2.model.LaptopModel;
import com.project.project2.model.PasienModel;

public interface PasienRepository extends JpaRepository<PasienModel, String> {
	
	@Query("SELECT P FROM PasienModel P WHERE P.namaPasien = ?1")
	PasienModel cariKataKunci(String namaPasien);
	
	@Query("SELECT P FROM PasienModel P WHERE P.noPasien = ?1")
	PasienModel noPasien(String noPasien);
	
	// 3. Menampilkan data pasien yang membayar biaya perawatan > ?1
	@Query("SELECT P FROM PasienModel P WHERE P.biayaPasien > ?1")
	List<LaptopModel> dataLaptop(int biayaPasien);
	
	// 4. Menampilkan data pasien yang membayar biaya perawatan < 1000000
	@Query("SELECT P FROM PasienModel P WHERE P.biayaPasien < ?1")
	List<LaptopModel> data2Laptop(int biayaPasien);
	
	
	
}
