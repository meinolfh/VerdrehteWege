package mherbst;

import java.awt.EventQueue;

// TODO: Auto-generated Javadoc
/**
 * The Class VerdrehteWege.
 * 
 * Startet die Anwendung
 */
public class VerdrehteWege {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				new MyCanvas();
			}
		});

	}

}
