/*
 *this class was created by babak yousefian , from Iran
 */
package snake_Game_Package;

import javax.swing.JOptionPane;

public class Selector {
	
	private static String value;
	
	public Selector() {
		// TODO Auto-generated constructor stub
			
	}
	
	public void Main(String[] args) {
		
		try {
			StringBuilder stringBuilder = new StringBuilder();
			stringBuilder.append("Dear ");
			stringBuilder.append(Name.getName());
			stringBuilder.append(" Would you please select your level?\n\n1)easy - (collect 10 coins)\n\n2)medium - (collect 15 coins)\n\n3)hard - (collect 23 coins)\n\n");
			setValue(JOptionPane.showInputDialog(null , stringBuilder.toString() , "Snake Game" , JOptionPane.QUESTION_MESSAGE));
		}catch(Exception e) {
			System.err.println("\n\nSelector.ERROR...!!!");
		}
		
	}
	public String getValue() {
		return value;
	}

	public static void setValue(String value) {
		Selector.value = value;
	}
	
}