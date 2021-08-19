package jcomboboxexamples;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Solve2 extends JFrame implements ItemListener{

	static JComboBox c1, c2;
	static Solve2 s;
	static JLabel l1, l2, l3, l4;
	
	public static void main(String[] args) {
		
		s = new Solve2();
		s.setTitle("Combo Box 1");
		s.setBounds(100, 100, 400, 300);
        JPanel p = new JPanel();
        String cities[] ={"Ankara", "Ýstambul", "Kocaeli", "Bursa", "Þanlý Ufra", "Konya"};
        String gender[] ={"male", "female"};
        
        c1 = new JComboBox(cities);
        c2 = new JComboBox(gender);
        
        l1 = new JLabel("Select your city");
        l2 = new JLabel();
        c1.setSelectedIndex(1);
        l2.setText("Your city is " + c1.getSelectedItem() + "");
        p.add(l1);
        p.add(c1);
         c1.addItemListener(s);
        p.add(l2);
        
        l3 = new JLabel("Select your gender");
        c2.setSelectedIndex(0);
        l4 = new JLabel();
        l4.setText("Your gender is " + c2.getSelectedItem() + "");
        
        p.add(l3);
        p.add(c2);
        p.add(l4);
        c2.addItemListener(s);
        s.add(p);
        s.setVisible(true);
        s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
  
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
  
		
		 l2.setText("Your city is " + c1.getSelectedItem() + "");
		 l4.setText("Your gender is " + c2.getSelectedItem() + "");
		
	}

}
