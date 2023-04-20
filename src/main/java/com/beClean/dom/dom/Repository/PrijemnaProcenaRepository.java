package com.beClean.dom.dom.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.beClean.dom.dom.Entity.PrijemnaProcena;

public interface PrijemnaProcenaRepository extends CrudRepository<PrijemnaProcena, Integer>{
	
	List<PrijemnaProcena>findByKorisnikId(int korisnikId);

}
