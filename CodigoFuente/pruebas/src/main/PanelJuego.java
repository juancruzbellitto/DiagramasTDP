package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

import Entidades.Jugador;

public class PanelJuego extends JPanel implements Runnable{
	
	
	private static final long serialVersionUID = 1L;
	
	protected static final int TAMANO_ORIGINAL_ENTIDAD = 16;
	protected static final int ESCALA = 3;	// escala comunmente usada en juegos 2D
	
	public static final int TAMANO_CALCULADO_ENTIDAD = TAMANO_ORIGINAL_ENTIDAD * ESCALA;  // entidad de 48x48
	
	protected static final int TAMANO_COLUMNA_PANTALLA = 16;
	protected static final int TAMANO_FILA_PANTALLA = 12;
	
	protected static final int PANTALLA_ANCHO = TAMANO_CALCULADO_ENTIDAD * TAMANO_COLUMNA_PANTALLA;
	protected static final int PANTALLA_ALTO = TAMANO_CALCULADO_ENTIDAD * TAMANO_FILA_PANTALLA;
	
	protected Thread hiloJuego;
	
	protected KeyHandler manejadorTeclas = new KeyHandler();
	
	protected Jugador jugador = new Jugador(this, manejadorTeclas);
	
	protected static final int FPS = 60;
	
	
	
	
	public PanelJuego() {
		this.setPreferredSize(new Dimension(PANTALLA_ANCHO, PANTALLA_ALTO));
		this.setBackground(Color.black);
		this.setDoubleBuffered(true);
		this.addKeyListener(manejadorTeclas);
		this.setFocusable(true);
	}
	
	public void iniciarHiloJuego() {
		hiloJuego = new Thread(this);
		hiloJuego.start();
	}
	
	// metodo del "Game Loop"
	
	
	public void iniciarHiloMario() {
		EventQueue.invokeLater( new Runnable() {
			public void run() {
				
				double intervaloDeDibujo = 1000000000 / FPS;  // 1 segundo dividido 60 fps
				double siguienteDibujo = System.nanoTime() + intervaloDeDibujo;
				
				
				while(hiloJuego != null) {  // mientras el juego este corriendo
					
					
					/*tiempo que se actualiza el hilo
					 * 	long tiempoActual = System.nanoTime();	// 1,000,000,000 nanoSegundos = 1 segundo
					 *	System.out.println("tiempo actual: "+tiempoActual);
					 */
					
					
					// PASO 1: ACTUALIZAR LA INFORMACION SEGUN LA POSICION DE LA ENTIDAD
					update();
					
					// PASO 2: MOSTRAR POR PANTALLA LA ACTUALIZACION
					repaint();
					
					
					
					try {
						double tiempoRestante = siguienteDibujo - System.nanoTime();
						tiempoRestante = tiempoRestante / 1000000;
						
						if(tiempoRestante < 0) {
							tiempoRestante = 0;
						}
						
						Thread.sleep((long) tiempoRestante);
						
						siguienteDibujo += intervaloDeDibujo;
						
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
				}
			}
		});
	}
		
		
		public void update() {
			jugador.update();
		}
		
		public void paintComponent(Graphics graficos) {
			
			super.paintComponent(graficos);
			
			Graphics2D graficos2D = (Graphics2D) graficos;
			
			jugador.draw(graficos2D);
			
			graficos2D.dispose();
		}
	}
