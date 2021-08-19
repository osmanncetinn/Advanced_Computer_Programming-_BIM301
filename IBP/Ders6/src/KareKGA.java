import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class KareKGA extends JFrame implements ActionListener{
	
	private double kenarUzunlugu = 0;
	private double cevre, alan;

	
	private JLabel birEtiket = new JLabel("Kenar Uzunluðu");
	private JTextField birMetinAlani = new JTextField(5);
	private JButton birButon = new JButton("Hesapla");
	private JTextArea yazdirmaAlani = new JTextArea(2, 20);
	
	
	public KareKGA(){
		 
		setTitle("Kare Çevresi ve Alan Hesaplama");
		setSize(400, 150);
		setLocation(600, 300);
		setLayout(new FlowLayout());
		add(birEtiket);
		add(birMetinAlani);
		add(birButon);
		add(yazdirmaAlani);
		
		birButon.addActionListener(this);
		setVisible(true);
	}
	
	public static void main(String[] args) {

         KareKGA cerceve = new KareKGA();

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String uzunluk = birMetinAlani.getText();
		
		if (uzunluk.length() == 0){
			
			yazdirmaAlani.setText("Kenar Uzunluðu Girmelisiniz!");
		}
		
		else{
			try{
				
    kenarUzunlugu = Double.parseDouble(birMetinAlani.getText());
    
    
    cevre = cevreHesapla(kenarUzunlugu);
    alan = alanHesapla(kenarUzunlugu);
    yazdirmaAlani.setText("Karenin Çeveresi: " + cevre + "\nKarenin Alaný: " + alan);
    
    
			}
			
			catch(Exception ex){
				
				yazdirmaAlani.setText("Düzgün Format Kullanýnýz!!!");
				
				ex.printStackTrace();
				
			}
		}
	}
	
	public double cevreHesapla(double k){
		
		return 4 * k;
	}
	
	
    public double alanHesapla(double k){
		
		return k * k;
	}
	
}




