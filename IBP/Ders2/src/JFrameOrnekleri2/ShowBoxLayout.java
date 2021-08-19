package JFrameOrnekleri2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ShowBoxLayout extends JFrame{
	
	
	
	public ShowBoxLayout(){
		
		setLayout(new BorderLayout());
		
		JPanel panel1 = new JPanel();
		
		panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
		panel1.add(new JButton("bir"));
		panel1.add(new JButton("iki"));
		
		panel1.add(new JButton("üç"));
		panel1.add(new JButton("dört"));
		
		
		add(panel1, BorderLayout.WEST);
		
		JPanel panel2 = new JPanel();
		
		panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));
		panel2.add(new JButton("beþ"));
		panel2.add(new JButton("altý"));
		
		panel2.add(new JButton("yedi"));
		panel2.add(new JButton("sekiz"));
		
		add(panel2, BorderLayout.CENTER);
		
		JPanel panel3 = new JPanel();
		panel3.setLayout(new BoxLayout(panel3, BoxLayout.X_AXIS));
		
		JButton button = new JButton("Toplama");
		button.setBackground(Color.pink);
		button.setFont(new Font("Arial", Font.BOLD, 20));
		
		panel3.add(button);
		button =new JButton("Çýkarma");
		button.setBackground(Color.blue);
		button.setFont(new Font("Arial", Font.ITALIC, 20));
		panel3.add(button);
		
		add(panel3, BorderLayout.SOUTH);
		
	}

	public static void main(String[] args) {

    ShowBoxLayout cerceve = new ShowBoxLayout();
    cerceve.setTitle("Hesap Makinesi");
    cerceve.setSize(350, 250);
    cerceve.setLocation(1000, 200);
    cerceve.setVisible(true);
    cerceve.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
