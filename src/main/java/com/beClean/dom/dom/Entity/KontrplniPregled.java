package com.beClean.dom.dom.Entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name="kontrolni_pregled")
public class KontrplniPregled {
	
	@Id
	@Column(name="kontrolni_pregled_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int kPregledId;
	@Column(name="datum_kontrolnog_pregleda")
	private Date datumKontrolnogPregleDate;
	@Column(name="neki_tekst_KP")
	private String tekst;
	
	@ManyToOne
	@JoinColumn(name="korisnik_id")
    Korisnik korisnik;
	
	public KontrplniPregled(int kPregledId, Date datumKontrolnogPregleDate, String tekst, Korisnik korisnik) {
		this.kPregledId = kPregledId;
		this.datumKontrolnogPregleDate = datumKontrolnogPregleDate;
		this.tekst = tekst;
		this.korisnik = korisnik;
		
		
	}

	public KontrplniPregled() {
	}

	public int getkPregledId() {
		return kPregledId;
	}

	public void setkPregledId(int kPregledId) {
		this.kPregledId = kPregledId;
	}

	public Date getDatumKontrolnogPregleDate() {
		return datumKontrolnogPregleDate;
	}

	public void setDatumKontrolnogPregleDate(Date datumKontrolnogPregleDate) {
		this.datumKontrolnogPregleDate = datumKontrolnogPregleDate;
	}

	public String getTekst() {
		return tekst;
	}

	public void setTekst(String tekst) {
		this.tekst = tekst;
	}

	public Korisnik getKorisnik() {
		return korisnik;
	}

	public void setKorisnik(Korisnik korisnik) {
		this.korisnik = korisnik;
	}
	
	
}
