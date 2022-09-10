/*
 *this class was created by babak yousefian , from Iran
 */
package snake_Game_Package;

import javax.swing.*;

public class Starter_Of_Game {
	
	private static int result;
	
	public Starter_Of_Game() {
		// TODO Auto-generated constructor stub
	}
	
	public void main(String[] args) {
		
		try {
			ImageIcon icon = new ImageIcon("snake.jpeg");
			JOptionPane.showMessageDialog(null , "Welcome to Snake Game" , "Snake Game" , JOptionPane.QUESTION_MESSAGE , icon);
			setResult(JOptionPane.showConfirmDialog(null , "Do you want to play this game?" , "Snake Game" , JOptionPane.YES_NO_OPTION));
		}catch(Exception e) {
			System.err.println("\n\n Starter.ERROR...!!!");
		}
		
	}

	public int getResult() {
		return result;
	}

	public static void setResult(int result) {
		Starter_Of_Game.result = result;
	}
	
}