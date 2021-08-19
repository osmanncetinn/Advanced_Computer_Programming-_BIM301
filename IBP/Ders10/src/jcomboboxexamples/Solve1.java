package jcomboboxexamples;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Solve1 extends JFrame implements ItemListener{

	static JComboBox c1;
	static Solve1 s;
	static JLabel l1, l2;
	
	public static void main(String[] args) {
		
		s = new Solve1();
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
        s.add(p);
        s.setVisible(true);
        s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    

	}

	@Override
	public void itemStateChanged(ItemEvent e) {

		 l2.setText("Yout city is " + c1.getSelectedItem() + "");
		
	}

}
