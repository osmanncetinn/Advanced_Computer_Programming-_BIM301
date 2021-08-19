package tr.edu.halic.programlama.ders5;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class PrintToMonitor2 extends JFrame {

	private JTextField MetinAlani = new JTextField(12);
	private JButton button = new JButton("Ekrana Yazdir");
	private JLabel etiket = new JLabel("Bir yazi yazdirip buttona tiklayin");
	private JTextArea metinAlani2 = new JTextArea(3,12);
	private JScrollPane pane = new JScrollPane(metinAlani2);

	public static void main(String[] args) {

		PrintToMonitor2 print = new PrintToMonitor2();
		print.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		print.setLocation(200,200);
		print.setVisible(true);

	}

	public PrintToMonitor2() {
		setSize(200, 200);
		Container cont = getContentPane();// Frame'in icindeki bir alan.Fram'i dahil etmek icin olusturulur.
		cont.setLayout(new FlowLayout());
		cont.add(MetinAlani);
		cont.add(button);
		cont.add(etiket);
		cont.add(metinAlani2);
		cont.add(pane);
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				String metin = MetinAlani.getText();
				etiket.setText("Yazilan Metin:\n" + metin);
				metinAlani2.setText("Ekrana girdiginiz yazi: \n" + metin);
			

			}
		});

	}

}
