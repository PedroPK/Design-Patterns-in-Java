package enade.ano2017.strategy;

public class SimuladorBoeing {
	
	public void voarAndPousar() {
		Boeing boeing = new Boeing();
		
		boeing.performarVoo();
		boeing.performarPouso();
		
		boeing.setVoo(new VooNoturno());
		boeing.setPouso(new PousoNoturno());
		
		boeing.performarVoo();
		boeing.performarPouso();
	}
	
}