package Grafica;

import Juego.EntidadLogica;

public class ObserverEntidades extends ObserverGrafico {

	private static final long serialVersionUID = 1L;

	public ObserverEntidades(EntidadLogica entidadObservada) {
		super(entidadObservada);
		actualizar();
	}
}
