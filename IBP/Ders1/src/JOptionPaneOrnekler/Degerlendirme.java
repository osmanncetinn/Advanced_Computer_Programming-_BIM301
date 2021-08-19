package JOptionPaneOrnekler;

import javax.swing.JOptionPane;
public class Degerlendirme {

	public static void main(String[] args) {

 int gecenler = 0, kalanlar = 0, i , ogrenciSayisi, sonuc;
 
 String output = "";
 
 do {
 
String sayi = JOptionPane.showInputDialog(null, "Öðrenci sayýsýný giriniz:");
 
ogrenciSayisi = Integer.parseInt(sayi);

 }
 
 while (ogrenciSayisi> 50 && ogrenciSayisi < 5);
 
 for ( i = 1; i <= ogrenciSayisi; i++){
	 
	 sonuc =  Integer.parseInt(JOptionPane.showInputDialog(null, i + ".öðrenci için sýnav sonucunu giriniz. "
	 		+ "\nÖðrenci dersten geçti ise 1 , geçmedi ise 0 giriniz:"));
	 
	 
	 if ( sonuc == 1)
		 
		 gecenler++;
	 
	 else kalanlar++;
	 
	 
	 
       }

   output += "Geçenler:" + gecenler + "\nKalanlar: " + kalanlar;
   
   if (gecenler >= (int) (ogrenciSayisi * 0.6)){
	   
	   output+= "Tebrikler. Sýnýfýn baþarýsý yüksektir :)";
   }
		
   else {
	   
	   output+= "Üzgünüm. Sýnýfýn baþarýsý düþüktür :(";
   }

    JOptionPane.showMessageDialog(null, output, "Sonuçlar", JOptionPane.INFORMATION_MESSAGE);
	}

}
