package GorselOrnekler;
import  javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
public class Ornek4 {
	
	public static void main(String[] args) {
		
		String output = "";
		int sayi;
		for(int i = 1 ; i <= 30 ; i++) {
			sayi = (int) (1 + (Math.random() * 8));
			output += sayi + "   ";
			
			if((i % 6) == 0) 
				output += "\n";
		}//end of for
		
		JTextArea area = new JTextArea(5,2);
		area.setText(output);
		JOptionPane.showMessageDialog(null, area, "Sonuclar", JOptionPane.INFORMATION_MESSAGE);
		
		JScrollPane scroller = new JScrollPane(area);
		JOptionPane.showMessageDialog(null, scroller, "Sonuclar", JOptionPane.INFORMATION_MESSAGE);
		
	}
}
