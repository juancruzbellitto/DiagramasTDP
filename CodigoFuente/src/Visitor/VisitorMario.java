package Visitor;

import Juego.Entidad;

public class VisitorMario extends Visitor{

	public void visitar(Entidad e) {
		e.accept(this);
		
	}

}
