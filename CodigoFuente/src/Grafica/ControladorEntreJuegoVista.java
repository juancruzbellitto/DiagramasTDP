package Grafica;

import Juego.EntidadJugador;
import Juego.EntidadLogica;
<<<<<<< HEAD
import KeyHandler.KeyHandler;
=======
import Juego.KeyListenerMario;
>>>>>>> ec553c65807c2556bb3679fc73ca09ab269ff1b3

public interface ControladorEntreJuegoVista {
	public Observer registrarEntidad(EntidadLogica entidadLogica);
	public Observer registrarEntidad(EntidadJugador entidadJugador);
	public Observer registrarSilueta(EntidadLogica silueta);
	public void mostrarPantallaJuego();
	public void mostrarPantallaFinNivel();
<<<<<<< HEAD
	public void registrarKeyListener(KeyHandler oyente);
=======
	public void registrarKeyListener(KeyListenerMario oyenteTeclado);
>>>>>>> ec553c65807c2556bb3679fc73ca09ab269ff1b3
}
