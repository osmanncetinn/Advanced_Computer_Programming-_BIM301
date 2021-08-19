import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class JTableOrnek1 {

	public static void main(String[] args) {

     JFrame f = new JFrame("JTable");
    // f.setLocationRelativeTo(null);
     f.setBounds(100, 100, 500, 300);
     
     JPanel componentPanel = new JPanel();
     
     JScrollPane scroller = new JScrollPane();
     scroller.setBounds(20, 20, 50, 20);
     componentPanel.add(scroller);
     
     JTable table = new JTable();
     scroller.setViewportView(table);
     
     String[] ilkdizi = new String[3];
     
     String[][] ikincidizi = new String[4][3];
     
     
     ikincidizi[0][0] = "10";
     ikincidizi[0][1] = "Ridvan";
     ikincidizi[0][2] = "Çakýr";
     
     
     ikincidizi[1][0] = "20";
     ikincidizi[1][1] = "Aykut";
     ikincidizi[1][2] = "Yýlmaz";
     
     
     ikincidizi[2][0] = "30";
     ikincidizi[2][1] = "Ethem";
     ikincidizi[2][2] = "Þanver";
     
     
     ikincidizi[3][0] = "40";
     ikincidizi[3][1] = "Anmet";
     ikincidizi[3][2] = "Akpýnar";
     
     ilkdizi[0] = "No";
     ilkdizi[1] = "Ad";
     ilkdizi[2] = "Soyad";
     
     TableModel tmodel = new DefaultTableModel(ikincidizi,ilkdizi);
     table.setModel(tmodel);
     
     f.add(componentPanel);
     f.setVisible(true);

	}

}



