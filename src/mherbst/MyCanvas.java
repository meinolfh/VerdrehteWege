package mherbst;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

// TODO: Auto-generated Javadoc
/**
 * The Class MyCanvas.
 */
public class MyCanvas {

	/** The main frame. */
	private final JFrame mainFrame;

	/** Anzahl Spalten. */
	public static int cols = 8;
	
	/** Anzahl Reihen. */
	public static int rows = 8;

	/** Anzahl Gesamtbuttons im Array. */
	private KachelButton buttonArray[] = new KachelButton[cols * rows];

	/**
	 * Instantiates a new MyCanvas.
	 */
	public MyCanvas() {

		this.mainFrame = new JFrame("Verdrehte Wege (Mathe im April 2020, Klasse 7 - 9, 06.04.2020)");

		this.mainFrame.setLayout(new GridLayout(MyCanvas.rows, MyCanvas.cols));

		for (int y = 0; y < MyCanvas.rows; y++) {
			for (int x = 0; x < MyCanvas.cols; x++) {

				int i = x + y * MyCanvas.cols;

				switch (i) {
				case 0:
				case 5:
				case 10:
				case 11:
				case 12:
				case 14:
				case 15:
				case 16:
				case 19:
				case 20:
				case 21:
				case 22:
				case 23:
				case 25:
				case 30:
				case 32:
				case 34:
				case 35:
				case 36:
				case 38:
				case 39:
				case 40:
				case 41:
				case 44:
				case 49:
				case 50:
				case 51:
				case 55:
				case 57:
				case 63:
					this.buttonArray[i] = new KachelButton(true);
					break;
				default:
					this.buttonArray[i] = new KachelButton(false);
					break;
				}

				this.buttonArray[i].addActionListener(myListener);
				
				this.mainFrame.add(this.buttonArray[i]);
			}
		}

		this.mainFrame.getPreferredSize();
		
		this.mainFrame.pack();

		this.mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.mainFrame.setResizable(false);
		this.mainFrame.setLocationRelativeTo(null);
		this.mainFrame.setVisible(true);
	}

	/** Listener für alle Buttons. */
	ActionListener myListener = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() instanceof KachelButton) {
				KachelButton kachelButton = (KachelButton) e.getSource();
				kachelButton.togglePicture();
			}
		}

	};

}
