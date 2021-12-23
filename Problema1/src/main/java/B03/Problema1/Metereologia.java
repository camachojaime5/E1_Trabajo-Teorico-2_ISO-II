package B03.Problema1;


public class Metereologia {
	private int temperatura;
	private int humedad;
	private boolean lluvia;
	private boolean nieve;
	private boolean niebla;
	
	public Metereologia(int temperatura, int humedad, boolean lluvia, boolean nieve, boolean niebla) {
		this.temperatura = temperatura;
		this.humedad = humedad;
		this.lluvia = lluvia;
		this.nieve = nieve;
		this.niebla = niebla;
		
	}

	public int getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}

	public int getHumedad() {
		return humedad;
	}

	public void setHumedad(int humedad) {
		this.humedad = humedad;
	}

	public boolean isLluvia() {
		return lluvia;
	}

	public void setLluvia(boolean lluvia) {
		this.lluvia = lluvia;
	}

	public boolean isNieve() {
		return nieve;
	}

	public void setNieve(boolean nieve) {
		this.nieve = nieve;
	}

	public boolean isNiebla() {
		return niebla;
	}

	public void setNiebla(boolean niebla) {
		this.niebla = niebla;
	}
	
	
	
}
