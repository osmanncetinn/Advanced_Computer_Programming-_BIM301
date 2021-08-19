import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;


public class comboBoxOrnek1 {

	public static void main(String[] args) {
		
		String[] ulke = {"Türkiye", "Azerbaycan", "Kazakistan", "Kýrgýzistan",
				"Japonya", "Kanada", "ABD", "SON"};
		
		int ulkeSayisi = 10;
		JFrame f = new JFrame();
		f.setTitle("Combo Box" );
		f.setSize(400, 100);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocationRelativeTo(null);
		
		JComboBox combobox1 = new JComboBox(ulke);
		combobox1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {

             JComboBox secilenbox =(JComboBox) e.getSource();
             
             if("SON".equals(secilenbox.getSelectedItem()))
            	 
            	 System.exit(0);
				
			}
			
			
		});
		
		
		f.add(combobox1, BorderLayout.WEST);
		
		
		JComboBox comboBox2 = new JComboBox(ulke);
		
		comboBox2.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				

         if("Kazakistan".equals(comboBox2.getSelectedItem()))
        	 comboBox2.setMaximumRowCount(3);
         
         else if(!"Kazakistan".equals(comboBox2.getSelectedItem()))
        	 
        	 comboBox2.setMaximumRowCount(ulkeSayisi);
				
			}
			
		});
		
		f.add(comboBox2, BorderLayout.CENTER);
		
		JComboBox comboBox3 = new JComboBox(ulke);
		
		comboBox3.setEditable(true);
		
		comboBox3.setSelectedItem("Azerbaycan");
		comboBox3.setMaximumRowCount(5);
		
		f.add(comboBox3, BorderLayout.EAST);
		
		
		f.setVisible(true);
		
		
		
		}
	}


