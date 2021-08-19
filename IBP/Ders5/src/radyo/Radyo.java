package radyo;

import javax.swing.JOptionPane;

public class Radyo {
	
	
	final double enYuksekSesDuzeyi = 120;
	final double enDusukSesDuzeyi = 0;
	double simdikiSesDuzeyi;
	final double enYuksekFrekans = 108;
	final double enDusukFrekans = 87.5;
	double simdikiFrekans;
	boolean acik;
	
	
	public Radyo(){
		
		acik = false;
		simdikiSesDuzeyi = 80;
		simdikiFrekans = 99.5;
		
		
	}
	
	public Radyo (boolean baslangicDurum, double baslangicSesDuzeyi, double baslangicFrekans)
	{
	   acik = baslangicDurum;
	   simdikiSesDuzeyi = baslangicSesDuzeyi;
	   simdikiFrekans = baslangicFrekans;


	}
	
	
	public void acKapat(){
		
		if (acik == true)
			
			acik = false;
		
		else acik = true;
	}
	
	
	public void sesAc (double acmaMiktari){
		
		if (acik == false){
			
		JOptionPane.showMessageDialog(null, "Radyoyu açýnýz!",
				"Uyarý", JOptionPane.WARNING_MESSAGE);	
		}
		
		else  {
			
			if ((simdikiSesDuzeyi  + acmaMiktari) > enYuksekSesDuzeyi)
				
				simdikiSesDuzeyi = enYuksekSesDuzeyi;
			else{
				simdikiSesDuzeyi = simdikiSesDuzeyi  + acmaMiktari;
			}
			
		}
	}
	
	
	
public void sesKis (double acmaMiktari){
		
		if (acik == false){
			
		JOptionPane.showMessageDialog(null, "Radyoyu açýnýz!",
				"Uyarý", JOptionPane.WARNING_MESSAGE);	
		}
		
		else  {
			
			if ((simdikiSesDuzeyi  - acmaMiktari) < enDusukSesDuzeyi)
				
				simdikiSesDuzeyi = enDusukSesDuzeyi;
			else{
				simdikiSesDuzeyi = simdikiSesDuzeyi  - acmaMiktari;
			}
			
		}
	}
	
	public void frekansDegistir (double yeniFrekans){
		
		if (acik == false){
			
			JOptionPane.showMessageDialog(null, "Radyoyu açýnýz!",
					"Uyarý", JOptionPane.WARNING_MESSAGE);	
			}
			
			else  {
				
				if ((enDusukFrekans < yeniFrekans) && (yeniFrekans < enYuksekFrekans))
					
					simdikiFrekans = yeniFrekans;
			}
	}
   
	
}









