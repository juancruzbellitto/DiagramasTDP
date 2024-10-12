package Grafica;

import javax.swing.JFrame;

import Juego.EntidadJugador;
import Juego.EntidadLogica;
import Juego.Juego;
import Grafica.ConstantesVistas;

public class ControladorVistas implements ControladorDeVistas,ControladorEntreJuegoVista{
	protected JFrame ventana;
	protected PantallaInicial pantallaInicial;
	protected PantallaJuego pantallaJuego;
	protected PantallaGameOver pantallaGameOver;
	protected PantallaFinNivel pantallaFinNivel;
	protected PantallaRanking pantallaRanking;
	protected Juego juego;
	
	public ControladorVistas(Juego juego) {
		this.juego=juego;
		pantallaInicial=new PantallaInicial(this);
		pantallaJuego=new PantallaJuego();
		pantallaGameOver=new PantallaGameOver();
		pantallaFinNivel=new PantallaFinNivel();
		pantallaRanking=new PantallaRanking();
		configurarVentana();
		
	}
	
	protected void configurarVentana() {
		ventana = new JFrame("TdP :: SuperMarioBros");
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setResizable(false);
		ventana.setSize(ConstantesVistas.VENTANA_ANCHO, ConstantesVistas.VENTANA_ALTO);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
	}
	
	public void mostrarPantallaInicial() {
		ventana.setContentPane(pantallaInicial);
		refrescar();
	}
	
	protected void refrescar() {
		ventana.revalidate();
		ventana.repaint();
	}


	public void mostrarPantallaJuego() {
		
		
	}


	public void mostrarPantallaFinNivel() {
		
		
	}


	public void accionarInicioJuego() {
		juego.iniciar();
		
	}


	public void accionarPantallaJuego() {
		
		
	}


	public void accionarPantallaRanking() {
		
		
	}


	public void camibarModoJuego(int modo) {
		
		
	}


	public Observer registrarEntidad(EntidadLogica entidadLogica) {
		
		return null;
	}


	public Observer registrarEntidad(EntidadJugador entidadJugador) {
		
		return null;
	}


	public Observer registrarSilueta(EntidadLogica silueta) {
		
		return null;
	}
}