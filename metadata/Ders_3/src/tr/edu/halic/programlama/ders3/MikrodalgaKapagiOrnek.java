package tr.edu.halic.programlama.ders3;
import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MikrodalgaKapagiOrnek extends JFrame {

	public MikrodalgaKapagiOrnek() {

		JPanel jp1 = new JPanel();
		jp1.setLayout(new GridLayout(4, 3)); // 4 satir ve 3 sutundan olusur.

		// 1'den 9'a kadar butonlar eklenir.
		for (int i = 1; i <= 9; i++) {
			jp1.add(new JButton("" + i));

		}

		jp1.add(new JButton("0"));
		jp1.add(new JButton("Basla"));
		jp1.add(new JButton("Dur"));

		JPanel jp2 = new JPanel();
		jp2.setLayout(new BorderLayout());
		jp2.add(jp1, BorderLayout.EAST);

		jp2.add(new JTextField("Zamani Sec"), BorderLayout.NORTH);
		jp2.add(new JButton("Yiyecekler"), BorderLayout.CENTER);
		
		add(jp2);
		

	}

	public static void main(String[] args) {

		MikrodalgaKapagiOrnek mikrodalga = new MikrodalgaKapagiOrnek();
		mikrodalga.setTitle("Mikrodalga Firin Kapagi");
		mikrodalga.setSize(400, 250);
		mikrodalga.setLocationRelativeTo(null);
		mikrodalga.setDefaultCloseOperation(EXIT_ON_CLOSE);
		mikrodalga.setVisible(true);

	}

}
