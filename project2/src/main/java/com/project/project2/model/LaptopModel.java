package com.project.project2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="T_LAPTOP")
public class LaptopModel {

	@Id
	@Column(name="ID")
	private Integer id;
	
	@Column(name="MEREK")
	private String merk;
	
	@Column(name="SERI_LAPTOP")
	private String seriLaptop;
	
	
	public int getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMerk() {
		return merk;
	}
	public void setMerk(String merk) {
		this.merk = merk;
	}
	public String getSeriLaptop() {
		return seriLaptop;
	}
	public void setSeriLaptop(String seriLaptop) {
		this.seriLaptop = seriLaptop;
	}
	
	// get & set
	
	
}
