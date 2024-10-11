package Vistas;

import Juego.EntidadLogica;

public class ObserverEntidad extends ObserverGrafico{
	
	public ObserverEntidad(EntidadLogica entidadObservada) {
		super(entidadObservada);
		actualizar();
	}
	
}
