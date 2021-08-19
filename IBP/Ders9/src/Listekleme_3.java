import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class Listekleme_3  extends JFrame{
	
	private String[] zamirler ={"ben     ", "sen     ", "o     ", "biz     ", 
			"siz     ", "onlar     "};
	
	
	private JList liste1 = new JList(zamirler);
	
	private JList liste2 = new JList();
	
	
	public Listekleme_3(){
		
		Container cont = getContentPane();
		cont.setLayout(new GridLayout(2, 2));
		JLabel label1 = new JLabel("LÝSTE1");
		JLabel label2 = new JLabel("LÝSTE2");
		cont.add(label1);
		cont.add(label2);
		JScrollPane scroller1 = new JScrollPane(liste1);
		JScrollPane scroller2 = new JScrollPane(liste2);
		cont.add(scroller1);
		cont.add(scroller2);
		
		liste1.addListSelectionListener(new ListSelectionListener(){

			@Override
			public void valueChanged(ListSelectionEvent arg0) {
				Object[] secilmisler = liste1.getSelectedValues();
				liste2.setListData(secilmisler);
			}
			
		});
		

}
}