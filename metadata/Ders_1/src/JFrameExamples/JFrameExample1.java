package JFrameExamples;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JFrameExample1 {

	public static void main(String[] args) {

		JFrame frame = new JFrame("My Frame");
		frame.setSize(300, 200);
		frame.setLocationRelativeTo(null); // Frame'in merkeze gelmesini saglar...
		// frame.setLocation(300,150);
		// frame.setLayout(new FlowLayout(FlowLayout.RIGHT, 30, 20));

		frame.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 50)); 
		JButton button = new JButton("OK");
		frame.add(button);

		JButton button2 = new JButton("HAYIR");
		frame.add(button2);

		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Frame'in arka planda calismasini engeller.

	}

}
