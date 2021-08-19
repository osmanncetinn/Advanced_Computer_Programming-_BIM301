package radyo;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class RadyoKGA extends JFrame implements ActionListener{
	
	static RadyoKGA r;
	static Radyo birRadyo;
	private JButton acKapat = new JButton("Radyo Aç/Kapat");
	private JLabel frekans = new JLabel("Frekans");
	private JTextField frekansAlani = new JTextField(5);
	private JButton frekansDegistir = new JButton("Frekans Deðiþtir");
	private JLabel sesDuzeyi = new JLabel("Ses Aç");
	private JTextField sesDuzeyiAlani = new JTextField(5);
	private JButton sesAc = new JButton("Ses Aç");
	private JButton sesKis = new JButton("Ses Kýs");
	
	private JTextArea yazdirmaAlani = new JTextArea(3, 12);
	
	public RadyoKGA(){
		Container cont = getContentPane();
		setTitle("RADYO");
		setSize(180, 280);
		setLocationRelativeTo(null);
		
		cont.setLayout(new FlowLayout());
		cont.add(acKapat);
		cont.add(frekans);
		cont.add(frekansAlani);
		cont.add(frekansDegistir);
	cont.add(sesDuzeyi);
	cont.add(sesDuzeyiAlani);
	cont.add(sesAc);
	cont.add(sesKis);
	cont.add(yazdirmaAlani);
	
	acKapat.addActionListener(this);
	frekansDegistir.addActionListener(this);
		sesAc.addActionListener(this);
		sesKis.addActionListener(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		
	}

	public static void main(String[] args) {
 
		 r = new RadyoKGA();
		 birRadyo = new Radyo();


	}

	@Override
	public void actionPerformed(ActionEvent olay) {

      if (olay.getSource() == acKapat){
    	  
    	  birRadyo.acKapat();
    	  
    	  yazdirmaAlani.setText("Açýk:" + birRadyo.acik +"\nFrekans: " 
    	  + birRadyo.simdikiFrekans
    	  +"\nSes Düzeyi: " + birRadyo.simdikiSesDuzeyi);
      }
		
      if(olay.getSource() == frekansDegistir){
    	  
    	  String girilenFrekans = frekansAlani.getText();
    	   
    	  if (girilenFrekans.length() == 0)
    		  
    		   yazdirmaAlani.setText("Bir frekans degeri girmelisiniz");
    	  
    	  else{
    		  double yeniFrekans = Double.parseDouble(girilenFrekans);
    		  
    		  birRadyo.frekansDegistir(yeniFrekans);
    	  }
    	  
    	  
    	  yazdirmaAlani.setText("Açýk:" + birRadyo.acik +"\nFrekans: " 
    	    	  + birRadyo.simdikiFrekans
    	    	  +"\nSes Düzeyi: " + birRadyo.simdikiSesDuzeyi);
    	  
      }
      
      if (olay.getSource() == sesAc){
    	  
    	 String girilenSesDuzeyi = sesDuzeyiAlani.getText();
    	 
    	 
   	 
   	  if (girilenSesDuzeyi.length() == 0)
   		  
   		   yazdirmaAlani.setText("Bir ses düzeyi degeri girmelisiniz");
   	  
   	  else{
   		  double yeniSesDuzeyi = Double.parseDouble(girilenSesDuzeyi);
   		  
   		  birRadyo.sesAc(yeniSesDuzeyi);
   	  }
   	  
   	yazdirmaAlani.setText("Açýk:" + birRadyo.acik +"\nFrekans: " 
      	  + birRadyo.simdikiFrekans
      	  +"\nSes Düzeyi: " + birRadyo.simdikiSesDuzeyi);
      }
      
      if (olay.getSource() == sesKis){
    	  
     	 String girilenSesDuzeyi = sesDuzeyiAlani.getText();
     	 
     	 
    	 
    	  if (girilenSesDuzeyi.length() == 0)
    		  
    		   yazdirmaAlani.setText("Bir ses düzeyi degeri girmelisiniz");
    	  
    	  else{
    		  double yeniSesDuzeyi = Double.parseDouble(girilenSesDuzeyi);
    		  
    		  birRadyo.sesKis(yeniSesDuzeyi);
    	  }
    	  
    	  yazdirmaAlani.setText("Açýk:" + birRadyo.acik +"\nFrekans: " 
    	    	  + birRadyo.simdikiFrekans
    	    	  +"\nSes Düzeyi: " + birRadyo.simdikiSesDuzeyi);
       }
      
      
	}

}






