package Juego;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyListenerMario implements KeyListener{
	
	protected EntidadJugador jugador;
	
	public KeyListenerMario(EntidadJugador jugador) {
		this.jugador = jugador;
	}

	public void keyTyped(KeyEvent e) {		
	}

	public void keyPressed(KeyEvent e) {
		int code = e.getKeyCode();
		if(code == KeyEvent.VK_A) {
			jugador.setDireccion(2);
		}
		if(code == KeyEvent.VK_D) {
			jugador.setDireccion(1);
		}
	}

	public void keyReleased(KeyEvent e) {
		int code = e.getKeyCode();
		if(code == KeyEvent.VK_A || code == KeyEvent.VK_D) {
			jugador.setDireccion(0);
		}
	}
}
