package B03.Problema1;

public class Persona {
	private boolean enferma;
	private boolean sintomas;
	private boolean contacto;
	private boolean pasaporte;
	private boolean pasoCovid;
	
	public Persona(boolean enferma, boolean sintomas, boolean contacto,
			boolean pasoCovid, boolean pasaporte) {
		this.enferma=enferma;
		this.sintomas=sintomas;
		this.contacto=contacto;
		this.pasoCovid=pasoCovid;
		this.pasaporte=pasaporte;
		
	}

	public boolean isEnferma() {
		return enferma;
	}

	public void setEnferma(boolean enferma) {
		this.enferma = enferma;
	}

	public boolean isSintomas() {
		return sintomas;
	}

	public void setSintomas(boolean sintomas) {
		this.sintomas = sintomas;
	}

	public boolean isContacto() {
		return contacto;
	}

	public void setContacto(boolean contacto) {
		this.contacto = contacto;
	}

	public boolean isPasaporte() {
		return pasaporte;
	}

	public void setPasaporte(boolean pasaporte) {
		this.pasaporte = pasaporte;
	}

	public boolean isPasoCovid() {
		return pasoCovid;
	}

	public void setPasoCovid(boolean pasoCovid) {
		this.pasoCovid = pasoCovid;
	}
	
}
