package com.beClean.dom.dom.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beClean.dom.dom.Entity.KontrplniPregled;
import com.beClean.dom.dom.Repository.KontrolniPregledRepository;

@Service
public class KontrolniPregledService {
	@Autowired
	KontrolniPregledRepository kontrolniPregledRepository;
	
	public List<KontrplniPregled> getAllKontrplniPregled(){
		return(List<KontrplniPregled>) kontrolniPregledRepository.findAll();
	}
	
	public KontrplniPregled getKontrplniPregledById(int id) {
		Optional<KontrplniPregled>kpOptional = kontrolniPregledRepository.findById(id);
		if(!kpOptional.isPresent()) {
			throw new IllegalArgumentException("ne postoji");
		}
		return kpOptional.get();
	}

	
	public KontrplniPregled dodajPregled(KontrplniPregled kontrplniPregled) {
	return kontrolniPregledRepository.save(kontrplniPregled);
}
	public KontrplniPregled azurirajPregled(KontrplniPregled kontrplniPregled) {
		return kontrolniPregledRepository.save(kontrplniPregled);
	}
	
	public void deletePregled (int id) {
		kontrolniPregledRepository.deleteById(id);
	}
	
	public List<KontrplniPregled>getListaByKorisnik(int korisnikId){
		return kontrolniPregledRepository.findPregledByKorisnikId(korisnikId);
	}
}
