package enade.ano2017.strategy;

public class Boeing extends Aviao {
	
	public Boeing() {
		super.aVoo = new VooDiurno();
		super.aPouso = new PousoDiurno();
	}
	
}
