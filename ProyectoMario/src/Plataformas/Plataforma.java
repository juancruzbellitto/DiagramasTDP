package Plataformas;

import Fabricas.Sprite;
import Juego.Entidad;

public abstract class Plataforma extends Entidad{

	public Plataforma(Sprite sprite, int x, int y) {
		super(sprite, x, y);
	}

}
