package com.beClean.dom.dom.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.beClean.dom.dom.Entity.IndividualniPlan;
import com.beClean.dom.dom.Service.IndividualniPlanService;

@RestController
public class IndividualniPlanController {
	
	@Autowired
	IndividualniPlanService individualniPlanService;
	
	@GetMapping("/IndividualniPlanovi")
	public List<IndividualniPlan> getAllIndividualniPlan(){
		return individualniPlanService.getAllIndividualniPlan();
	}
	
	@GetMapping("/ip/{id}")
	public IndividualniPlan getIndividualniPlanById(@PathVariable int id){	
		return individualniPlanService.getIndividualniPlanById(id);
	}
	
	@PutMapping("/plan/{id}")
    public IndividualniPlan azurirajIndividualniPlan(@PathVariable int id, @RequestBody IndividualniPlan individualniPlan) {
	 return individualniPlanService.izmeniPlan(individualniPlan);
}
	
	@PostMapping("/dodajPlan")
	public IndividualniPlan dodajIndividualniPlan(@RequestBody IndividualniPlan individualniPlan) {
		return individualniPlanService.dodajIndividualniPlan(individualniPlan);
	}
	
	@GetMapping("/planZaKorisnika/{id}")
 public List<IndividualniPlan> planZaKorisnika(@PathVariable int id){
	 return individualniPlanService.planZaKorisnika(id);
 }
}
