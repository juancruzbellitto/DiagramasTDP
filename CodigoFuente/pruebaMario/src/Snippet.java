

public class Snippet {
	public void actualizarScrollHaciaJugador(EntidadJugador entidad_jugador) {
			
			JScrollBar horizontalScrollBar = panelScrollJuego.getHorizontalScrollBar();
			
			int jugadorX = entidad_jugador.getX();
			int ventanaAncho = panelScrollJuego.getViewport().getWidth();
			
			int posicionScroll = jugadorX - (ventanaAncho / 2);
			horizontalScrollBar.setValue(Math.max(0, posicionScroll));
	
	        InputMap inputMap = panelScrollJuego.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
	        ActionMap actionMap = panelScrollJuego.getActionMap();
	
	        inputMap.put(KeyStroke.getKeyStroke('a'), "scrollLeft");
	        actionMap.put("scrollLeft", new AbstractAction() {
	            public void actionPerformed(ActionEvent e) {
	                int currentValue = horizontalScrollBar.getValue();
	                horizontalScrollBar.setValue(currentValue - entidad_jugador.getVelocidad()); // Ajusta la cantidad de desplazamiento
	            }
	        });
	
	        inputMap.put(KeyStroke.getKeyStroke('d'), "scrollRight");
	        actionMap.put("scrollRight", new AbstractAction() {
	            public void actionPerformed(ActionEvent e) {
	                int currentValue = horizontalScrollBar.getValue();
	                horizontalScrollBar.setValue(currentValue + entidad_jugador.getVelocidad()); // Ajusta la cantidad de desplazamiento
	            }
	        });
		}
}