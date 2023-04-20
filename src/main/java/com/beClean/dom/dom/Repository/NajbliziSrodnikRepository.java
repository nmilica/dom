package com.beClean.dom.dom.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.beClean.dom.dom.Entity.NajbliziSrodnik;

public interface NajbliziSrodnikRepository extends CrudRepository<NajbliziSrodnik, Integer>{
	
	public List<NajbliziSrodnik>findByKorisnikId(int korisnikId);

}
