/*
 *this class was created by babak yousefian , from Iran
 */
package snake_Game_Package;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Repeat {
	
	private Game game;
	
	private static int result;
	
	public Repeat(Game game) {
		// TODO Auto-generated constructor stub
		
		this.setGame(game);
		
	}
	
	public static void main(String[] args) {
		
		Method_Repeat();
		Method_Calculating(getResult());
		
	}
	
	public static void Method_Repeat() {
		
		try {
			StringBuilder stringBuilder = new StringBuilder();
			stringBuilder.append("Dear ");
			stringBuilder.append(Name.getName());
			stringBuilder.append("\n");
			stringBuilder.append("Do you want to play again this game?");
			setResult(JOptionPane.showConfirmDialog(null , stringBuilder.toString() , "Snake Game" , JOptionPane.YES_NO_OPTION));
		}catch (Exception e) {
			// TODO: handle exception
			System.err.println("\n\n " + e.getMessage());
		}
	}

	public static int getResult() {
		return result;
	}

	public static void setResult(int result) {
		Repeat.result = result;
	}
	
	public static void Method_Calculating(int x) {
		
		try {
			if(x==JOptionPane.YES_OPTION) {
				Name.Method_Name();
				Selector selector = new Selector();
				selector.Main(null);
				Notification.Notif();
				new Main();
			}else if(x==JOptionPane.NO_OPTION) {
				ImageIcon icon = new ImageIcon("pictures//snake.jpeg");
				JOptionPane.showMessageDialog(null , "Dear "+Name.getName()+"\n"+"Thank you for your spending your time..." ,"Snake Game" , JOptionPane.OK_OPTION , icon);
			}
		}catch (Exception e) {
			// TODO: handle exception
			System.err.println("\n\n ERORR...REPEAT...!!!");
		}
		
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}
}
