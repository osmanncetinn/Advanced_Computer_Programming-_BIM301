import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class AdminPanel extends JFrame implements ActionListener{
  
	static final char[] dogruSifre ={'m', 's', 'f','t'};
	private JButton jbOnay;
	private JButton jbCik;
	private JTextField KullaniciAdi;
	private JPasswordField jpw;
	
	public static void main(String[] args) {

     AdminPanel admin = new AdminPanel();
     admin.setTitle("Kullanýcý Giriþi");
     
     admin.setSize(300, 200);
     admin.setLocationRelativeTo(null);
     admin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     admin.olustur();
     admin.setVisible(true);

	}
	
	
	public void olustur(){
		
		Container cont = getContentPane();
		cont.setLayout(new FlowLayout());
		
		JLabel label1 = new JLabel("Kullanýcý: ");
		JLabel label2 = new JLabel("Þifre: ");
		
		KullaniciAdi = new JTextField();
		KullaniciAdi.setPreferredSize(new Dimension(200, 30));
		
		
		jpw = new JPasswordField();
		jpw.setPreferredSize(new Dimension(200, 30));
		
		// þifre karakteri seç
		
		jpw.setEchoChar('*');
		
		//etiket bileþenini text alanýný gösterecek þekilde ayarla
		
		label1.setLabelFor(KullaniciAdi);
		
		label2.setLabelFor(jpw);
		
		jbOnay = new JButton("ONAY");
		jbOnay.setPreferredSize(new Dimension(70, 30));
		
		jbCik = new JButton("ÇIK");
		jbCik.setPreferredSize(new Dimension(70, 30));
		
		jbOnay.addActionListener(this);
		
		jbCik.addActionListener(this);
		cont.add(label1);
		cont.add(KullaniciAdi);
		cont.add(label2);
		cont.add(jpw);
		cont.add(jbOnay);
		cont.add(jbCik);
		
		repaint();
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {

       komutuSec(e);
		
	}
	
	
	
	public boolean sifreDogru(char[] sf){
		boolean dogru = true;
		
		if (sf.length != dogruSifre.length){
			
			
			return false;
			
		}
		dogru = Arrays.equals(sf, dogruSifre);
		return dogru;
	}
		
	
	 
	public void komutuSec(ActionEvent e){
		
		
		String olayKomutu = e.getActionCommand();
		
		if (olayKomutu.equals("ONAY")){
			
			
			char sifre[] =   jpw.getPassword();
			
			if (sifreDogru(sifre) && KullaniciAdi.getText().equals("Mustafa Dikici")){
				
				JOptionPane.showMessageDialog(this, "Kullanýcý ve Þifre Doðru", 
						"Þifre Giriþi", JOptionPane.INFORMATION_MESSAGE);
			}
			
			
			else {
				
				JOptionPane.showMessageDialog(this, "Þifre veya Kullanýcý Adý Hatalýdýr\nTekrar Deneyiniz",
						"Hatalý giriþ",JOptionPane.WARNING_MESSAGE);
			}


			
			
			
			
		}
		
		
		else {
			
			System.exit(0);
		}
		
		
	}

}







