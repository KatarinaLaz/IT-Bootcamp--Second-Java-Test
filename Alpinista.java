package java_test;

public class Alpinista extends Planinar {


//	(20 poena) Kreirati klasu ​Alpinista ​koja nasleđuje klasu Planinar.
//	Klasa sadrži atribut koji pamti koliko poena je alpinista ostvario (celobrojna vrednost) i poeni se mogu menjati.
//	Alpinista može da savlada sve uspone do 4000 metara, placa clanarinu u iznosu od 1500 pritom za svaki poen ima popust od 50,
//	a informacije o alpinisti se ispisuju u formatu: 
//	Alpinista, id: (id) ime: (ime i rezime) Broj poena: (poeni) 
	
	private int poeni;
	
	public Alpinista(int identifikacioniBroj, String ime, int poeni) {
		super(identifikacioniBroj, ime);
		this.poeni = poeni;
	}

//	METODE
	
	@Override
	public void stampaj() {
		System.out.println("Id: " + identifikacioniBroj);
		System.out.println("Ime: " + ime);
		System.out.println("Broj poena: " + poeni);
		System.out.println();
	}
	
	@Override
	public double clanarina() {
		double clanarina = 1500 - 50 * poeni;
		return clanarina;
	}
	
	@Override
	public boolean jeUspesanUspon(Planina planina) {
		if (planina.getVisinaPlanine() <= 4000) {
			return true;
		} else {
			return false;
		}
}

//	GETTERS & SETTERS
	
	public int getPoeni() {
		return poeni;
	}

	public void setPoeni(int poeni) {
		this.poeni = poeni;
	}
	
	
	
	
	
}
