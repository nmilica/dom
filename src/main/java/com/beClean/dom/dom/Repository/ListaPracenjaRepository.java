package com.beClean.dom.dom.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.beClean.dom.dom.Entity.ListaPracenja;


public interface ListaPracenjaRepository extends CrudRepository<ListaPracenja, Integer>{
	
	List<ListaPracenja>findByKorisnikId(int korisnikId);
	
}
