/*
 *this class was created by babak yousefian , from Iran
 */
package snake_Game_Package;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Notification {
	
	private Game game;
	
	private static String string;
	
	public Notification(Game game) {
		// TODO Auto-generated constructor stub
		this.setGame(game);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Notif();
		
	}
	
	public static void Notif() {
		
		Selector selector = new Selector();
		ImageIcon icon = new ImageIcon("snake.jpeg");
		string = selector.getValue();
		if(string.equalsIgnoreCase("1") || string.equalsIgnoreCase("easy")) {
			StringBuilder stringBuilder = new StringBuilder();
			stringBuilder.append("Dear ");
			stringBuilder.append(Name.getName());
			stringBuilder.append("\n");
			stringBuilder.append("in this step you should be collect 10 coins to win this game\nand the speed of snake is slow.");
			JOptionPane.showMessageDialog(null , stringBuilder.toString() , "Snake Game" , JOptionPane.OK_OPTION , icon);
		}else if(string.equalsIgnoreCase("2") || string.equalsIgnoreCase("medium")) {
			StringBuilder stringBuilder = new StringBuilder();
			stringBuilder.append("Dear ");
			stringBuilder.append(Name.getName());
			stringBuilder.append("\n");
			stringBuilder.append("in this step you should be collect 15 coins to win this game\nand the speed of snake is medium.");
			JOptionPane.showMessageDialog(null , stringBuilder.toString() , "Snake Game" , JOptionPane.OK_OPTION , icon);
		}else if(string.equalsIgnoreCase("3") || string.equalsIgnoreCase("hard")) {
			StringBuilder stringBuilder = new StringBuilder();
			stringBuilder.append("Dear ");
			stringBuilder.append(Name.getName());
			stringBuilder.append("\n");
			stringBuilder.append("in this step you should be collect 23 coins to win this game\nand the speed of snake is fast.");
			JOptionPane.showMessageDialog(null , stringBuilder.toString() , "Snake Game" , JOptionPane.OK_OPTION , icon);
		}
	}
	public Game getGame() {
		return game;
	}
	public void setGame(Game game) {
		this.game = game;
	}
	
}
