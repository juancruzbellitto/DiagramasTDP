package Visitor;

import Juego.Entidad;

public class VisitorEnemigo extends Visitor{

	public void visitar(Entidad e) {
		e.accept(this);
		
		
		
	}

}
