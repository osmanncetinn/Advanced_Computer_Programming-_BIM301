import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;


public class JListOrnek1 extends JFrame{

	
	String[]  bolumler = {"Biyoloji"," Fizik", "Kimya", "Matematik", 
			"Bilgisayar", "Ýstatistik", "Ekonomi", "Hukuk", "Týp", "Eczacýlýk"};
	
	
	JList liste = new JList(bolumler);
	
	
	public JListOrnek1(){
		
		super("Liste");
		Container cont = getContentPane();
		//setLayout(new FlowLayout());
		setSize(150, 300);
		JPanel panel = new JPanel();
		JLabel label = new JLabel("Bölümlerin Listesi");
		JScrollPane scroller = new JScrollPane(liste);
		panel.add(label);
		panel.add(scroller);
		cont.add(panel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {


		JListOrnek1 ornek1 = new JListOrnek1();
		
		
		
		}

	}



