package com.beClean.dom.dom.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.beClean.dom.dom.Entity.IndividualniPlan;

public interface IndividualniPlanRepository extends CrudRepository<IndividualniPlan, Integer>{
	
	List<IndividualniPlan>findByKorisnikId(int korisnikId);
}
