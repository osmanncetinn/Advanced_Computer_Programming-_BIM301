import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class Birthday extends JFrame implements ListSelectionListener{
	
	
  static JList liste1, liste2, liste3;
  static JLabel label2 = new JLabel();
  
	
	public static void main(String[] args) {

        Birthday bday = new Birthday();
        JPanel panel = new JPanel();
        JLabel label1 = new JLabel("Select your birthday");
        
        String[] months = {"January", "February", "March", "April", "May", "June", 
        		"July", "August", "September", "October", "November", "December"};
        
        liste2 = new JList(months);
        
        JScrollPane scroller2 = new JScrollPane(liste2);
        String date[] = new String[31];
        String year[] = new String[31];
        
        for (int i = 0; i < 31; i++){
        	
        	date[i] = "" + (i + 1);
        	year[i] = "" + (2018 -i);
        	
        }
        
        liste1 = new JList(date);
        JScrollPane scroller1 = new JScrollPane(liste1);
        liste3 = new JList(year);
        JScrollPane scroller3 = new JScrollPane(liste3);
        
        panel.add(label1);
       /* panel.add(liste1);
        panel.add(liste2);
        panel.add(liste3); */
        
        
        panel.add(scroller1);
        panel.add(scroller2);
        panel.add(scroller3);
        
        
        liste1.setSelectedIndex(2);
        liste2.setSelectedIndex(1);
        liste3.setSelectedIndex(0);
        
        label2.setText(liste1.getSelectedValue() + "  " +  liste2.getSelectedValue() 
        		+ "  " + liste3.getSelectedValue());
        
        panel.add(label2);
        bday.add(panel);
       
        liste1.addListSelectionListener(bday);
        liste2.addListSelectionListener(bday);
        liste3.addListSelectionListener(bday);
        
        
	       bday.setSize(500, 300);
	       bday.setLocationRelativeTo(null);
	       bday.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	       bday.setVisible(true);

        
	}

	@Override
	public void valueChanged(ListSelectionEvent arg0) {

      label2.setText(liste1.getSelectedValue() + "  " +  liste2.getSelectedValue() 
      		+ "  " + liste3.getSelectedValue());
		
	}

}











