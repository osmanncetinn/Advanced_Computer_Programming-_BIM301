import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class Oyun2 extends JFrame implements ActionListener{

	private JButton button;
	private JTextField gelenler, sonuc;
	private Random rand;
	
	public static void main(String[] args) {
 
		Oyun2 oyun = new Oyun2();
		
		oyun.setTitle("Oyun");
		oyun.setLocationRelativeTo(null);
		oyun.setSize(300, 150);
		oyun.olustur();
		oyun.setVisible(true);
		

	}

	public void olustur(){
		
		
		Container cont = getContentPane();
		cont.setLayout(new FlowLayout());
		button = new JButton("FIRLAT!");
		button.setFont(new Font("Times New Roman", Font.BOLD, 30));
		button.setForeground(Color.GREEN);
		cont.add(button);
		button.addActionListener(this);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {

		  JFrame frame = new JFrame("Sonuçlar");
		  
		  frame.setLocation(200, 150);
		  frame.setSize(200, 100);
		  frame.setVisible(true);
		  frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		   
		  Container cont = frame.getContentPane();
		  cont.setLayout(new GridLayout(2,1, 40, 14));
		   gelenler = new JTextField(14);
			cont.add(gelenler);
			sonuc = new JTextField(10);
			cont.add(sonuc);
			rand = new Random();
			
           int sayi1, sayi2;
           sayi1 = rand.nextInt(6) + 1;
           sayi2 = rand.nextInt(6) + 1;
           gelenler.setText("Sayi1:" + Integer.toString(sayi1) +
        		   "Sayi2: " + Integer.toString(sayi2));
           
           if (sayi1 == sayi2)
        	   sonuc.setText("Kazandýnýz!");
           else 
        	   
        	   sonuc.setText("Kaybettiniz");
	}

}