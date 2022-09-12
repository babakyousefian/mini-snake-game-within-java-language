/*this game class can create and move the all of the object creating in different class
 *this class was created by babak yousefian , from Iran
 */
package snake_Game_Package;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Game extends JPanel implements Runnable , KeyListener{
	
	Selector selector = new Selector();
	
	public static String temp;
	
	private static final long serialVersionUID = 1L;
	
	private BufferedImage backImage , gameOverImage , winnerImage;
	
	private boolean gameOver=true;
	
	private boolean winner=true;
	
	public void setGameOver(boolean gameOver) throws IOException{
		this.gameOver = gameOver;
	}
	Main_Snake_Of_Game snakeObject = new Main_Snake_Of_Game(this);
	
	Coin coinObject = new Coin();
	
	public boolean isWinner() {
		return winner;
	}

	public void setWinner(boolean winner) {
		this.winner = winner;
	}

	Player playerObject = new Player(this);
	Monster monsterObject = new Monster(this);
	Monster2 monsterObject2 = new Monster2(this);
	Monster3 monsterObject3 = new Monster3(this);
	Repeat repeat = new Repeat(this);
	//Notification notification = new Notification(this);
	
	Thread snakeThread;
	
	public void addNotify() {
		super.addNotify();
		snakeThread = new Thread(this);
		snakeThread.start();
	}
	
	public void paint(Graphics g) {
		
		super.paint(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING , RenderingHints.VALUE_ANTIALIAS_ON);
		
		g2.drawImage(backImage , 0 , 0 , null);
		try {
			snakeObject.paint(g2);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		coinObject.Paint(g2);
		temp=selector.getValue();
		if(temp.equalsIgnoreCase("1") || temp.equalsIgnoreCase("easy")) {
			monsterObject.Paint(g2);
		}else if(temp.equalsIgnoreCase("2") || temp.equalsIgnoreCase("medium")) {
			monsterObject.Paint(g2);
			monsterObject2.Paint(g2);
		}else if(temp.equalsIgnoreCase("3") || temp.equalsIgnoreCase("hard")) {
			monsterObject.Paint(g2);
			monsterObject2.Paint(g2);
			monsterObject3.Paint(g2);
		}else if(temp!="1" && temp!="2" && temp!="3" && temp!="easy" && temp!="medium" && temp!="hard") {
			try {
				setGameOver(false);
			JOptionPane.showConfirmDialog(null , "invalid input...!\nplease try again later" , "Snake Game" , JOptionPane.ERROR_MESSAGE);
			}catch(Exception e) {
				System.err.println("\n\n invalid input...!");
			}
		}
		
		
		setBackground(Color.LIGHT_GRAY);
		g2.setColor(Color.MAGENTA);
		Font font = new Font("arial" , Font.ITALIC , 40);
		g2.setFont(font);
		g2.drawString("Score: " , 30 , 650);
		g2.drawString(""+playerObject.getScore() , 180 , 650);
		
		if(snakeObject.collision()==true) {
			snakeObject.SetLengthOfSnake();
		}
		
		if(!gameOver) {
			g2.drawImage(gameOverImage , 0 , 0 , null);
		}
		
		if(!winner) {
			g2.drawImage(winnerImage , 0 , 0 , null);
		}
		
	}
	
	public void move() {
		playerObject.getCoinPos();
		playerObject.getCoin();
		playerObject.getMonster1Pos();
		playerObject.getMonster2Pos();
		playerObject.getMonster3Pos();
		playerObject.Winner_Game();
		playerObject.CoinVSMonster();
		playerObject.SnakeVSMonster();
		//playerObject.Notifications();
	}
	
	public Game() {
		// TODO Auto-generated constructor stub
		
		try {
			gameOverImage = ImageIO.read(new File("pictures//gameOver.jpg"));
			winnerImage = ImageIO.read(new File("pictures//winnerImage.jpg"));
			backImage = ImageIO.read(new File("pictures//backImage.jpg"));
		}catch(IOException e) {
			System.err.println("\n\n File NOT Found...!");
		}
	}
	
	@Override
	public void keyPressed(KeyEvent event) {
		// TODO Auto-generated method stub
		
		snakeObject.setFlag(false);
		snakeObject.keyPressed(event);
		
	}

	@Override
	public void keyReleased(KeyEvent event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent event) {
		// TODO Auto-generated method stub
		
	}

	@Override 
	public void run() {
		// TODO Auto-generated method stub
		Selector selector = new Selector();
		temp=selector.getValue();
		while(gameOver!=false && winner!=false) {
			repaint();
			move();
			try {
				if(temp.equalsIgnoreCase("1") || temp.equalsIgnoreCase("easy")) {
					Thread.sleep(200);
					if(playerObject.getScore()==10) {winner=false;}
				}else if(temp.equalsIgnoreCase("2") || temp.equalsIgnoreCase("medium")) {
					Thread.sleep(100);
					if(playerObject.getScore()==15) {winner=false;}
				}else if(temp.equalsIgnoreCase("3") || temp.equalsIgnoreCase("hard")) {
					Thread.sleep(79);
					if(playerObject.getScore()==23) {winner=false;}
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
	}
}
