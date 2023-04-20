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

import com.beClean.dom.dom.Entity.ListaPracenja;
import com.beClean.dom.dom.Service.ListaPracenjaService;

@RestController
public class ListaPracenjaController {
	@Autowired
	ListaPracenjaService listaPracenjaService;
	
	@GetMapping("/lista")
	public List<ListaPracenja> getAllList(){
		return listaPracenjaService.getAllLists();
	}
	@GetMapping("/lista/{id}")
    public ListaPracenja getListaById(@PathVariable int id) {
    	return listaPracenjaService.getListaById(id);
    }
	
	@PostMapping("/dodajListu")
	public ListaPracenja dodajListu(@RequestBody ListaPracenja listaPracenja) {
		return listaPracenjaService.dodajListu(listaPracenja);
	}
	
	@PutMapping("/azurirajListu/{id}")
	public ListaPracenja azurirajListu(@PathVariable int id,
			@RequestBody ListaPracenja listaPracenja) {
		
		return listaPracenjaService.azurirajListu(listaPracenja);
	}
	
	@DeleteMapping("/brisiListu/{id}")
	public void deleteListu(@PathVariable int id) {
	listaPracenjaService.deleteListu(id);
	}
	
	@GetMapping("/listaPracenjaZaKorisnika/{korisnikId}")
	public List<ListaPracenja> getListaByKorisnik(@PathVariable int korisnikId){
		return listaPracenjaService.getListaByKorisnikId(korisnikId);
	}
}
