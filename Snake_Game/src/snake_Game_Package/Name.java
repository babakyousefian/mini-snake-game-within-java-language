package snake_Game_Package;

import javax.swing.JOptionPane;

public class Name {
	
	Game game = new Game();
	
	private static String name;
	
	public Name(Game game) {
		// TODO Auto-generated constructor stub
		
		this.game=game;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Method_Name();
		
	}
	
	public static void Method_Name() {
		
		setName(JOptionPane.showInputDialog(null , "Enter your name please\n\n" , "Snake Game" , JOptionPane.OK_OPTION));
		
	}
	public static String getName() {
		return name;
	}
	public static void setName(String name) {
		Name.name = name;
	}
	
}