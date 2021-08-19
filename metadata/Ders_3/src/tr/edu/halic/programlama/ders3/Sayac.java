package tr.edu.halic.programlama.ders3;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Sayac extends JFrame implements ActionListener {

	private int i;
	private JButton button;

	public static void main(String[] args) {

		Sayac sayac = new Sayac();
		sayac.setTitle("Sayac");
		sayac.setLocationRelativeTo(null);
		sayac.setLocation(300, 300);
		sayac.artir();
		sayac.setVisible(true);
		sayac.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public void artir() {
		Container cont = getContentPane(); // container, getContentPane() methoduyla cagirilir ve aktiflestirilir.
		cont.setLayout(new FlowLayout());
		button = new JButton("CLICK");
		button.setForeground(Color.RED);
		button.setBackground(Color.BLACK);
		button.setToolTipText("CLICK TO BUTTON");
		button.addActionListener(this);
		cont.add(button);

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {

		i = i + 1;
		JOptionPane.showMessageDialog(null, "Button" + i, "Sonuclar", JOptionPane.INFORMATION_MESSAGE);

	}
}
