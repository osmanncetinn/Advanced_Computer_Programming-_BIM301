package jcomboboxexamples;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Solve3 extends JFrame implements ItemListener, ActionListener{

	static JComboBox c1;
	static Solve3 s;
	static JLabel l1, l2;
	static JTextField tf;
	static JButton b, b2;
	
	public static void main(String[] args) {
		
		s = new Solve3();
		s.setTitle("Combo Box 1");
		s.setBounds(100, 100, 400, 300);
        JPanel p = new JPanel();
        String sehirler[] ={"Ankara", "Ýstambul", "Kocaeli", "Bursa", "Þanlý Ufra", "Konya"};
        c1 = new JComboBox(sehirler);
        l1 = new JLabel("Select your city");
        l2 = new JLabel();
        c1.setSelectedIndex(1);
        l2.setText("Yout city is " + c1.getSelectedItem() + "");
        p.add(l1);
        p.add(c1);
         c1.addItemListener(s);
         
         
        p.add(l2);
        
        tf = new JTextField(16);
        p.add(tf);
        
         b = new JButton("Add");
        b2 = new JButton("Remove");
        b.addActionListener(s);
        b2.addActionListener(s);
        p.add(b);
        p.add(b2);
        s.add(p);
        s.setVisible(true);
        s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    

	}

	@Override
	public void itemStateChanged(ItemEvent e) {

		 l2.setText("Yout city is " + c1.getSelectedItem() + "");
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		Object source = e.getSource();
		if (source == b)
         c1.addItem(tf.getText());
		else if (source == b2)
         c1.removeItem(tf.getText());
		
	}


}
