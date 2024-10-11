package Vistas;

import javax.swing.JFrame;

import Juego.Juego;
import Juego.EntidadJugador;
import Juego.EntidadLogica;


public class ControladorVistas {
	
	protected JFrame ventana;
	protected PantallaInicio panelPantallaInicio;
	protected PantallaJuego panelPantallaJuego;
	protected Juego juego;
	
	public ControladorVistas(Juego juego) {
		this.juego = juego;
		panelPantallaInicio = new PantallaInicio(this);
		panelPantallaJuego = new PantallaJuego();
		configurarVentana();
		registrarOyenteVentana();
	}

	protected void configurarVentana() {
		ventana = new JFrame("Mini Super Mario Bros.");
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setResizable(false);
		ventana.setSize(ConstantesVistas.VENTANA_ANCHO, ConstantesVistas.VENTANA_ALTO);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
	}
	
	protected void registrarOyenteVentana() {
		//To do
	}
	
	public void mostrarPantallaInicial() {
		ventana.setContentPane(panelPantallaInicio);
	}
	
	
	
	
	
	
}
