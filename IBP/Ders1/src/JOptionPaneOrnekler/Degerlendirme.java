package JOptionPaneOrnekler;

import javax.swing.JOptionPane;
public class Degerlendirme {

	public static void main(String[] args) {

 int gecenler = 0, kalanlar = 0, i , ogrenciSayisi, sonuc;
 
 String output = "";
 
 do {
 
String sayi = JOptionPane.showInputDialog(null, "��renci say�s�n� giriniz:");
 
ogrenciSayisi = Integer.parseInt(sayi);

 }
 
 while (ogrenciSayisi> 50 && ogrenciSayisi < 5);
 
 for ( i = 1; i <= ogrenciSayisi; i++){
	 
	 sonuc =  Integer.parseInt(JOptionPane.showInputDialog(null, i + ".��renci i�in s�nav sonucunu giriniz. "
	 		+ "\n��renci dersten ge�ti ise 1 , ge�medi ise 0 giriniz:"));
	 
	 
	 if ( sonuc == 1)
		 
		 gecenler++;
	 
	 else kalanlar++;
	 
	 
	 
       }

   output += "Ge�enler:" + gecenler + "\nKalanlar: " + kalanlar;
   
   if (gecenler >= (int) (ogrenciSayisi * 0.6)){
	   
	   output+= "Tebrikler. S�n�f�n ba�ar�s� y�ksektir :)";
   }
		
   else {
	   
	   output+= "�zg�n�m. S�n�f�n ba�ar�s� d���kt�r :(";
   }

    JOptionPane.showMessageDialog(null, output, "Sonu�lar", JOptionPane.INFORMATION_MESSAGE);
	}

}
