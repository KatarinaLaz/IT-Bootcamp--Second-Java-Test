package java_test;

public class RekreativniPlaninar extends Planinar {


//	(20 poena) Kreirati klasu ​RekreativniPlaninar​ koja nasleđuje klasu Planinar.
//	Klasa dodatno pamti još neke informacije koje se ne mogu menjati nakon postavljanja u konstuktoru: 
//	težinu opreme (kg) koju nosi (celobrojna je vrednost npr: 20kg) 
//	maksimalni uspon koji planinar može da savlada bez opreme (npr: 2000m)
//	da li će rekreativni planinar uspešno popeti na planinu zavisi da li je njegov najveći uspon manji od visine planine,
//	s tim da oprema dodatno otežava penjanje i za svaki kilogram opreme koji nosi može da pređe 50 metara manje. 
//	rekeativci placaju clanarinu u iznosu od 1000 rsd
//	naziv okruga odakle je rekreativni planinar. 
//	metoda koja ispisuje podatke o planinaru ispisuje ih u sledećem formatu: 
//	Rekreativac, id: (id) ime: (imei prezime) Okrug: (okrug) 
	
	private int tezinaOpreme;
	private String okrug;
	private double maxUsponBezOpreme;
	
	public RekreativniPlaninar(int identifikacioniBroj, String ime, int tezinaOpreme, String okrug, double maxUspon) {
		super(identifikacioniBroj, ime);
		this.tezinaOpreme = tezinaOpreme;
		this.okrug = okrug;
		this.maxUsponBezOpreme = maxUspon;
	}

//	METODE
	
	@Override
	public void stampaj() {
		System.out.println("Id: " + identifikacioniBroj);
		System.out.println("Ime: " + ime);
		System.out.println("Okrug: " + okrug);
		System.out.println();	
	}
	
	@Override
	public double clanarina() {
		return 1000;
	}

	@Override
	public boolean jeUspesanUspon(Planina planina) {
		if (this.maxUsponBezOpreme - 50 * this.tezinaOpreme > planina.getVisinaPlanine()) {
			return true;
		} else {
			return false;
		}
	}

//	GETTERS & SETTER

	public int getTezinaOpreme() {
		return tezinaOpreme;
	}
	
	public String getOkrug() {
		return okrug;
	}
	
	public double getMaxUsponBezOpreme() {
		return maxUsponBezOpreme;
	}
	
	
	
	
	
}
