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

import com.beClean.dom.dom.Entity.Korisnik;
import com.beClean.dom.dom.Service.KorisnikService;

@RestController
public class KorisnikController {
	@Autowired
	KorisnikService korisnikService;
	
	@GetMapping("/korisnici")
	public List<Korisnik> getAKorisniks(){
		return (List<Korisnik>)korisnikService.getAllKorisniks();
	}
	
	@GetMapping("/korisnik/{id}")
	public Korisnik getKorisnikById(@PathVariable int id) {
		return korisnikService.getKorisnikById(id);
	}
	
	@PutMapping("/korisnik/{id}")
      public Korisnik azurirajKorisnika(@PathVariable int id, @RequestBody Korisnik korisnik) {
	 return korisnikService.izmeniKorisnika(korisnik);
}
	
	@PostMapping("/dodajKorisnika")
	public Korisnik dodajKorisnika(@RequestBody Korisnik korisnik) {
		return korisnikService.dodajKorisnika(korisnik);
	}
	
	@DeleteMapping("/deleteKorisnik/{id}")
	public void  deleteKorisnik(@PathVariable int id) {
		korisnikService.deleteKorisnik(id);
	}
	@GetMapping("/brojKorisnika")
	public int brojKorisnika() {
		return korisnikService.brojKorisnika();
	}
	
	@GetMapping("/zene")
	public List<Korisnik> getAllZene() {
		return korisnikService.getAllZene();
	}
	
	@GetMapping("/muskarci")
	public List<Korisnik> getAllMuskarci(){
		return korisnikService.getAllMuskarci();
	}
	
	@GetMapping("/mladjiOd85")
	public List<Korisnik> getAllMladjiOd85(){
		return korisnikService.getAllMladjiOd85();
	}
	
	@GetMapping("/zeneMladjeOd85")
	public  List<Korisnik> getAllZeneMladjeOd() {
		return korisnikService.getAllZeneMladjeOd85();
		
	}
}
