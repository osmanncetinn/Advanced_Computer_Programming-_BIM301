package tr.edu.halic.programlama.ders5;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PrintToMonitor extends JFrame implements ActionListener {

	private JTextField MetinAlani = new JTextField(12);
	private JButton button = new JButton("Ekrana Yazdir");
	private JLabel etiket = new JLabel("Bir yazi yazdirip buttona tiklayin");

	public static void main(String[] args) {

		PrintToMonitor print = new PrintToMonitor();
		print.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		print.setVisible(true);

	}

	public PrintToMonitor() {
		setSize(200,200);
		Container cont = getContentPane();// Frame'in icindeki bir alan.Fram'i dahil etmek icin olusturulur.
		cont.setLayout(new FlowLayout());
		cont.add(MetinAlani);
		cont.add(button);
		cont.add(etiket);
		button.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {

		String metin = MetinAlani.getText();
		etiket.setText("Yazilan Metin:" + metin);

	}
}