package JOptionPaneOrnekler;

import javax.swing.JOptionPane;

public class ContinueOrnek {
	
	public static void main(String[] args) {

		   String output ="";
		   int j = 0; int deger =0;
		   int sayi[] = new int[7];
		   
		   for (int i = 0; i < sayi.length; i++){
			   
	sayi[i] = Integer.parseInt(JOptionPane.showInputDialog((i + 1) + ". elemaný giriniz:"));
			
	output += sayi[i] + "  ";
			
		}
		   output += "\n\n";


    for (int i = 0; i < sayi.length; i++){
    	
    	
    	if ( i==3) { j = i;  deger = sayi[i]; continue;}
    	output += sayi[i] + "  ";
    	
    }
    
    output += "Continue indesi ve deðer =" + j + "  " + deger;

JOptionPane.showMessageDialog(null, output, "Sonuçlar", JOptionPane.INFORMATION_MESSAGE);
}
	
}