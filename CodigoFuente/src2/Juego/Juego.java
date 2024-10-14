package Juego;

import java.util.List;


import Fabricas.*;
import Parser.GeneradorNivel;
import Grafica.Observer;
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
	
	public void iniciar() {
		nivelActual = generadorNivel.generarNivel(1);
		registrarObservers();
		//iniciarHilos();
		controladorVistas.mostrarPantallaJuego();
	}
	
	protected void registrarObservers() {
		registrarObserverJugador(nivelActual.getJugador());
		registrarObserverSilueta(nivelActual.getSilueta());
		registrarObserversParaEntidades(nivelActual.getListaEnemigos());
		registrarObserversParaEntidades(nivelActual.getListaPlataformas());
		registrarObserversParaEntidades(nivelActual.getListaPowerUps());
		//registrarObserversParaEntidades(nivelActual.getListaProyectiles());
	}
	
	protected void registrarObserverJugador(Jugador jugador) {
		Observer observerJugador = controladorVistas.registrarEntidad(jugador);
		jugador.registrarObserver(observerJugador);
	}
	
	protected void registrarObserverSilueta(Silueta silueta) {
		Observer observer = controladorVistas.registrarSilueta(silueta);
		silueta.registrarObserver(observer);
	}
	
	protected void registrarObserversParaEntidades(List<? extends Entidad> entidades) {
		for(Entidad entidad : entidades) {
			Observer observer = controladorVistas.registrarEntidad(entidad);
			entidad.registrarObserver(observer);
		}
	}
	
	protected void iniciarHilos() {
		HiloMario hiloMario = new HiloMario();
		hiloMario.iniciarHiloMario(fabricaEntidades.getJugador(100, 100));
	}
}


