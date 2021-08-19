package jdialogexamples;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Solve extends JFrame implements ActionListener {
 
	static Solve s;
	static JButton b = new JButton("Click");
	
	public static void main(String[] args) {
		
		s = new Solve();
		s.setTitle("My Frame");
		
		JPanel p = new JPanel();
		 
		p.add(b);
		
		s.add(p);
		
		b.addActionListener(s);
		
		s.setSize(400, 400);
		s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		s.setLocationRelativeTo(null);
		s.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

         JDialog d = new JDialog(s, "Dialog Box");
         JLabel l = new JLabel("This iþ a dialog box");
         d.add(l);
         d.setSize(100, 100);
         d.setLocationRelativeTo(null);
         d.setVisible(true);
		
	}

}
