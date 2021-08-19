package JFrameOrnekleri2;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class OlayveDinleyici extends JFrame implements ActionListener{

	JButton button;
	public static void main(String[] args) {

     OlayveDinleyici cerceve = new OlayveDinleyici();
     
     cerceve.setTitle("My Frame");
     cerceve.setSize(300, 80);
     cerceve.setLocationRelativeTo(null);
      cerceve.setBackground(Color.CYAN);
      cerceve.buttonaTikla();
      cerceve.setVisible(true);
      
      
	}
	
	public void buttonaTikla(){
		
		Container cn = getContentPane();
		cn.setLayout(new FlowLayout());
		button = new JButton("TIKLA");
		button.addActionListener(this);
		cn.add(button);
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		
		int uzunluk = 20;
		int genislik = 10;
		int alan = uzunluk *genislik;
		String output = " " + alan;

      JOptionPane.showMessageDialog(null, output, "Alan Hesaplanlasý", JOptionPane.PLAIN_MESSAGE);
	}




}
