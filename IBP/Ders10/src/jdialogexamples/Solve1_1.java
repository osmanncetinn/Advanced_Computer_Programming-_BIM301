package jdialogexamples;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Solve1_1 extends JFrame implements ActionListener {
	 
		static Solve1_1 s;
		JDialog d, d2;
		
		static JButton b = new JButton("Click");
		
		
		public Solve1_1(){
			
             setTitle("My Frame");
			
			JPanel p = new JPanel();
			 
			p.add(b);
			
			add(p);
			
			b.addActionListener(this);
			
		    //	setSize(400, 400);
		    setBounds(50, 50, 400, 400);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			//setLocationRelativeTo(null);
			setVisible(true);
			
		}
		
		public static void main(String[] args) {
			
			s = new Solve1_1();
			
			
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
