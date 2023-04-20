package com.beClean.dom.dom.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.beClean.dom.dom.Entity.KontrplniPregled;

public interface KontrolniPregledRepository extends CrudRepository<KontrplniPregled, Integer> {
	
	List<KontrplniPregled>findPregledByKorisnikId(int korisnikId);

}
