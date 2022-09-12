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

public class Monster3 {
	
	//Selector selector = new Selector();
	
	private BufferedImage MonsterImage3;
	
	private Game game;
	
	Random rand = new Random();
	private int x3;
	private int y3;
	
	public void XYMonster3Random() {
		x3 = rand.nextInt(950);
		y3 = rand.nextInt(500);
	}
	
	public void Paint(Graphics g) {
		
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING , RenderingHints.VALUE_ANTIALIAS_ON);
		g2.drawImage(MonsterImage3 , x3 , y3 , null);
		
		
	}
	
	public boolean collision1() {
		return game.snakeObject.getBounds().intersects(getBounds3());
	}
	
	public boolean collision2() {
		return game.coinObject.getBounds().intersects(getBounds3());
	}
	
	public Rectangle getBounds3() {
		
		return new Rectangle(x3 , y3 , MonsterImage3.getWidth() , MonsterImage3.getHeight());
		
	}
	
	public Monster3(Game game) {
		// TODO Auto-generated constructor stub
		
		this.game=game;
		
		try {
			MonsterImage3 = ImageIO.read(new File("pictures//MonsterImage3.jpeg"));
		}catch(Exception e) {
			System.err.println("\n\n File NOT Found...!");
		}
	}
}
