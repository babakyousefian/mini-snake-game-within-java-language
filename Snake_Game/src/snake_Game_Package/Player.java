/*
 *this class was created by babak yousefian , from Iran
 */
package snake_Game_Package;

import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Player {
	
	private Game game;
	
	Selector selector = new Selector();
	
	private int score;
	
	private int coinPos=0;
	private int monster1Pos=0,monster2Pos=0,monster3Pos=0;
	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	
	public void getCoin() {
		if(game.snakeObject.collision()==true) {
			game.coinObject.XYrandom();
			//System.out.println("Snake Get Coin");
			score++;
			//game.snakeObject.SetLengthOfSnake();
		}
	}
	
	//public void Notifications() {
		//Notification.Notif();
	//}
	
    public void Winner_Game() {
		Selector selector = new Selector();
		String temp = selector.getValue();
		int number = getScore();
		if(temp.equalsIgnoreCase("1") || temp.equalsIgnoreCase("easy")) {
			try {
				if(number==10) {
					game.setWinner(false);
					Repeat.Method_Repeat();
					int accept;
					accept=Repeat.getResult();
					if(accept==JOptionPane.YES_OPTION) {
						Repeat.Method_Calculating(accept);
					}else if(accept==JOptionPane.NO_OPTION) {
						ImageIcon icon = new ImageIcon("pictures//snake.jpeg");
						ImageIcon babak = new ImageIcon("picturesbabakyousefianPicture.jpg");
						StringBuilder stringBuilder = new StringBuilder();
						stringBuilder.append("Dear ");
						stringBuilder.append(Name.getName());
						stringBuilder.append("\n");
						stringBuilder.append("Thank you for your spending your time...");
						JOptionPane.showMessageDialog(null , stringBuilder.toString() , "Snake Game" , JOptionPane.OK_OPTION , icon);
						JOptionPane.showMessageDialog(null , "The programmer of this game is:\n\"babak yousefian\"" , "Snake Game" , JOptionPane.OK_OPTION , babak);
					}
				}
			}catch (Exception e) {
				// TODO: handle exception
				System.err.println("\n\n " + e.getMessage());
			}
		}else if(temp.equalsIgnoreCase("2") || temp.equalsIgnoreCase("medium")) {
			try {
				if(number==15) {
					game.setWinner(false);
					Repeat.Method_Repeat();
					int accept;
					accept=Repeat.getResult();
					if(accept==JOptionPane.YES_OPTION) {
						Repeat.Method_Calculating(accept);
					}else if(accept==JOptionPane.NO_OPTION) {
						ImageIcon icon = new ImageIcon("pictures//snake.jpeg");
						ImageIcon babak = new ImageIcon("pictures//babakyousefianPicture.jpg");
						StringBuilder stringBuilder = new StringBuilder();
						stringBuilder.append("Dear ");
						stringBuilder.append(Name.getName());
						stringBuilder.append("\n");
						stringBuilder.append("Thank you for your spending your time...");
						JOptionPane.showMessageDialog(null , stringBuilder.toString() , "Snake Game" , JOptionPane.OK_OPTION , icon);
						JOptionPane.showMessageDialog(null , "The programmer of this game is:\n\"babak yousefian\"" , "Snake Game" , JOptionPane.OK_OPTION , babak);
						}
				}
			}catch (Exception e) {
				// TODO: handle exception
				System.err.println("\n\n " + e.getMessage());
			}
		}else if(temp.equalsIgnoreCase("3") || temp.equalsIgnoreCase("hard")) {
			try {
				if(number==23) {
					game.setWinner(false);
					Repeat.Method_Repeat();
					int accept;
					accept=Repeat.getResult();
					if(accept==JOptionPane.YES_OPTION) {
						Repeat.Method_Calculating(accept);
					}else if(accept==JOptionPane.NO_OPTION) {
						ImageIcon icon = new ImageIcon("pictures//snake.jpeg");
						ImageIcon babak = new ImageIcon("pictures//babakyousefianPicture.jpg");
						StringBuilder stringBuilder = new StringBuilder();
						stringBuilder.append("Dear ");
						stringBuilder.append(Name.getName());
						stringBuilder.append("\n");
						stringBuilder.append("Thank you for your spending your time...");
						JOptionPane.showMessageDialog(null , stringBuilder.toString() , "Snake Game" , JOptionPane.OK_OPTION , icon);
						JOptionPane.showMessageDialog(null , "The programmer of this game is:\n\"babak yousefian\"" , "Snake Game" , JOptionPane.OK_OPTION , babak);
						}
				}
			}catch (Exception e) {
				// TODO: handle exception
				System.err.println("\n\n " + e.getMessage());
			}
		}else if(temp!="1" && temp!="2" && temp!="3" && temp!="easy" && temp!="medium" && temp!="hard") {
			try {
				//game.setGameOver(false);
			JOptionPane.showConfirmDialog(null , "invalid input...!\nplease try again later" , "Snake Game" , JOptionPane.ERROR_MESSAGE);
			}catch(Exception e) {
				System.err.println("\n\n invalid input...!");
			}
		}
	}
	
	public void SnakeVSMonster() {
		
		String temp = selector.getValue();
		if(temp.equalsIgnoreCase("1") || temp.equalsIgnoreCase("easy")) {
			if(game.monsterObject.collision1()==true) {
				try {
					game.setGameOver(false);
					Repeat.Method_Repeat();
					int accept;
					accept=Repeat.getResult();
					if(accept==JOptionPane.YES_OPTION) {
						Repeat.Method_Calculating(accept);
					}else if(accept==JOptionPane.NO_OPTION) {
						ImageIcon icon = new ImageIcon("pictures//snake.jpeg");
						ImageIcon babak = new ImageIcon("pictures//babakyousefianPicture.jpg");
						StringBuilder stringBuilder = new StringBuilder();
						stringBuilder.append("Dear ");
						stringBuilder.append(Name.getName());
						stringBuilder.append("\n");
						stringBuilder.append("Thank you for your spending your time...");
						JOptionPane.showMessageDialog(null , stringBuilder.toString() , "Snake Game" , JOptionPane.OK_OPTION , icon);
						JOptionPane.showMessageDialog(null , "The programmer of this game is:\n\"babak yousefian\"" , "Snake Game" , JOptionPane.OK_OPTION , babak);
						}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}else if(temp.equalsIgnoreCase("2") || temp.equalsIgnoreCase("medium")) {
			if(game.monsterObject.collision1()==true || game.monsterObject2.collision1()==true) {
				try {
					game.setGameOver(false);
					Repeat.Method_Repeat();
					int accept;
					accept=Repeat.getResult();
					if(accept==JOptionPane.YES_OPTION) {
						Repeat.Method_Calculating(accept);
					}else if(accept==JOptionPane.NO_OPTION) {
						ImageIcon icon = new ImageIcon("pictures//snake.jpeg");
						ImageIcon babak = new ImageIcon("pictures//babakyousefianPicture.jpg");
						StringBuilder stringBuilder = new StringBuilder();
						stringBuilder.append("Dear ");
						stringBuilder.append(Name.getName());
						stringBuilder.append("\n");
						stringBuilder.append("Thank you for your spending your time...");
						JOptionPane.showMessageDialog(null , stringBuilder.toString() , "Snake Game" , JOptionPane.OK_OPTION , icon);
						JOptionPane.showMessageDialog(null , "The programmer of this game is:\n\"babak yousefian\"" , "Snake Game" , JOptionPane.OK_OPTION , babak);
						}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}else if(temp.equalsIgnoreCase("3") || temp.equalsIgnoreCase("hard")) {
			if(game.monsterObject.collision1()==true || game.monsterObject2.collision1()==true || game.monsterObject3.collision1()==true) {
				try {
					game.setGameOver(false);
					Repeat.Method_Repeat();
					int accept;
					accept=Repeat.getResult();
					if(accept==JOptionPane.YES_OPTION) {
						Repeat.Method_Calculating(accept);
					}else if(accept==JOptionPane.NO_OPTION) {
						ImageIcon icon = new ImageIcon("pictures//snake.jpeg");
						ImageIcon babak = new ImageIcon("pictures//babakyousefianPicture.jpg");
						StringBuilder stringBuilder = new StringBuilder();
						stringBuilder.append("Dear ");
						stringBuilder.append(Name.getName());
						stringBuilder.append("\n");
						stringBuilder.append("Thank you for your spending your time...");
						JOptionPane.showMessageDialog(null , stringBuilder.toString() , "Snake Game" , JOptionPane.OK_OPTION , icon);
						JOptionPane.showMessageDialog(null , "The programmer of this game is:\n\"babak yousefian\"" , "Snake Game" , JOptionPane.OK_OPTION , babak);
						}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}else if(temp!="1" && temp!="2" && temp!="3" && temp!="easy" && temp!="medium" && temp!="hard") {
			try {
				//game.setGameOver(false);
			JOptionPane.showConfirmDialog(null , "invalid input...!\nplease try again later" , "Snake Game" , JOptionPane.ERROR_MESSAGE);
			}catch(Exception e) {
				System.err.println("\n\n invalid input...!");
			}
		}
	}
	
	public void CoinVSMonster() {
		String temp = selector.getValue();
		
		if(temp.equalsIgnoreCase("1") || temp.equalsIgnoreCase("easy")) {
			if(game.monsterObject.collision2()==true) {
				try {
				game.coinObject.XYrandom();
				}catch (Exception e) {
					// TODO: handle exception
					System.err.println("\n\n "+e.getMessage());
				}
			}
		}else if(temp.equalsIgnoreCase("2") || temp.equalsIgnoreCase("medium")) {
			if(game.monsterObject.collision2()==true || game.monsterObject2.collision2()==true) {
				try {
				game.coinObject.XYrandom();
				}catch (Exception e) {
					// TODO: handle exception
					System.err.println("\n\n " + e.getMessage());
				}
			}
		}else if(temp.equalsIgnoreCase("3") || temp.equalsIgnoreCase("hard")) {
			if(game.monsterObject.collision2()==true || game.monsterObject2.collision2()==true || game.monsterObject3.collision2()==true) {
				try {
				game.coinObject.XYrandom();
				}catch (Exception e) {
					// TODO: handle exception
					System.err.println("\n\n " + e.getMessage());
				}
			}
		}else if(temp!="1" && temp!="2" && temp!="3" && temp!="easy" && temp!="medium" && temp!="hard") {
			try {
				//game.setGameOver(false);
			JOptionPane.showConfirmDialog(null , "invalid input...!\nplease try again later" , "Snake Game" , JOptionPane.ERROR_MESSAGE);
			}catch(Exception e) {
				System.err.println("\n\n invalid input...!");
			}
		}
	}
	
	public void getCoinPos() {
		if(coinPos==0) {
			game.coinObject.XYrandom();
			coinPos++;
		}
	}
	
	public void getMonster1Pos() {
		if(monster1Pos==0) {
			game.monsterObject.XYMonster1Random();
			monster1Pos++;
		}
	}
	
	public void getMonster2Pos() {
		if(monster2Pos==0) {
			game.monsterObject2.XYMonster2Random();
			monster2Pos++;
		}
	}
	
	public void getMonster3Pos() {
		if(monster3Pos==0) {
			game.monsterObject3.XYMonster3Random();
			monster3Pos++;
		}
	}
	
	public Player(Game game) {
		// TODO Auto-generated constructor stub
		
		this.game=game;
		
	}

}
