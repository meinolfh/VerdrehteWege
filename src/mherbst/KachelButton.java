package mherbst;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;

// TODO: Auto-generated Javadoc
/**
 * The Class KachelButton.
 * 
 * Kümmert sich um die Darstellung der beiden Images auf der Buttonoberfläche.
 */
public class KachelButton extends JButton {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** Vorderseite des Bildes. */
	private Image imageV; 
	
	/** Rückseite des Bildes. */
	private Image imageR;

	/** Breite des Bildes. */
	private int width;
	
	/** Höhe des Bildes. */
	private int height;

	/** Soll die Vorder- oder Rückseite dargestellt werden? */
	private boolean vorderseite;
	
	/** Merker, ob die Vorder- oder Rückseite ursprünglich dargestellt wird. */
	private boolean original;

	/**
	 * Instantiates a new kachel button.
	 *
	 * @param vorderseite the vorderseite
	 */
	public KachelButton(boolean vorderseite) {
		this.vorderseite = vorderseite;
		this.original = vorderseite;

		this.imageV = new ImageIcon(this.getClass().getResource("../Vorderseite.png")).getImage();
		this.imageR = new ImageIcon(this.getClass().getResource("../Rueckseite.png")).getImage();

		this.width = imageV.getWidth(null);
		this.height = imageV.getHeight(null);
	}

	/**
	 * Paint component.
	 *
	 * @param g the Graphics
	 */
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		if (vorderseite) {
			g.drawImage(imageV, 0, 0, this);
			
			if (this.original != vorderseite) {
				Color col = g.getColor();
				g.setColor(Color.RED);
				g.drawRect(3, 3, width - 6, height - 6);
				g.setColor(col);
			}
			
		} else {
			g.drawImage(imageR, 0, 0, this);
			
			if (this.original != vorderseite) {
				Color col = g.getColor();
				g.setColor(Color.RED);
				g.drawRect(3, 3, width - 6, height - 6);
				g.setColor(col);
			}
			
		}
	}

	/**
	 * Gets the preferred size.
	 *
	 * @return the preferred size
	 */
	@Override
	public Dimension getPreferredSize() {
		return new Dimension(this.width, this.height);
	}

	/**
	 * Toggle picture.
	 * Wird der  Button angeklickt, wird die jeweils andere Seite dargestellt.
	 */
	public void togglePicture() {
		this.vorderseite = !this.vorderseite;
	}

}
