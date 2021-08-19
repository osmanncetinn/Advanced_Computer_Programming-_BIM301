package JFrameOrnekleri2;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ShowGridLayout  extends JFrame{
	
	
	public ShowGridLayout(){
		
		setLayout(new GridLayout(3, 2, 5,5));
		
		JLabel label =new JLabel("Ad�: ");
		label.setForeground(Color.GREEN);
		label.setFont(new Font("Times New Roman", Font.BOLD, 12));
		label.setToolTipText("Ad�n�z� giriniz");
		add(label);
		
		add(new JTextField(8));
		
		label =new JLabel("Soyad�: ");
		label.setForeground(Color.RED);
		label.setFont(new Font("Times New Roman", Font.BOLD, 12));
		label.setToolTipText("Soyad�n�z� giriniz");
		add(label);
		
		add(new JTextField(8));
		
		
		label =new JLabel("Ya��: ");
		label.setForeground(Color.BLUE);
		label.setFont(new Font("Times New Roman", Font.BOLD, 12));
		label.setToolTipText("Ya��n�z� giriniz");
		add(label);
		
		add(new JTextField(8));
		
		
		
	}

	public static void main(String[] args) {
		
		
     ShowGridLayout cerceve = new ShowGridLayout();
		
		cerceve.setSize(350, 200);
		cerceve.setLocationRelativeTo(null);
		cerceve.setVisible(true);
		cerceve.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
