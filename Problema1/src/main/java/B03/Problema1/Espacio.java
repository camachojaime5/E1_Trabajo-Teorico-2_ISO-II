package B03.Problema1;


public class Espacio {
	private boolean capacidadMax;
	private boolean restriccionConfi;
	
	public Espacio(boolean capacidadMax, boolean restriccionConfi) {
		this.capacidadMax = capacidadMax;
		this.restriccionConfi = restriccionConfi;
		
	}

	public boolean isCapacidadMax() {
		return capacidadMax;
	}

	public void setCapacidadMax(boolean capacidadMax) {
		this.capacidadMax = capacidadMax;
	}

	public boolean isRestriccionConfi() {
		return restriccionConfi;
	}

	public void setRestriccionConfi(boolean restriccionConfi) {
		this.restriccionConfi = restriccionConfi;
	}	
}
