package Grafica;

import Juego.EntidadJugador;
import Juego.EntidadLogica;
import KeyHandler.KeyHandler;

public interface ControladorEntreJuegoVista {
	public Observer registrarEntidad(EntidadLogica entidadLogica);
	public Observer registrarEntidad(EntidadJugador entidadJugador);
	public Observer registrarSilueta(EntidadLogica silueta);
	public void mostrarPantallaJuego();
	public void mostrarPantallaFinNivel();
	public void registrarKeyListener(KeyHandler oyente);
}
