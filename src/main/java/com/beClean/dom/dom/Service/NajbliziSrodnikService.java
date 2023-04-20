package com.beClean.dom.dom.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beClean.dom.dom.Entity.NajbliziSrodnik;
import com.beClean.dom.dom.Repository.NajbliziSrodnikRepository;

@Service
public class NajbliziSrodnikService {
	@Autowired
	NajbliziSrodnikRepository najbliziSrodnikRepository;
	
	public List<NajbliziSrodnik> getAllNajbliziSrodnik(){
		return (List<NajbliziSrodnik>) najbliziSrodnikRepository.findAll();
	}
   public NajbliziSrodnik getNajbliziSrodnikById(int id) {
	   Optional<NajbliziSrodnik>nOptional = najbliziSrodnikRepository.findById(id);
	   if(!nOptional.isPresent()) {
		   throw new IllegalArgumentException("ne postoji");
	   }
	   return nOptional.get();
   }
   
   public NajbliziSrodnik izmeniSrodnika( NajbliziSrodnik najbliziSrodnik) {
		return najbliziSrodnikRepository.save(najbliziSrodnik);
	}

	
	public NajbliziSrodnik dodajSrodnika( NajbliziSrodnik najbliziSrodnik) {
		return najbliziSrodnikRepository.save(najbliziSrodnik);
	}
	
	public void deleteSrodnik (int id) {
		najbliziSrodnikRepository.deleteById(id);
	}
	public List<NajbliziSrodnik>getSrodnikByKorisnikId(int korisnikId){
		return najbliziSrodnikRepository.findByKorisnikId(korisnikId);
	}
}
