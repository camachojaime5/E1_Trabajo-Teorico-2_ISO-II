package B03.Problema1;


public class Principal {
	public static void main (String [] args) {
		Persona p = new Persona(false, false, false, true, true);
		Espacio e = new Espacio(false, false);
		Metereologia m = new Metereologia(32, 50, false, false, false);
		System.out.println(recomendarActividad(p,e,m));
	}
	
	public static String recomendarActividad(Persona p, Espacio e, Metereologia m) {
		String actividad = "NO ACTIVIDAD";
		if (p.isEnferma() || p.isSintomas() || p.isContacto() || !p.isPasaporte() || !p.isPasoCovid()) {
			return actividad;
		}
		else if (m.getTemperatura() < 0 && m.getHumedad() < 15) {
			if (m.isLluvia() || m.isNieve()) {
				actividad = "quedarse en casa";
			}
			else if(!m.isLluvia() && !m.isNieve()) {
				if(!e.isCapacidadMax()) {
					actividad = "esquiar";
				}
			}
		}
		
		else if ((m.getTemperatura() >= 0 && m.getTemperatura() <= 15) && !m.isLluvia()) {
			if (!e.isCapacidadMax()) {
				actividad = "senderismo";
			}
		}	
		
		else if ((m.getTemperatura() > 15 && m.getTemperatura() <= 25) && (!m.isLluvia() && !m.isNiebla()) && m.getHumedad() < 60) {
			if (!e.isRestriccionConfi()) {
				actividad = "hacer turismo al aire libre";
			}
		}
		
		else if ((m.getTemperatura() > 25 && m.getTemperatura() <= 30) && !m.isLluvia()) {
			if (!e.isCapacidadMax()) {
				actividad = "irse de ca�as";
			}
		}
		else if ((m.getTemperatura() > 30 && m.getTemperatura() <= 35) && !m.isLluvia()) {
			if (e.isCapacidadMax()) {
				actividad = "irse a la playa";
			}
			else if (!e.isCapacidadMax()) {
				actividad = "irse de ca�as, irse a la playa o a la piscina";
			}
		}
		else if (m.getTemperatura() > 30 && !m.isLluvia()) {
			if (e.isCapacidadMax()) {
				actividad = "irse a la playa";
			}
			else if (!e.isCapacidadMax()) {
				actividad = "irse a la playa o a la piscina";
			}
		}
		
		return actividad;
	}
}
