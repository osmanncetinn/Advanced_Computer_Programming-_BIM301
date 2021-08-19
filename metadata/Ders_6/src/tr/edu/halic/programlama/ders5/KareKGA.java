package tr.edu.halic.programlama.ders5;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class KareKGA extends JFrame implements ActionListener {

	private double sideLength = 0;
	private double cevre, alan;
	private JLabel etiket = new JLabel("Kenar Uzunlugu");
	private JTextField metinAlani = new JTextField(5);
	private JButton button = new JButton("Hesapla");
	private JTextArea printArea = new JTextArea(2, 20); // 2 satir,20 sutun sayisi (pixel cinsinden)

	public KareKGA() {

		setTitle("Cevre ve Alan Hesabi/Kare");
		setSize(300, 200);
		setLocation(300, 300);
		setLayout(new FlowLayout());
		add(etiket);
		add(metinAlani);
		add(button);
		add(printArea);

		button.addActionListener(this);
		setVisible(true);
	}

	public static void main(String[] args) {

		KareKGA frame = new KareKGA();

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String length = metinAlani.getText();
		if (length.length() == 0) {
			printArea.setText("Kenar uzunlugu girmelisiniz");
		} else {
			try {

				sideLength = Double.parseDouble(metinAlani.getText());
				cevre = CevreHesapla(sideLength);
				alan = AlanHesapla(sideLength);
				printArea.setText("Karenin Cevresi" + cevre + "\nAlani:" + alan);

			} catch (Exception ex) {

				printArea.setText("Duzgun format kullanmalisiniz.");
				ex.printStackTrace();

			}
		}
	}

	public double CevreHesapla(double k) {

		return 4 * k;

	}

	public double AlanHesapla(double k) {

		return k * k;
	}
}
