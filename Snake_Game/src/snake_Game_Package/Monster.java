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

public class Monster{
	
	//Selector selector = new Selector();
	
	private BufferedImage MonsterImage;
	
	private Game game;
	
	Random rand = new Random();
	private int x1;
	private int y1;
	
	public void XYMonster1Random() {
		x1 = rand.nextInt(950);
		y1 = rand.nextInt(500);
	}
	
	public void Paint(Graphics g) {
		
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING , RenderingHints.VALUE_ANTIALIAS_ON);
		g2.drawImage(MonsterImage , x1 , y1 , null);
		
		
	}
	
	public boolean collision1() {
		return game.snakeObject.getBounds().intersects(getBounds1());
	}
	
	public boolean collision2() {
		return game.coinObject.getBounds().intersects(getBounds1());
	}
	
	public Rectangle getBounds1() {
		
		return new Rectangle(x1 , y1 , MonsterImage.getWidth() , MonsterImage.getHeight());
		
	}
	
	public Monster(Game game) {
		// TODO Auto-generated constructor stub
		
		this.game=game;
		
		try {
			MonsterImage = ImageIO.read(new File("pictures//MonsterImage.jpg"));
		}catch(Exception e) {
			System.err.println("\n\n File NOT Found...!");
		}
	}
}
