package Visitor;

import Juego.Entidad;

public class VisitorProyectil extends Visitor{

	public void visitar(Entidad e){
		e.accept(this);
		
	}

}
