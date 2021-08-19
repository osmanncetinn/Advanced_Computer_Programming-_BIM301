package jtableornek2;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class TableOrnek2 {

	public static void main(String[] args) {

     JFrame f = new JFrame();
     f.setBounds(100, 100, 400, 200);
     JPanel panel = new JPanel();
     JTable table = new JTable();
     JScrollPane scroller = new JScrollPane(table);
    
      scroller.setBounds(10, 23, 30, 10);
    // scroller.setViewportView(table);
     
     panel.add(scroller);
     
     Urun urun = new Urun();
     String basliklar[] = {"id", "Ürün Adý", "Fiyat", "Marka"};
     String urunlerim[][] = new String[urun.getUrunler().size()][];
     
     for(int i = 0; i < urun.getUrunler().size(); i++){
    	 urunlerim[i] = new String[] {
    			 String.valueOf(urun.getUrunler().get(i).getId()), 
    					 urun.getUrunler().get(i).getUrunAdi(),
    					 String.valueOf(urun.getUrunler().get(i).getFiyat()),
    				 urun.getUrunler().get(i).getMarka()
    							 };
    	 
     }
    	 TableModel tmodel = new DefaultTableModel(urunlerim,basliklar);
         table.setModel(tmodel);
          
         f.add(panel);
         f.setVisible(true); 
    	 
     }
     
     
	}


