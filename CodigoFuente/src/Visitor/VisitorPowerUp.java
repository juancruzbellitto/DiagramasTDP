package Visitor;

import Juego.Entidad;

public class VisitorPowerUp extends Visitor{

	public void visitar(Entidad e) {
		e.accept(this);
		
	}

}
