package JFrameExamples2;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ShowGridLayout extends JFrame {

	public ShowGridLayout() {
		setLayout(new GridLayout(3, 2, 5, 5));
		JLabel label = new JLabel("Adi:");
		label.setForeground(Color.RED);
		label.setFont(new Font("Times New Roman", Font.BOLD, 20));
		label.setToolTipText("Adinizi giriniz:"); //Imlec ile üzerine gelindiginde gozukur
		add(label);

		add(new JTextField(3));

		label = new JLabel("Soyadi:");
		label.setForeground(Color.BLUE);
		label.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		label.setToolTipText("Soyadinizi giriniz:");

		add(label);
		add(new JTextField(8));

		label = new JLabel("Yasi:");
		label.setForeground(Color.BLACK);
		label.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		label.setToolTipText("Yasinizi giriniz:");

		add(label);
		add(new JTextField(8));

	}

	public static void main(String[] args) {

		ShowGridLayout frame = new ShowGridLayout();
		frame.setSize(350, 200);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
