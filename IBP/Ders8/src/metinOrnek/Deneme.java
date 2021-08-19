package metinOrnek;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Deneme extends JFrame{
	
	public Deneme(){
		
		Container cont = getContentPane();
		cont.setLayout(new BorderLayout());
		cont.add(new MetinSecme(),BorderLayout.CENTER);
		cont.add(new JButton("OK"), BorderLayout.SOUTH);
	}

	public static void main(String[] args) {
   
		 Deneme d = new Deneme();
		 d.setSize(400, 400);
		 d.setLocationRelativeTo(null);
		 d.setVisible(true);
    
         d.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
