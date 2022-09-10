/*
 *this class was created by babak yousefian , from Iran , Lorestan
 */
package snake_Game_Package;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	public Main() {
		
		try {
			Game game = new Game();
			addKeyListener(game);
			add(game);
			setTitle("Snake");
			setSize(1079,720);
			setLocationRelativeTo(null);
			setResizable(false);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setVisible(true);
		}catch(Exception exception) {
			System.err.println("\n\n ERORR PROGRAM...!!!");
		}
		
	}
	
	public static void main(String[] args) {
		try {
			// TODO Auto-generated method stub
			Starter_Of_Game starter = new Starter_Of_Game();
			starter.main(null);
			Calculate(starter.getResult());
		}catch(Exception exception) {
			System.err.println("\n\n ERORR PROGRAM...!!!");
		}
		
	}
	
	public static void Calculate(int x) {
		
		try {
			if(x==JOptionPane.YES_OPTION) {
				Name.Method_Name();
				Selector selector = new Selector();
				selector.Main(null);
				//Notification.Notif();
				Notification.Notif();
				new Main();
			}else if(x==JOptionPane.NO_OPTION) {}
		}catch(Exception e) {
			System.err.println("\n\n Main.ERROR...!");
		}
		
	}
}
