package com.beClean.dom.dom.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.beClean.dom.dom.Entity.NajbliziSrodnik;
import com.beClean.dom.dom.Service.NajbliziSrodnikService;

@RestController
public class NajbliziSrodnikController {
	@Autowired
	NajbliziSrodnikService najbliziSrodnikService;
	
	@GetMapping("/srodnik")
	public List<NajbliziSrodnik> getAllNajbliziSrodnik(){
		return najbliziSrodnikService.getAllNajbliziSrodnik();
	}
	
	@GetMapping("/srodnik/{id}")
	public NajbliziSrodnik getNajbliziSrodnikById(@PathVariable int id) {
		return najbliziSrodnikService.getNajbliziSrodnikById(id);
	}

	@PutMapping("/srodnik/{id}")
    public NajbliziSrodnik azurirajSrodnika(@PathVariable int id,
    		@RequestBody NajbliziSrodnik najbliziSrodnik) {
	 return najbliziSrodnikService.izmeniSrodnika(najbliziSrodnik);
}
	
	@PostMapping("/dodajSrodnika")
	public NajbliziSrodnik dodajSrodnika(@RequestBody NajbliziSrodnik najbliziSrodnik) {
		return najbliziSrodnikService.dodajSrodnika(najbliziSrodnik);
	}
	
	@DeleteMapping("/deleteSrodnik/{id}")
	public void  deleteSrodnik(@PathVariable int id) {
		najbliziSrodnikService.deleteSrodnik(id);
	}
	
	@GetMapping("/srodnikZaKorisnika/{id}")
	public List<NajbliziSrodnik>getSrodnikByKorisnik(@PathVariable int id){
		return najbliziSrodnikService.getSrodnikByKorisnikId(id);
	}
}
