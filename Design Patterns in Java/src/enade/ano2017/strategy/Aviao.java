package enade.ano2017.strategy;

public abstract class Aviao {
	
	protected Voo aVoo;
	protected Pouso aPouso;
	
	public void performarVoo() {
		this.aVoo.voar();
	}
	
	public void performarPouso() {
		this.aPouso.pousar();
	}
	
	public void setVoo(Voo pVoo) {
		this.aVoo = pVoo;
	}
	
	public void setPouso(Pouso pPouso) {
		this.aPouso = pPouso;
	}
	
}