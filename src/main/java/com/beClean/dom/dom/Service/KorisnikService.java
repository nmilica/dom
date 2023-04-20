package com.beClean.dom.dom.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.beClean.dom.dom.Entity.Korisnik;
import com.beClean.dom.dom.Repository.KorisnikRepository;

@Service
public class KorisnikService {
	@Autowired
	KorisnikRepository korisnikRepository;
	
	public List<Korisnik>getAllKorisniks(){
		return (List<Korisnik>)korisnikRepository.findAll();
	}
	
	public Korisnik getKorisnikById(int id) {
		Optional<Korisnik>kOptional = korisnikRepository.findById(id);
		if (!kOptional.isPresent()) {
			throw new IllegalArgumentException("korisnik sa id:  " + id + " ne postoji u bazi");
		}
		return kOptional.get();
	}
	
	public Korisnik izmeniKorisnika( Korisnik korisnik) {
		return korisnikRepository.save(korisnik);
	}

	
	public Korisnik dodajKorisnika( Korisnik korisnik) {
		return korisnikRepository.save(korisnik);
	}
	
	public void deleteKorisnik(int id) {
		korisnikRepository.deleteById(id);
	}
	
	public int brojKorisnika() {
		return (int)korisnikRepository.count();
	}
	public List<Korisnik> getAllZene() {
		return korisnikRepository.findKorisnikZenski();
	}
	public List<Korisnik>getAllMuskarci(){
		return korisnikRepository.findKorisnikMuski();
	}
	
	public List<Korisnik> getAllMladjiOd85(){
		return korisnikRepository.findKorisniciYoungerThan85();
	}
	public List<Korisnik> getAllZeneMladjeOd85(){
		return korisnikRepository.findZeneMladjeOd85();
	}
}
