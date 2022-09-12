/*this class involve that the position of coin picture and paint picture
 * this class was created by babak yousefian , from Iran
*/
package snake_Game_Package;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Random;
import javax.imageio.ImageIO;

public class Coin {
	
	private Game game;
	
	Random rand = new Random();
	
	private BufferedImage coinImage;
	private int xPos;
	private int yPos;
	
	public void XYrandom() {
		xPos = rand.nextInt(950);
		yPos = rand.nextInt(500);
	}
	
	public void Paint(Graphics g) {
		
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING , RenderingHints.VALUE_ANTIALIAS_ON);
		g2.drawImage(coinImage , xPos , yPos , null);
		
	}
	
	
	public Rectangle getBounds() {
		return new Rectangle(xPos , yPos , coinImage.getWidth() , coinImage.getHeight());
	}
	public Coin() {
		// TODO Auto-generated constructor stub
		
		try {
			coinImage = ImageIO.read(new File("pictures//coinImage.jpg"));
		}catch(Exception e) {
			System.err.println("\n\n File NOT Found...!");
		}
		
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

}
