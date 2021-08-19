package jdialogexamples;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Solve1 extends JFrame implements ActionListener {
	 
		static Solve1 s;
		JDialog d, d2;
		
		static JButton b = new JButton("Click");
		
		public static void main(String[] args) {
			
			s = new Solve1();
			s.setTitle("My Frame");
			
			JPanel p = new JPanel();
			 
			p.add(b);
			
			s.add(p);
			
			b.addActionListener(s);
			
		    //	s.setSize(400, 400);
			s.setBounds(50, 50, 400, 400);
			s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			//s.setLocationRelativeTo(null);
			s.setVisible(true);
			
		}

		@Override
		public void actionPerformed(ActionEvent e) {

			String str = e.getActionCommand();
			if (str.equals("Click"))
			{
	          d = new JDialog(s, "Dialog Box1");
	          JPanel p = new JPanel();
	          JButton b = new JButton("Click me");
	          p.add(b);
	          b.addActionListener(s);
	          
	         JLabel l = new JLabel("This is a first dialog box");
	         p.add(l);
	         d.add(p);
	        // d.setSize(200, 200);
	      //   d.setLocationRelativeTo(null);
	         d.setBounds(50, 50, 200, 200);
	         d.setVisible(true);
	         
			}
			
			else 
			{
				d2 = new JDialog(d, "Dialog Box2");
				JLabel l2 = new JLabel("This is a second dialog box");
		         d2.add(l2);
		        
		        // d2.setSize(200, 200);
		         //d2.setLocation(200, 200);
		         d2.setBounds(250, 250, 200, 200);
		         d2.setVisible(true);
				
			}
			
		}
}