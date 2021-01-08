package com.project.project2.controller.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.project.project2.model.PasienModel;
import com.project.project2.repository.PasienRepository;
import com.project.project2.service.PasienService;

@RestController
public class PasienApiController {

	/* API	|	CRUD	|	QUERY
	 * --------------------------
	 * POST		CREATE		INSERT
	 * GET		READ		SELECT
	 * PUT		UPDATE		UPDATE
	 * DELETE	DELETE		DROP
	 * 
	 * */
	
	@Autowired
	private PasienService pasienService;
	
	@Autowired
	private PasienRepository pasienRepository;

	@PostMapping("/post")
	public Map<String, Object> postApi(@RequestBody PasienModel pasienModel){
		
		this.pasienService.savePasien(pasienModel);
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("success", Boolean.TRUE);
		map.put("pesan", "Data berhasil masuk");
		
		return map;
	}
	
	@GetMapping("/getAll")
	@ResponseStatus(code = HttpStatus.ACCEPTED)
	public List<PasienModel> getApi(){
		List<PasienModel> pasienModelList = new ArrayList<PasienModel>();
		pasienModelList = this.pasienService.baca();
		
		return pasienModelList;
	}
	
	@PutMapping("/put")
	public Map<String, Object> putApi (@RequestBody PasienModel pasienModel){
		
		this.pasienService.update(pasienModel);
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("success", Boolean.TRUE);
		map.put("pesan", "Data berhasil diperharui");
		
		return map;
	}
	
	// Delete
	@DeleteMapping("/delete/{noPasien}")
	@ResponseStatus(code = HttpStatus.GONE)
	public Map<String, Object> deleteApi (@PathVariable String noPasien){
		
		this.pasienService.delete(this.pasienRepository.noPasien(noPasien));
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("success", Boolean.TRUE);
		map.put("pesan", "Data "+ noPasien +" berhasil dihapus");
		
		return map;
	}
	
	
}
