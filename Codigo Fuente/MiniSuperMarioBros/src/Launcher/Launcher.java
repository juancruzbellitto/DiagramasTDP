package Launcher;

import java.awt.EventQueue;

import Juego.Juego;
import Vistas.ControladorVistas;

public class Launcher {

	public static void main(String a[]) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				Juego juego = new Juego();
				ControladorVistas controlador = new ControladorVistas(juego);
				juego.setControlador(controlador);
				controlador.mostrarPantallaInicial();
			}
		})
	}
}
