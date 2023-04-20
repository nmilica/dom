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

import com.beClean.dom.dom.Entity.KontrplniPregled;
import com.beClean.dom.dom.Service.KontrolniPregledService;

@RestController
public class KontrolniPregledController {
	@Autowired
	KontrolniPregledService kontrolniPregledService;
	
	@GetMapping("/kPregled")
	public List<KontrplniPregled> getAllKontrplniPregled(){
		return kontrolniPregledService.getAllKontrplniPregled();
	}
	
	@GetMapping("/pregled/{id}")
	public KontrplniPregled getPregledById(@PathVariable int id) {
		return kontrolniPregledService.getKontrplniPregledById(id);
	}

	@PostMapping("/dodajPregled")
	public KontrplniPregled dodajKontrplniPregled(@RequestBody KontrplniPregled kontrplniPregled) {
		return kontrolniPregledService.dodajPregled(kontrplniPregled);
	}
	
	@PutMapping("/azuriraj/{id}")
	public KontrplniPregled azurirajpregled(@PathVariable int id,
			@RequestBody KontrplniPregled kontrplniPregled) {
		
		return kontrolniPregledService.azurirajPregled(kontrplniPregled);
	}
	
	@DeleteMapping("/brisiPregled/{id}")
	public void deletePregled(@PathVariable int id) {
		kontrolniPregledService.deletePregled(id);
	}
	
	@GetMapping("/pregledZaKorisnika/{id}")
	public List<KontrplniPregled> getPreglrdByKorisnik(@PathVariable int id){
		return kontrolniPregledService.getListaByKorisnik(id);
	}
	
}
