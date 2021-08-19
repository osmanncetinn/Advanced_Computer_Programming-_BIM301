package JFrameExamples2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ShowBoxLayout extends JPanel {

	public ShowBoxLayout() {

		setLayout(new BorderLayout(10, 10));

		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.add(new JButton("button1"));
		panel.add(new JButton("button2"));
		panel.add(new JButton("button3"));
		panel.add(new JButton("button4"));

		add(panel, BorderLayout.WEST);

		JPanel panel2 = new JPanel();
		panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));
		panel2.add(new JButton("button5"));
		panel2.add(new JButton("button6"));
		panel2.add(new JButton("button7"));
		panel2.add(new JButton("button8"));

		add(panel2, BorderLayout.CENTER);

		JPanel panel3 = new JPanel();
		panel.setLayout(new BoxLayout(panel3, BoxLayout.X_AXIS));
		JButton button = new JButton("Toplama");
		button.setFont(new Font("Arial", Font.BOLD, 20));
		button.setBackground(Color.BLACK);
		panel3.add(button);

		button = new JButton("Cikarma");
		button.setBackground(Color.BLACK);
		button.setFont(new Font("Arial", Font.ITALIC, 20));
		panel3.add(button);

//		panel3.add(new JButton("Toplama"));
//		panel3.add(new JButton("Cikarma"));

		add(panel3, BorderLayout.SOUTH);

	}

	public static void main(String[] args) {

		ShowBoxLayout frame = new ShowBoxLayout();

	
		frame.setSize(350, 250);
		frame.setLocation(1000, 200);
		frame.setVisible(true);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
