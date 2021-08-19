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
     admin.setTitle("Kullan�c� Giri�i");
     
     admin.setSize(300, 200);
     admin.setLocationRelativeTo(null);
     admin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     admin.olustur();
     admin.setVisible(true);

	}
	
	
	public void olustur(){
		
		Container cont = getContentPane();
		cont.setLayout(new FlowLayout());
		
		JLabel label1 = new JLabel("Kullan�c�: ");
		JLabel label2 = new JLabel("�ifre: ");
		
		KullaniciAdi = new JTextField();
		KullaniciAdi.setPreferredSize(new Dimension(200, 30));
		
		
		jpw = new JPasswordField();
		jpw.setPreferredSize(new Dimension(200, 30));
		
		// �ifre karakteri se�
		
		jpw.setEchoChar('*');
		
		//etiket bile�enini text alan�n� g�sterecek �ekilde ayarla
		
		label1.setLabelFor(KullaniciAdi);
		
		label2.setLabelFor(jpw);
		
		jbOnay = new JButton("ONAY");
		jbOnay.setPreferredSize(new Dimension(70, 30));
		
		jbCik = new JButton("�IK");
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
				
				JOptionPane.showMessageDialog(this, "Kullan�c� ve �ifre Do�ru", 
						"�ifre Giri�i", JOptionPane.INFORMATION_MESSAGE);
			}
			
			
			else {
				
				JOptionPane.showMessageDialog(this, "�ifre veya Kullan�c� Ad� Hatal�d�r\nTekrar Deneyiniz",
						"Hatal� giri�",JOptionPane.WARNING_MESSAGE);
			}


			
			
			
			
		}
		
		
		else {
			
			System.exit(0);
		}
		
		
	}

}







