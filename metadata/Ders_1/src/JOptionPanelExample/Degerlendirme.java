package JOptionPanelExample;

import javax.swing.JOptionPane;

public class Degerlendirme {

	public static void main(String[] args) {
		int gecenler = 0, kalanlar = 0, i, ogrenciSayisi, sonuc = 0;
		String output = " ";
		do {

			String sayi = JOptionPane.showInputDialog(null, "Ogrenci sayisini giriniz:");
			ogrenciSayisi = Integer.parseInt(sayi);

		} while (ogrenciSayisi > 50 && ogrenciSayisi < 5);

		for ( i = 1; i <= ogrenciSayisi; i++) {
			sonuc = Integer.parseInt(JOptionPane.showInputDialog(null, i + ". Ogrenci icin sinav sonucunu giriniz:"
					+ "\nOgrenci dersten gecti ise 1,gecmediyse 0 giriniz:"));

			if (sonuc== 1)
				gecenler++;
			else
				kalanlar++;

		}
		
		output += "Gecenler:" + gecenler ;
		output += "\nKalanlar:" + kalanlar;
		if(gecenler >= (int) (ogrenciSayisi * 0.6)) {
			output += "Tebrikler! Sinifin basarisi yuksektir.";
		}
		else
			output += "Sinifin basarisi dusuktur.";

		JOptionPane.showMessageDialog(null, output, "Sonuclar", JOptionPane.INFORMATION_MESSAGE);
	}

	
	

}
