package com.beClean.dom.dom.Entity;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity(name="korisnik")
public class Korisnik {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="korisnik_id")
	private int id;
	private String ime,prezime;
	public enum pol {zenski, muski};
	@Enumerated(EnumType.STRING)
	private pol pol;
	private String adresa;
	@Column(name="datum_rodjenja")
	private Date datumRodjenja;
	public enum daLiJePodStarateljStvom {da, ne};
	@Enumerated(EnumType.STRING)
	@Column(name="da_li_je_pod_starateljstvom")
	private daLiJePodStarateljStvom daLiJePodStarateljStvom;
	@Column(name = "mentalno_zdravlje")
	private String mentalnoZdravlje;
	@Column(name="stepen_funkcionalne_zavisnosti")
	private String stepenFunkcionalneZavisnosti;
	public enum status {aktivan, pasivan};
	@Enumerated(EnumType.STRING)
	private status status;
	private String napomena;

	@OneToOne(mappedBy = "korisnik")
	private IndividualniPlan individualniPlan;
	
	@OneToMany(mappedBy = "korisnik")// jedan korisnik moze da ima vise pregleda
    private List<KontrplniPregled> listaKontrolnihPregleda;
	
	@OneToMany(mappedBy = "korisnik")
	private List<ListaPracenja>listePracenja;
	
	@OneToOne(mappedBy = "korisnik")
	private NajbliziSrodnik najbliziSrodnik;
	
	@OneToOne(mappedBy = "korisnik")
	private PrijemnaProcena prijemnaProcena;
	

	public Korisnik(int id, String ime, String prezime, pol pol, String adresa,
			Date datumRodjenja, daLiJePodStarateljStvom daLiJePodStarateljStvom,
			String mentalnoZdravlje, String stepenFunkcionalneZavisnosti,
			status status, String napomena) {
		
		this.id = id;
		this.ime = ime;
		this.prezime = prezime;
		this.pol = pol;
		this.adresa = adresa;
		this.datumRodjenja = datumRodjenja;
		this.daLiJePodStarateljStvom = daLiJePodStarateljStvom;
		this.mentalnoZdravlje = mentalnoZdravlje;
		this.stepenFunkcionalneZavisnosti = stepenFunkcionalneZavisnosti;
		this.status = status;
		this.napomena = napomena;
	}

	public Korisnik() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public pol getPol() {
		return pol;
	}

	public void setPol(pol pol) {
		this.pol = pol;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public Date getDatumRodjenja() {
		return datumRodjenja;
	}

	public void setDatumRodjenja(Date datumRodjenja) {
		this.datumRodjenja = datumRodjenja;
	}

	public daLiJePodStarateljStvom getDaLiJePodStarateljStvom() {
		return daLiJePodStarateljStvom;
	}


	public void setDaLiJePodStarateljStvom(daLiJePodStarateljStvom daLiJePodStarateljStvom) {
		this.daLiJePodStarateljStvom = daLiJePodStarateljStvom;
	}

	public String getMentalnoZdravlje() {
		return mentalnoZdravlje;
	}

	public void setMentalnoZdravlje(String mentalnoZdravlje) {
		this.mentalnoZdravlje = mentalnoZdravlje;
	}

	public String getStepenFunkcionalneZavisnosti() {
		return stepenFunkcionalneZavisnosti;
	}

	public void setStepenFunkcionalneZavisnosti(String stepenFunkcionalneZavisnosti) {
		this.stepenFunkcionalneZavisnosti = stepenFunkcionalneZavisnosti;
	}

	public status getStatus() {
		return status;
	}

	public void setStatus(status status) {
		this.status = status;
	}

	public String getNapomena() {
		return napomena;
	}

	public void setNapomena(String napomena) {
		this.napomena = napomena;
	}
}
