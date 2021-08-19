package JOptionPanelExample;

import javax.swing.JOptionPane;

public class BasicExample {

	public static void main(String[] args) {
		String output = " ";
		int sayi[] = new int[7];

		for (int i = 0; i < sayi.length; i++) {
			sayi[i] = Integer.parseInt(JOptionPane.showInputDialog((i + 1) + ".elemani giriniz:"));
			output += sayi[i] + " ";
		}

		output += "\n\n";
		for (int i = 0; i < sayi.length; i++) {
			if (i == 5)
				break;

			output += sayi[i] + " ";
			JOptionPane.showMessageDialog(null, output, "Sonuclar", JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
