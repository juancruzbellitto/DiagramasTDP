package Juego;

import Fabricas.*;
import Parser.GeneradorNivel;
import Grafica.ControladorEntreJuegoVista;

public class Juego {
	protected ControladorEntreJuegoVista controladorVistas;
	protected GeneradorNivel generadorNivel;
	protected FabricaSprites fabricaSprites;
	protected FabricaEntidades fabricaEntidades;
	protected Nivel nivelActual;
	
	public Juego() {
		fabricaSprites = new FabricaSpritesModo1();
		fabricaEntidades = new FabricaEntidades(fabricaSprites);
		generadorNivel = new GeneradorNivel(fabricaEntidades);
	}
	
	public void setControladorVistas(ControladorEntreJuegoVista controladorVistas) {
		this.controladorVistas=controladorVistas;
	}

}
