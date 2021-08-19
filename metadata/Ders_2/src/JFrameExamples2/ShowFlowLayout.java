package JFrameExamples2;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ShowFlowLayout extends JFrame {

	public ShowFlowLayout() {

		setLayout(new FlowLayout(FlowLayout.LEFT, 5, 10)); // Frame soldan gelir,sutun ve satirlar arasindaki fark 5
															// olur.
		add(new JLabel("Adi:"));
		add(new JTextField(20));
		add(new JLabel("Soyadi:"));
		add(new JTextField(20));
		add(new JLabel("Yas:"));
		add(new JTextField(5));

	}

	public static void main(String[] args) {

		ShowFlowLayout frame = new ShowFlowLayout();
		frame.setSize(300, 200);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
