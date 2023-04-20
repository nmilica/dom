package com.beClean.dom.dom.Entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name="lista_pracenja")
public class ListaPracenja {
	@Column(name="lista_pracenja_id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int listaId;
	@Column(name="tekst_neki")
	private String tekst;
	private Date datum;
	@ManyToOne
	@JoinColumn(name="korisnik_id")
	private Korisnik korisnik;
	
	public ListaPracenja(int listaId, String tekst, Date datum, Korisnik korisnik) {
		this.listaId = listaId;
		this.tekst = tekst;
		this.datum = datum;
		this.korisnik = korisnik;
	}

	public ListaPracenja() {
	}

	public int getListaId() {
		return listaId;
	}

	public void setListaId(int listaId) {
		this.listaId = listaId;
	}

	public String getTekst() {
		return tekst;
	}

	public void setTekst(String tekst) {
		this.tekst = tekst;
	}

	public Date getDatum() {
		return datum;
	}

	public void setDatum(Date datum) {
		this.datum = datum;
	}

	public Korisnik getKorisnik() {
		return korisnik;
	}

	public void setKorisnik(Korisnik korisnik) {
		this.korisnik = korisnik;
	}
	
	
	

}
