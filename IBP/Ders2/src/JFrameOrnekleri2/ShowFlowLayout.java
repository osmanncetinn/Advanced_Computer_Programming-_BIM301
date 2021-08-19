package JFrameOrnekleri2;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ShowFlowLayout extends JFrame{
	
	
	
	public ShowFlowLayout(){
		
		setLayout(new FlowLayout(FlowLayout.LEFT,5, 10));
		add(new JLabel("Ad�:"));
		add(new JTextField(8));
		
		add(new JLabel("Soyad�"));
		add(new JTextField(8));
		
		add(new JLabel("Ya��:"));
		add(new JTextField(8));
		
		
	}

	

	public static void main(String[] args) {

		ShowFlowLayout cerceve = new ShowFlowLayout();
		
		cerceve.setSize(300, 200);
		cerceve.setLocationRelativeTo(null);
		cerceve.setVisible(true);
		cerceve.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}
