package Grafica;



import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;


import Juego.EntidadJugador;
import Juego.EntidadLogica;
import Juego.Juego;
<<<<<<< HEAD
import KeyHandler.KeyHandler;
import Paneles.PantallaFinNivel;
import Paneles.PantallaGameOver;
import Paneles.PantallaInicial;
import Paneles.PantallaJuego;
import Paneles.PantallaRanking;
=======
import Juego.KeyListenerMario;
>>>>>>> ec553c65807c2556bb3679fc73ca09ab269ff1b3

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
		pantallaInicial = new PantallaInicial(this);
		pantallaJuego = new PantallaJuego();
		pantallaGameOver = new PantallaGameOver();
		pantallaFinNivel = new PantallaFinNivel();
		pantallaRanking = new PantallaRanking();
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
<<<<<<< HEAD
	
	protected void refrescar() {
		//ventana.pack();
		ventana.revalidate();
		ventana.repaint();
	}

=======
>>>>>>> ec553c65807c2556bb3679fc73ca09ab269ff1b3

	public void mostrarPantallaJuego() {
		ventana.setContentPane(pantallaJuego);
		ventana.setSize(ConstantesVistas.PANEL_JUEGO_ANCHO,ConstantesVistas.PANEL_JUEGO_ALTO);
		refrescar();
	}


	public void mostrarPantallaFinNivel() {
		
		
	}

	
	protected void refrescar() {
		ventana.revalidate();
		ventana.repaint();
	}



	public void accionarInicioJuego() {
		juego.iniciar();
	}

	public void accionarPantallaRanking() {
		
		
	}


	public void cambiarModoJuego(int modo) {
		
		
	}
	


	public Observer registrarEntidad(EntidadLogica entidadLogica) {
		Observer observerEntidad = pantallaJuego.incorporarEntidad(entidadLogica);
		refrescar();
		return observerEntidad;
	}
	
	public Observer registrarEntidad(EntidadJugador entidadJugador) {
		Observer observerJugador = pantallaJuego.incorporarEntidadJugador(entidadJugador);
		refrescar();
		return observerJugador;
	}
	
	public Observer registrarSilueta(EntidadLogica silueta) {
		Observer observerSilueta = pantallaJuego.incorporarSilueta(silueta);
		refrescar();
		return observerSilueta;
	}
	
<<<<<<< HEAD
	public void registrarKeyListener(KeyHandler oyente) {
		ventana.addKeyListener(oyente);
=======
	public void registrarKeyListener(KeyListenerMario oyenteTeclado) {
		ventana.addKeyListener(oyenteTeclado);
>>>>>>> ec553c65807c2556bb3679fc73ca09ab269ff1b3
		ventana.setFocusable(true);
		ventana.requestFocusInWindow();
	}
	
}