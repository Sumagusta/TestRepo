package com.project.project2.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="T_PASIEN")
public class PasienModel {
	
	@Id
	@Column(name="T_NO_PASIEN")
	private String noPasien;
	
	@Column(name="T_NAMA_PASIEN")
	private String namaPasien;
	
	@Column(name="T_GENDER_PASIEN")
	private String genderPasien;
	
	@Column(name="T_KATEGORI_PASIEN")
	private String kategoriPasien;
	
	@Column(name="T_BIAYA")
	private int biayaPasien;
	
	@Column(name="T_TANGGAL")
	private Date tanggalLahir;
	
	public String getNoPasien() {
		return noPasien;
	}

	public void setNoPasien(String noPasien) {
		this.noPasien = noPasien;
	}

	public String getNamaPasien() {
		return namaPasien;
	}

	public void setNamaPasien(String namaPasien) {
		this.namaPasien = namaPasien;
	}

	public String getGenderPasien() {
		return genderPasien;
	}
	
	public void setGenderPasien(String genderPasien) {
		this.genderPasien = genderPasien;
	}

	public String getKategoriPasien() {
		return kategoriPasien;
	}

	public void setKategoriPasien(String kategoriPasien) {
		this.kategoriPasien = kategoriPasien;
	}

	public int getBiayaPasien() {
		return biayaPasien;
	}

	public void setBiayaPasien(int biayaPasien) {
		this.biayaPasien = biayaPasien;
	}

	public Date getTanggalLahir() {
		return tanggalLahir;
	}

	public void setTanggalLahir(Date tanggalLahir) {
		this.tanggalLahir = tanggalLahir;
	}

	
	
}
