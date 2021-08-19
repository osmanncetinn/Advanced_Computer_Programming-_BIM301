import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class EkranaYazdirma3 extends JFrame {
	
	private JTextField birMetinAlani = new JTextField();
	private JButton birButon = new JButton("Ekrana Yazdýr");
	private JLabel birEtiket = new JLabel("Bir Yazý Yazýp Ekrana Yazdýr Düðmesine Týklayýn");

	public EkranaYazdirma3(){
		
		setPreferredSize(new Dimension(300, 300));
		Container cont = getContentPane();
		cont.setLayout(new FlowLayout());
		birMetinAlani.setPreferredSize(new Dimension(250, 40));
		cont.add(birMetinAlani);
		cont.add(birButon);
		cont.add(birEtiket);
		birButon.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String metin = birMetinAlani.getText();
			    birEtiket.setText("Ekrana Girdiðiniz Yazý: \n"  + metin);
				
			}
			
		});
		//add(cont);
		
		pack();
		
	}
	
	public static void main(String[] args) {

     EkranaYazdirma3 yazdir = new EkranaYazdirma3();
     yazdir.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     yazdir.setLocation(200, 200);
     yazdir.setVisible(true);
    

}
}