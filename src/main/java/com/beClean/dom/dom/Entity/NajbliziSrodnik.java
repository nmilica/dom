package com.beClean.dom.dom.Entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity(name="najblizi_srodnik")
public class NajbliziSrodnik {
	
	@Column(name="najblizi_srodnik_id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int srodnik_id;
	
	private String ime, prezime;
	private int telefon;
	private String adresa;
	@OneToOne
	@JoinColumn(name="korisnik_id")
	private Korisnik korisnik;
	
	public NajbliziSrodnik(int srodnik_id, String ime, String prezime, int telefon, String adresa, Korisnik korisnik) {
		this.srodnik_id = srodnik_id;
		this.ime = ime;
		this.prezime = prezime;
		this.telefon = telefon;
		this.adresa = adresa;
		this.korisnik = korisnik;
	}

	public NajbliziSrodnik() {
	}

	public int getSrodnik_id() {
		return srodnik_id;
	}

	public void setSrodnik_id(int srodnik_id) {
		this.srodnik_id = srodnik_id;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public int getTelefon() {
		return telefon;
	}

	public void setTelefon(int telefon) {
		this.telefon = telefon;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public Korisnik getKorisnik() {
		return korisnik;
	}

	public void setKorisnik(Korisnik korisnik) {
		this.korisnik = korisnik;
	}
	
	
	
	
}
