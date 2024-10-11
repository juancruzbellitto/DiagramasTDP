package Juego;


import java.util.List;

import Vistas.ControladorVistas;
import Vistas.Observer;

public class Juego {
	
	protected ControladorVistas controlador;
	
	/*
	protected GeneradorNivel generadorNivel;
	protected FabricaSprites fabricaSprites;
	protected FabricaEntidades fabricaEntidades;
	protected Nivel nivelActual;}
	*/
	
	public Juego() {
		/*
		fabricaSprites = new FabricaModo1;
		fabricaEntidades = new FabricaEntidades(fabricaSprites);
		generadorNivel = new GeneradorNivel(fabricaEntidades);
		*/
	}
	
	public void setControlador(ControladorVistas controlador) {
		this.controlador = controlador;
	}
	
	public void iniciar() {
		/*
		nivelActual = generadorNivel.generarNivel();
		registrarObservers();
		controlador.mostrarPantallaNivel;}
		*/
	}
	
	public void registrarObservers() {
		/*
		registrarObserverJugador(nivelActual.getJugador());
		registrarObserverFondo(nivelActual.getFondo());
		registrarObserverParaEntidades(nivelActual.getEnemigos());
		registrarObserverParaEntidades(nivelActual.getPowerUps());
		registrarObserverParaEntidades(nivelActual.getPlataformas());
		*/
	}
	
	protected void registrarObserverJugador(Jugador jugador) {
		Observer observerJugador = controlador.registrarEntidad(jugador);
		jugador.registrarObserver(observerJugador);
	}
	
	protected void registrarObserverFondo(Fondo fondo) {
		Observer observerFondo = controlador.registrarEntidad(fondo);
		fondo.registrarObserver(observerFondo);
	}
	
	protected void registrarObserverParaEntidades(List<? extends Entidad> entidades) {
		for(Entidad entidad : entidades) {
			Observer observer = controlador.registrarEntidad(entidad);
			entidad.registrarObserver(observer);
		}
	}
	
	
	

}
