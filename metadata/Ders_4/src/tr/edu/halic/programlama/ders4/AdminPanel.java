 package tr.edu.halic.programlama.ders4;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.PasswordAuthentication;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class AdminPanel extends JFrame implements ActionListener {

	static final char[] truePassword = { 'h', 'l', 'd', 'r' };
	private JButton jbOnay;
	private JButton jbExit;
	private JTextField UserName;
	private JPasswordField jpw;

	public static void main(String[] args) {

		AdminPanel admin = new AdminPanel();
		admin.setTitle("User Login");
		admin.setSize(300, 200);
		admin.setLocationRelativeTo(null);
		admin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		admin.create();
		admin.setVisible(true);

	}

	public void create() {

		Container cont = getContentPane();
		cont.setLayout(new FlowLayout());
		JLabel label1 = new JLabel("User:");
		JLabel label2 = new JLabel("Password:");

		UserName = new JTextField();
		UserName.setPreferredSize(new Dimension(20, 30)); // Kutucugun genisligi ve uzunlugu degisiyor.

		jpw = new JPasswordField();
		jpw.setPreferredSize(new Dimension(200, 30));

		// sifre karakteri sec.
		jpw.setEchoChar('*'); // Parolayý * olarak gizler.

		// etiket bilesenini text alanýný gosterecek sekilde ayarla.
		label1.setLabelFor(UserName);
		label2.setLabelFor(jpw);

		jbOnay = new JButton("ONAY");
		jbOnay.setPreferredSize(new Dimension(70, 30));
		jbExit = new JButton("EXIT");
		jbExit.setPreferredSize(new Dimension(70, 30));

		jbOnay.addActionListener(this);
		jbExit.addActionListener(this);

		cont.add(label1);
		cont.add(UserName);
		cont.add(jpw);
		cont.add(jbOnay);
		cont.add(jbExit);

		// Frame'i tekrardan olusturur.
		repaint();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		selectCommand(e);

	}

	public void selectCommand(ActionEvent e) {

		String command = e.getActionCommand();

		if (command.equals("ONAY")) {
			
		

		} else {
			System.exit(0); // sistemden cikildi.
		}

	}

	public boolean passwordTrue(char[] pwd) {

		boolean result = true;
		if (pwd.length != truePassword.length) {

			return false;
		}

		result = Arrays.equals(pwd, truePassword);
		return result;
	}

}
