package com.project.project2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.project.project2.model.LaptopModel;

// T, ID <Table, Type attr dari primary key>
public interface LaptopRepository extends JpaRepository<LaptopModel, Integer>{
	/*
	 * @Query("SELECT L FROM LaptopModel L") List<LaptopModel> readData();
	 * 
	 * // a
	 * 
	 * @Query("SELECT L FROM LaptopModel L WHERE L.MEREK LIKE ?1% ")
	 * List<LaptopModel> find(String merk);
	 * 
	 * // 1. Menampilkan satu data untuk melihat detil
	 * 
	 * @Query("SELECT L FROM LaptopModel L WHERE L.ID =?1 ") LaptopModel
	 * detilLaptop(Integer idLaptop);
	 * 
	 * // 2. Menampilkan data dengan urutan dari yang terbesar
	 * 
	 * @Query("SELECT L FROM LaptopModel L ORDER BY L.MEREK DESC") List<LaptopModel>
	 * dataLaptopDESC();
	 * 
	 */
	// 3. 
	
	// Model -> namaMethod
	
}
