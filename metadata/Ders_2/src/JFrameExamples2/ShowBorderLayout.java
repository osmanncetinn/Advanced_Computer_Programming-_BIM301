package JFrameExamples2;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ShowBorderLayout extends JFrame {

	public ShowBorderLayout() {

		setLayout(new BorderLayout(5, 5)); // Satirlar ve sutunlar arasindaki fark

		add(new JButton("South"), BorderLayout.SOUTH);
		add(new JButton("Nort"), BorderLayout.NORTH);
		add(new JButton("East"), BorderLayout.EAST);
		add(new JButton("West"), BorderLayout.WEST);
		add(new JButton("Center"), BorderLayout.CENTER);

	}

	public static void main(String[] args) {

		ShowBorderLayout frame = new ShowBorderLayout();

		frame.setSize(350, 200);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
