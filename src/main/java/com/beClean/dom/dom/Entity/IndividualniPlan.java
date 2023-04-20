package com.beClean.dom.dom.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity(name="individualni_plan")
public class IndividualniPlan {
	@Id
	@Column(name="individualni_plan_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int individualniPlanId;
	
	@Column(name="individualni_plan")
	private String individualniPlan;
	
	
	@OneToOne
	@JoinColumn(name="korisnik_id")
	Korisnik korisnik;


	public IndividualniPlan(int individualniPlanId, String individualniPlan, Korisnik korisnik) {
		this.individualniPlanId = individualniPlanId;
		this.individualniPlan = individualniPlan;
		this.korisnik = korisnik;
	}


	public IndividualniPlan() {
	}


	public int getIndividualniPlanId() {
		return individualniPlanId;
	}


	public void setIndividualniPlanId(int individualniPlanId) {
		this.individualniPlanId = individualniPlanId;
	}


	public String getIndividualniPlan() {
		return individualniPlan;
	}


	public void setIndividualniPlan(String individualniPlan) {
		this.individualniPlan = individualniPlan;
	}


	public Korisnik getKorisnik() {
		return korisnik;
	}


	public void setKorisnik(Korisnik korisnik) {
		this.korisnik = korisnik;
	}

	
}
