/*this snake class including about moving and eating 
 *this class was created by babak yousefian , from Iran 
 */
package snake_Game_Package;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Main_Snake_Of_Game implements KeyListener{
	
	private Game game;
	
	BufferedImage snakeImage;
	BufferedImage snakeImage2;
	
	private boolean flag=true;
	
	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	private int[] snakeXlength = new int [750];
	private int[] snakeYlength = new int [750];
	private int lengthOfSnake = 2;
	
	public void SetLengthOfSnake() {
		lengthOfSnake++;
	}
	
	private int location = 0;
	
	private boolean up = false;
	private boolean down = false;
	private boolean right = true;
	private boolean left = false;
	
	public boolean collision() {
		return game.coinObject.getBounds().intersects(getBounds());
	}
	
	public Rectangle getBounds() {
		return new Rectangle(snakeXlength[0] , snakeYlength[0] , snakeImage.getWidth() , snakeImage.getHeight());
	}
	
	public void paint(Graphics g) throws IOException {
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING , RenderingHints.VALUE_ANTIALIAS_ON);
		
		
		if(location==0) {
			snakeXlength[0]=1;
			snakeYlength[0]=1;
			location++;
		}
		
		if(right==true && flag) {
			for(int i = lengthOfSnake-1 ; i>=0 ; i--) {
				snakeYlength[i+1]=snakeYlength[i];
			}
			for(int i = lengthOfSnake ; i>=0 ; i--) {
				if(i==0) {
					snakeXlength[i]=snakeXlength[i]+45;
				}else {
					snakeXlength[i]=snakeXlength[i-1];
				}
				if(snakeXlength[i]>1080) {
					snakeXlength[i]=1;
				}
			}
		}
		
		for(int i=0 ; i<lengthOfSnake ; i++) {
			if(right && flag) {
				if(i==0) {
					g2.drawImage(snakeImage , snakeXlength[i] , snakeYlength[i] , null);
				}else {
					g2.drawImage(snakeImage2 , snakeXlength[i] , snakeYlength[i] , null);
				}
			}
		}
		
		//g2.drawImage(snakeImage , snakeXlength[0] , snakeYlength[0] , null);
		
		if(right && !flag) {
			for(int i = lengthOfSnake-1 ; i>=0 ; i--) {
				snakeYlength[i+1] = snakeYlength[i];
			}
			for(int i = lengthOfSnake ; i>=0 ; i--) {
				if(i==0) {
					snakeXlength[i] = snakeXlength[i]+45;
				}else {
					snakeXlength[i] = snakeXlength[i-1];
				}
				if(snakeXlength[i]>1080) {
					//snakeXlength[i]=1;
					game.setGameOver(false);
				}
			}
		}
		
		if(left && !flag) {
			for(int i = lengthOfSnake-1 ; i>=0 ; i--) {
				snakeYlength[i+1] = snakeYlength[i];
			}
			for(int i = lengthOfSnake ; i>=0 ; i--) {
				if(i==0) {
					snakeXlength[i] = snakeXlength[i]-45;
				}else {
					snakeXlength[i] = snakeXlength[i-1];
				}
				if(snakeXlength[i] < -30) {
					//snakeXlength[i]=1080;
					game.setGameOver(false);
				}
			}
		}
		
		if(down && !flag) {
			for(int i = lengthOfSnake-1 ; i>=0 ; i--) {
				snakeXlength[i+1] = snakeXlength[i];
			}
			for(int i = lengthOfSnake ; i>=0 ; i--) {
				if(i==0) {
					snakeYlength[i] = snakeYlength[i]+45;
				}else {
					snakeYlength[i]=snakeYlength[i-1];
				}
				if(snakeYlength[i]>=583) {
					//snakeYlength[i]=15;
					game.setGameOver(false);
				}
				//if(snakeYlength[i]>720) {
					//snakeYlength[i]=1;
				//}
			}
		}
		
		if(up && !flag) {
			for(int i = lengthOfSnake-1 ; i>=0 ; i--) {
				snakeXlength[i+1] = snakeXlength[i];
			}
			for(int i = lengthOfSnake ; i>=0 ; i--) {
				if(i==0) {
					snakeYlength[i] = snakeYlength[i]-45;
				}else {
					snakeYlength[i] = snakeYlength[i-1];
				}
				if(snakeYlength[i] < -20) {
					//snakeYlength[i]=550;
					game.setGameOver(false);
				}
			}
		}
		
		for(int i=0 ; i<lengthOfSnake ; i++) {
			if(i==0 && right && !flag) {
				//draw right snake //(this,g,x,y)
				g2.drawImage(snakeImage , snakeXlength[i] , snakeYlength[i] , null);
			}
			if(i==0 && left && !flag) {
				//draw left snake //(this,g,x,y)
				g2.drawImage(snakeImage , snakeXlength[i] , snakeYlength[i] , null);
			}
			if(i==0 && up && !flag) {
				//draw up snake //(this,g,x,y)
				g2.drawImage(snakeImage , snakeXlength[i] , snakeYlength[i] , null);
			}
			if(i==0 && down && !flag) {
				//draw down snake //(this,g,x,y)
				g2.drawImage(snakeImage , snakeXlength[i] , snakeYlength[i] , null);
			}
			if(i!=0 && !flag) {
				//draw right snake //(this,g,x,y)
				g2.drawImage(snakeImage2 , snakeXlength[i] , snakeYlength[i] , null);
			}
		}
		
		for(int j=1 ; j<lengthOfSnake ; j++) {
			if(snakeXlength[j] == snakeXlength[0] && snakeYlength[j] == snakeYlength[0]) {
				game.setGameOver(false);
			}
		}
		
	}

	public Main_Snake_Of_Game(Game game) {
		// TODO Auto-generated constructor stub
		
		this.game=game;
		
		try {
			snakeImage = ImageIO.read(new File("snakeImage.jpeg"));
			snakeImage2 = ImageIO.read(new File("snakeImage2.jpeg"));
		}catch(Exception e) {
			System.err.println("\n\n File Not Found...!\n\n");
		}
		
	}

	@Override
	public void keyPressed(KeyEvent event) {
		// TODO Auto-generated method stub
		
		if(event.getKeyCode() == KeyEvent.VK_RIGHT && !left) {
			down = false;
			up = false;
			right = true;
		}
		
		if(event.getKeyCode() == KeyEvent.VK_LEFT && !right) {
			down = false;
			up = false;
			left = true;
		}
		
		if(event.getKeyCode() == KeyEvent.VK_DOWN && !up) {
			down = true;
			right = false;
			left = false;
		}
		
		if(event.getKeyCode() == KeyEvent.VK_UP && !down) {
			up = true;
			right = false;
			left = false;
		}
		
	}

	@Override
	public void keyReleased(KeyEvent event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent event) {
		// TODO Auto-generated method stub
		
	}

}