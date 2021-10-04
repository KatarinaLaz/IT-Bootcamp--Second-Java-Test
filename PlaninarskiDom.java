package java_test;

import java.util.ArrayList;

public class PlaninarskiDom {

//	(25 poena) Kreirati klasu ​PlaninarskiDom​ koja ima privatne atribute: 
//	naziv doma 
//	godinu kada je osnovan. 
//	članove doma koji su planinari (klasa vodi računa o nizu) 
//	Dok od javnih: 
//	default-ni konstuktor i konstuktor koji postavlja sve parametre 
//	gettere i settere koji su potrebni 
	
	private String imeDoma;
	private int godinaOsnivanja;
	ArrayList<Planinar> planinari = new ArrayList<Planinar>();
	
	public PlaninarskiDom () {
		
	}

	public PlaninarskiDom(String imeDoma, int godinaOsnivanja) {
		this.imeDoma = imeDoma;
		this.godinaOsnivanja = godinaOsnivanja;
	}
//	metodu učlani planinara, koja dodaje planinara u niz 
//	metodu koja ​vraća ​broj planinara koji će se uspešno popeti na planinu (metoda za parametar prima Planinu za koju se proverava informacija) 
//	metodu koja izbacuje planinara iz planinarskog doma prema identifikacionom broju 
//	metodu koja štampa podatke o domu i o svim članovima doma
//	metodu koja racuna i vraca mesecni prihod od clanarina svih planinara

//	METODE
	
	public void uclaniPlaninara(Planinar planinar) {
		planinari.add(planinar);
	}
	
	public int uspesniPlaninari(Planina planina) {
		int count = 0;
		for (int i = 0; i < planinari.size(); i++) {
			if (planinari.get(i).jeUspesanUspon(planina) == true)
				count++;
		}
		return count;
	}
	
	public void izbaciPlaninara(int id) {
		for (int i = 0; i < planinari.size(); i++) {
			if (planinari.get(i).getIdentifikacioniBroj() == id) {
				planinari.remove(i);
			}
		}
	}
	
	public void stampa() {
		System.out.println("Ime doma: " + imeDoma);
		System.out.println("Godina osnivanja doma: " + godinaOsnivanja);
		System.out.println("Mesecni prihod od clanarina je " + this.mesecniPrihodOdClanarine() + " din.");
		System.out.println();
		System.out.println("Clanovi doma: ");
		for (int i = 0; i < planinari.size(); i++) {
			planinari.get(i).stampaj();
		}
	}
	
	public double mesecniPrihodOdClanarine() {
		double prihod = 0;
		for (int i = 0; i < planinari.size(); i++) {
			prihod = prihod + planinari.get(i).clanarina();
		}
		return prihod;
	}

//	GETTERS & SETTERS
	
	public String getImeDoma() {
		return imeDoma;
	}

	public int getGodinaOsnivanja() {
		return godinaOsnivanja;
	}
	
	
	
	
	
	
	
	
	
	
}
