package tr.edu.halic.programlama.ders5;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PrintToMonitor3 extends JFrame {

	private JTextField MetinAlani = new JTextField(12);
	private JButton button = new JButton("Ekrana Yazdir");
	private JLabel etiket = new JLabel("Bir yazi yazdirip buttona tiklayin");

	public static void main(String[] args) {

		PrintToMonitor3 print = new PrintToMonitor3();
		print.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		print.setLocation(200,200);
		print.setVisible(true);

	}

	public PrintToMonitor3() {
		setPreferredSize(new Dimension(300,300));
		Container cont = getContentPane();// Frame'in icindeki bir alan.Fram'i dahil etmek icin olusturulur.
		cont.setLayout(new FlowLayout());
		MetinAlani.setPreferredSize(new Dimension(300,100));
		cont.add(MetinAlani);
		cont.add(button);
		cont.add(etiket);
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				String metin = MetinAlani.getText();
				etiket.setText("Yazilan Metin:" + metin);

			}
		});

		pack();
	}

}


