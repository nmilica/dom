package com.beClean.dom.dom.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.beClean.dom.dom.Entity.Korisnik;

public interface KorisnikRepository extends CrudRepository<Korisnik, Integer> {
	
    @Query("SELECT k FROM korisnik k WHERE k.pol = 'zenski'")
    List<Korisnik> findKorisnikZenski();
    
    @Query("SELECT k FROM korisnik k WHERE k.pol = 'muski'")
    List<Korisnik> findKorisnikMuski();

    
    @Query("SELECT k FROM korisnik k WHERE TIMESTAMPDIFF(YEAR, k.datumRodjenja, CURRENT_DATE) < 85")
    List<Korisnik> findKorisniciYoungerThan85();

    @Query("SELECT k FROM korisnik k WHERE k.pol = 'zenski' AND TIMESTAMPDIFF(YEAR, k.datumRodjenja, CURRENT_DATE) < 85")
    List<Korisnik> findZeneMladjeOd85();

}
