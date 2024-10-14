package main;

import javax.swing.JFrame;

public class Main {

	public static void main(String a[]) {
		
		JFrame ventana = new JFrame();
		
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setResizable(false);
		ventana.setTitle("Pruebas en 2D");
		
		PanelJuego panelJuego = new PanelJuego();
		ventana.add(panelJuego);
		
		ventana.pack();
		
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
		
		
		panelJuego.iniciarHiloJuego();
	}
	
}
