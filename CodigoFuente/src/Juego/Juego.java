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
	protected MoverMario moverMario;
	
	public Juego() {
		fabricaSprites = new FabricaSpritesModo1();
		fabricaEntidades = new FabricaEntidades(fabricaSprites);
		generadorNivel = new GeneradorNivel(fabricaEntidades);
	}
	
	public void setControladorVistas(ControladorEntreJuegoVista controladorVistas) {
		this.controladorVistas=controladorVistas;
	}
	
	public Nivel getNivelActual() {
		return nivelActual;
	}
	
	public void iniciar() {
		nivelActual = generadorNivel.generarNivel(1);
		registrarObserversYOyente();
		moverMario = new MoverMario(this);
		moverMario.start();
		controladorVistas.mostrarPantallaJuego();
	}
	
	public void actualizarSpriteJugador() {
		if(nivelActual.getJugador().getDireccion()!=0) {
			nivelActual.getJugador().setSprite(fabricaSprites.getMarioMoviendo());
		}
		else {
			nivelActual.getJugador().setSprite(fabricaSprites.getMarioInmovil());
		}
	}
	
	
	protected void registrarObserversYOyente() {
		registrarObserverJugador(nivelActual.getJugador());
		registrarOyenteJugador(nivelActual.getJugador());
		registrarObserverSilueta(nivelActual.getSilueta());
		registrarObserversParaEntidades(nivelActual.getListaEnemigos());
		registrarObserversParaEntidades(nivelActual.getListaPlataformas());
		registrarObserversParaEntidades(nivelActual.getListaPowerUps());
	}
	
	protected void registrarObserverJugador(Jugador jugador) {
		Observer observerJugador = controladorVistas.registrarEntidad(jugador);
		jugador.registrarObserver(observerJugador);
	}
	
	protected void registrarOyenteJugador(EntidadJugador jugador) {
		KeyListenerMario oyente=new KeyListenerMario(jugador);
		controladorVistas.registrarKeyListener(oyente);
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
	
}


