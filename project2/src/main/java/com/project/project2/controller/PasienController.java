package com.project.project2.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.project2.model.PasienModel;
import com.project.project2.service.PasienService;

@Controller
public class PasienController {

	@Autowired
	private PasienService pasienService;

	@RequestMapping("/pasien/list")
	public String pasienHome(Model model) {

		List<PasienModel> pasienModelList = new ArrayList<PasienModel>();
		pasienModelList = pasienService.baca();
		model.addAttribute("pasienAja", pasienModelList);

		String html = "/pasien/list";
		return html;
	}

	@RequestMapping("/pasien/detail")
	public String detailPasien(HttpServletRequest request, Model model) {
		String namaPasien = request.getParameter("kataKunciNama");

		PasienModel pasienModel = new PasienModel();
		pasienModel = this.pasienService.cariKataKunci(namaPasien);

		model.addAttribute("pasienModel", pasienModel);

		String html = "/pasien/detail";
		return html;
	}

	@RequestMapping("/pasienAdd")
	public String addPasien() {
		String html = "/pasien/add";
		return html;
	}

	@RequestMapping(value = "/pasien/create")
	public String create(HttpServletRequest request, Model model) { // request -> nerima, Model -> lempar

		String noPasien = request.getParameter("noPasien");
		String namaPasien = request.getParameter("namaPasien");
		int biayaPasien = Integer.valueOf(request.getParameter("biayaPasien"));

		// memasukkan value get parameter ke pasienModel
		PasienModel pasienModel = new PasienModel();
		pasienModel.setNoPasien(noPasien);
		pasienModel.setNamaPasien(namaPasien);
		pasienModel.setBiayaPasien(biayaPasien);

		// transaksi simpan / create
		pasienService.savePasien(pasienModel);

		model.addAttribute("pasienModel", pasienModel);

		String html = "/pasien/hasil_inser";
		return html;
	}

	@RequestMapping("/pasien/update") // url mapping
	public String update(HttpServletRequest request, Model model) {
		String pasienID = request.getParameter("pasienID");

		PasienModel pasienModel = new PasienModel();
		pasienModel = pasienService.readByID(pasienID);
		model.addAttribute("pasienModel", pasienModel);

		String html = "/pasien/update"; // location file
		return html;
	}
	
	@RequestMapping("/pasien/edit")
	public String edit(HttpServletRequest request, Model model) {
		
		String noPasien = request.getParameter("noPasien");
		String namaPasien = request.getParameter("namaPasien");
		int biayaPasien = Integer.valueOf(request.getParameter("biayaPasien"));
		
		PasienModel pasienModel = new PasienModel();
		pasienModel.setNoPasien(noPasien);
		pasienModel.setNamaPasien(namaPasien);
		pasienModel.setBiayaPasien(biayaPasien);
		
		//start update
		pasienService.update(pasienModel);
		
		model.addAttribute("pasienModel", pasienModel);
		
		this.pasienHome(model);
		
		String html = "/pasien/list";
		return html;
		
	}
	
	@RequestMapping("/pasien/delete")
	public String delete(HttpServletRequest request, Model model) {
		
		String pasienID = request.getParameter("pasienID");
		PasienModel pasienModel = new PasienModel();
		pasienModel = this.pasienService.readByID(pasienID);
		
		model.addAttribute("pasienModel",pasienModel);
		
		String html = "/pasien/delete";
		return html;
		
	}
	
	/*
	 * @RequestMapping("/pasien/hapus") public String hapus(HttpServletRequest
	 * request, Model model) { String pasienID = request.getParameter("noPasien");
	 * 
	 * this.pasienService.delete(pasienID);
	 * 
	 * this.pasienHome(model);
	 * 
	 * String html="/pasien/list";
	 * 
	 * return html; }
	 */
	

}
