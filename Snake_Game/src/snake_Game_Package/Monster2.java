/*
 *this class was created by babak yousefian , from Iran
 */
package snake_Game_Package;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.util.Random;
import java.awt.Rectangle;
import java.io.File;
import javax.imageio.ImageIO;

public class Monster2 {
	
	//Selector selector = new Selector();
	
	private BufferedImage MonsterImage2;
	
	private Game game;
	
	Random rand = new Random();
	private int x2;
	private int y2;
	
	public void XYMonster2Random() {
		x2 = rand.nextInt(950);
		y2 = rand.nextInt(500);
	}
	
	public void Paint(Graphics g) {
		
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING , RenderingHints.VALUE_ANTIALIAS_ON);
		g2.drawImage(MonsterImage2 , x2 , y2 , null);
		
	}
	
	public boolean collision1() {
		return game.snakeObject.getBounds().intersects(getBounds2());
	}
	
	public boolean collision2() {
		return game.coinObject.getBounds().intersects(getBounds2());
	}
	
	public Rectangle getBounds2() {
		
		return new Rectangle(x2 , y2 , MonsterImage2.getWidth() , MonsterImage2.getHeight());
		
	}
	
	public Monster2(Game game) {
		// TODO Auto-generated constructor stub
		
		this.game=game;
		
		try {
			MonsterImage2 = ImageIO.read(new File("MonsterImage2.jpg"));
		}catch(Exception e) {
			System.err.println("\n\n File NOT Found...!");
		}
	}
}