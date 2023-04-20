package com.beClean.dom.dom.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beClean.dom.dom.Entity.PrijemnaProcena;
import com.beClean.dom.dom.Repository.PrijemnaProcenaRepository;

@Service
public class PrijemnaProcenaService {
	@Autowired
	PrijemnaProcenaRepository prijemnaProcenaRepository;
	
	public List<PrijemnaProcena> getAllPrijemnaProcena (){
		return(List<PrijemnaProcena>) prijemnaProcenaRepository.findAll();
	}
	
	public PrijemnaProcena getProcenaById(int id) {
		Optional<PrijemnaProcena>ppOptional = prijemnaProcenaRepository.findById(id);
		if(!ppOptional.isPresent()) {
			throw new IllegalArgumentException("ne postoji");
		}
		return ppOptional.get();
	}

	public PrijemnaProcena izmeniProcenu( PrijemnaProcena prijemnaProcena) {
		return prijemnaProcenaRepository.save(prijemnaProcena);
	}

	
	public PrijemnaProcena dodajProcenu( PrijemnaProcena prijemnaProcena) {
		return prijemnaProcenaRepository.save(prijemnaProcena);
	}
	
	public void deleteProcena(int id) {
		prijemnaProcenaRepository.deleteById(id);
	}
	
	public List<PrijemnaProcena> getProcenaByKorisnikId(int id){
		return prijemnaProcenaRepository.findByKorisnikId(id);
	}
}
