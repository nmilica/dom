package com.beClean.dom.dom.Entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity(name="prijemna_procena")
public class PrijemnaProcena {
	@Column(name="prijemna_procena_id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int procena_id;
	
	@Column(name="datum_dolaska_u_dom")
	private Date datumDolaska;
	@Column(name="procena_na_prijemu")
	private String procenaNaprijemu;
	@OneToOne
	@JoinColumn(name="korisnik_id")
	private Korisnik korisnik;
	
	public PrijemnaProcena(int procena_id, Date datumDolaska, String procenaNaprijemu, Korisnik korisnik) {
		this.procena_id = procena_id;
		this.datumDolaska = datumDolaska;
		this.procenaNaprijemu = procenaNaprijemu;
		this.korisnik = korisnik;
	}

	public PrijemnaProcena() {
	}

	public int getProcena_id() {
		return procena_id;
	}

	public void setProcena_id(int procena_id) {
		this.procena_id = procena_id;
	}

	public Date getDatumDolaska() {
		return datumDolaska;
	}

	public void setDatumDolaska(Date datumDolaska) {
		this.datumDolaska = datumDolaska;
	}

	public String getProcenaNaprijemu() {
		return procenaNaprijemu;
	}

	public void setProcenaNaprijemu(String procenaNaprijemu) {
		this.procenaNaprijemu = procenaNaprijemu;
	}

	public Korisnik getKorisnik() {
		return korisnik;
	}

	public void setKorisnik(Korisnik korisnik) {
		this.korisnik = korisnik;
	}
	
	

}
