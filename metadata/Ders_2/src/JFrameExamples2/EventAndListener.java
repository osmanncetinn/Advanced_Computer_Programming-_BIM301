package JFrameExamples2;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class EventAndListener extends JFrame implements ActionListener {

	JButton button;

	public static void main(String[] args) {
		EventAndListener frame = new EventAndListener();
		frame.setTitle("My Frame");
		frame.setSize(300, 80);
		frame.setLocationRelativeTo(null);
		frame.setBackground(Color.MAGENTA);
		frame.clickToButton();
		frame.setVisible(true);

	}

	public void clickToButton() {

		Container cont = getContentPane();
		cont.setLayout(new FlowLayout());
		button = new JButton("CLICK");
		button.addActionListener(this);
		cont.add(button);

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {

		int length = 20;
		int width = 10;
		int area = length * width;
		String output = " " + area;
		JOptionPane.showMessageDialog(null, output, "Area Calculator", JOptionPane.PLAIN_MESSAGE);
	}
}
