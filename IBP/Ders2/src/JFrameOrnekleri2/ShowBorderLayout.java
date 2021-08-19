package JFrameOrnekleri2;



import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ShowBorderLayout  extends JFrame {
	
	public ShowBorderLayout(){
		
		setLayout(new BorderLayout(20, 10));
		add(new JButton("Güney"), BorderLayout.SOUTH);
		add(new JButton("Kuzey"), BorderLayout.NORTH);
		add(new JButton("Doðu"), BorderLayout.EAST);
		add(new JButton("Batý"), BorderLayout.WEST);
		add(new JButton("Ekvator"), BorderLayout.CENTER);
		
	}
	

	public static void main(String[] args) {
		
		
       ShowBorderLayout cerceve = new ShowBorderLayout();
		
		cerceve.setSize(350, 200);
		cerceve.setLocationRelativeTo(null);
		cerceve.setVisible(true);
		cerceve.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
