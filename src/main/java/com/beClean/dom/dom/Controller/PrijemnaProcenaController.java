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

import com.beClean.dom.dom.Entity.PrijemnaProcena;
import com.beClean.dom.dom.Service.PrijemnaProcenaService;

@RestController
public class PrijemnaProcenaController {
	@Autowired
	PrijemnaProcenaService prijemnaProcenaService;
	
	@GetMapping("/pProcena")
	public List<PrijemnaProcena> getAllPrijemnaProcenas(){
		return prijemnaProcenaService.getAllPrijemnaProcena();
	}
	
	@GetMapping("/procena/{id}")
    public PrijemnaProcena getProcenaById(@PathVariable int id) {
    	return prijemnaProcenaService.getProcenaById(id);
    }
	
	@PutMapping("/procena/{id}")
    public PrijemnaProcena azurirajProcenu(@PathVariable int id,
    		@RequestBody PrijemnaProcena prijemnaProcena) {
	 return prijemnaProcenaService.izmeniProcenu(prijemnaProcena);
}
	
	@PostMapping("/dodajProcenu")
	public PrijemnaProcena dodajProcenu(@RequestBody PrijemnaProcena prijemnaProcena) {
		return prijemnaProcenaService.dodajProcenu(prijemnaProcena);
	}
	
	@DeleteMapping("/deleteProcenu/{id}")
	public void  deleteProcenu(@PathVariable int id) {
		prijemnaProcenaService.deleteProcena(id);
	}
	
	@GetMapping("/procenaZaKorisnika/{id}")
	public List<PrijemnaProcena>getProcenaByKorisnikId(@PathVariable int id){
		return prijemnaProcenaService.getProcenaByKorisnikId(id);
	}
}
