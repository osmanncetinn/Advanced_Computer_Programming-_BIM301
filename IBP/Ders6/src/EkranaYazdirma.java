import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class EkranaYazdirma extends JFrame implements ActionListener{
	
	private JTextField birMetinAlani = new JTextField(12);
	private JButton birButon = new JButton("Ekrana Yazdýr");
	private JLabel birEtiket = new JLabel("Bir Yazý Yazýp Ekrana Yazdýr Düðmesine Týklayýn");

	public EkranaYazdirma(){
		
		setSize(300, 300);
		Container cont = getContentPane();
		cont.setLayout(new FlowLayout());
		
		cont.add(birMetinAlani);
		cont.add(birButon);
		cont.add(birEtiket);
		birButon.addActionListener(this);
		//add(cont);
		
	}
	
	public static void main(String[] args) {

     EkranaYazdirma yazdir = new EkranaYazdirma();
     yazdir.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     yazdir.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {

    String metin = birMetinAlani.getText();
    birEtiket.setText("Ekrana Girdiðiniz Yazý: \n"  + metin);
		
	}

}
