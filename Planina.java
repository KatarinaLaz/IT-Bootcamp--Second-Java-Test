package java_test;

public class Planina {

//	(10 poena) Kreirati klasu ​Planina ​koja od privatnih atributa ima: 
//	ime planine 
//	naziv države u kojoj se nalazi 
//	visinu planine. 
//	a od javnih metoda: 
//	default-ni konstruktor i konstuktor koji postavlja sve parametre 
//	gettere i settere za sve atribute 
	
	private String imePlanine;
	private String drzava;
	private double visinaPlanine;
	
	public Planina() {
		
	}

	public Planina(String imePlanine, String drzava, double visinaPlanine) {
		super();
		this.imePlanine = imePlanine;
		this.drzava = drzava;
		this.visinaPlanine = visinaPlanine;
	}

//	GETTERS & SETTERS
	
	public String getImePlanine() {
		return imePlanine;
	}

	public String getDrzava() {
		return drzava;
	}

	public double getVisinaPlanine() {
		return visinaPlanine;
	}
	
	
	
	
	
	
	
	
	
}
