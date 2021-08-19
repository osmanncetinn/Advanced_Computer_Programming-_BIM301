import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Sayac extends JFrame   implements ActionListener{
	
	private int i;
	private JButton button;

	public static void main(String[] args) {
		
		Sayac sayac  = new Sayac();
		sayac.setTitle("Sayac");
		sayac.setLocationRelativeTo(null);
		sayac.setSize(300, 80);
		sayac.artir();
		sayac.setVisible(true);
		



	}

	public void artir(){
		
		Container cont = getContentPane();
		cont.setLayout(new FlowLayout());
		button = new JButton("TIKLA");
		button.setForeground(Color.RED);
		button.setBackground(Color.darkGray);
		button.setToolTipText("Butona Týkla");
		button.addActionListener(this);
		cont.add(button);
	//	add(cont);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		
		i = i + 1;

  JOptionPane.showMessageDialog(null, "Button " + i, "Sonuçlar",
		  JOptionPane.INFORMATION_MESSAGE);
		
	}

	
}
