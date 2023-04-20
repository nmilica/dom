package com.beClean.dom.dom.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.beClean.dom.dom.Entity.IndividualniPlan;
import com.beClean.dom.dom.Repository.IndividualniPlanRepository;


@Service
public class IndividualniPlanService {
	
@Autowired
	IndividualniPlanRepository individualniPlanRepository;

public List<IndividualniPlan> getAllIndividualniPlan(){
	return (List<IndividualniPlan>) individualniPlanRepository.findAll();
	
}

public IndividualniPlan getIndividualniPlanById(int id) {
	Optional<IndividualniPlan>ipOptional = individualniPlanRepository.findById(id);
	if (!ipOptional.isPresent()) {
		throw new IllegalArgumentException("Individualni plan sa :  " + id + " ne postoji u bazi");
	}
	return ipOptional.get();
}

//put je azuriraj moras da imas i path i bodi i id
	public IndividualniPlan izmeniPlan( IndividualniPlan individualniPlan) {
		return individualniPlanRepository.save(individualniPlan);
	}


// dodaj plan
   public IndividualniPlan dodajIndividualniPlan(@RequestBody IndividualniPlan individualniPlan) {
	return individualniPlanRepository.save(individualniPlan);
}
   
  public List<IndividualniPlan> planZaKorisnika(int id){
	  return individualniPlanRepository.findByKorisnikId(id);
  }
}


