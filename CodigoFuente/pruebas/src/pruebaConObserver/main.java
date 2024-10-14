package pruebaConObserver;

import javax.swing.JFrame;

public class main {
	
	public static void main(String a[]) {
		JFrame ventana = new JFrame();
		
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setResizable(false);
		ventana.setTitle("Pruebas en 2D");
		
		PantallaJuego panelJuego = new PantallaJuego();
		ventana.add(panelJuego);
		
		ventana.pack();
		
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
		
		
		Jugador jugador = new Jugador(new Sprite("marioInmovil.png"), 100, 100);
		Observer observerJugador = new ObserverJugador(panelJuego, jugador);
		jugador.registrarObserver(observerJugador);
		
		panelJuego.incorporarEntidadJugador(jugador);
	}
}
