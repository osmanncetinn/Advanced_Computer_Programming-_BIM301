package tr.edu.halic.programlama.ders3;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Game2 extends JFrame implements ActionListener {

	private JButton button;
	private JTextField gelenler, results;
	private Random rand;

	public static void main(String[] args) {

		Game2 game = new Game2();
		game.setTitle("Game");
		game.setLocationRelativeTo(null);
		game.setSize(300, 150);
		game.create();
		game.setVisible(true);

	}

	private void create() {

		Container cont = getContentPane();
		cont.setLayout(new FlowLayout());
		button = new JButton("THROW");
		button.setFont(new Font("Times New Roman", Font.BOLD, 30));
		button.setForeground(Color.RED);
		cont.add(button);
		button.addActionListener(this);// tiklama

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		JFrame frame = new JFrame("Results");
		frame.setLocationRelativeTo(null);
		frame.setSize(300, 100);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

		Container cont = frame.getContentPane();
		cont.setLayout(new GridLayout(2, 1, 40, 14));
		gelenler = new JTextField(14);
		cont.add(gelenler);
		results = new JTextField(10);
		cont.add(results);
		rand = new Random();
		button.addActionListener(this);// tiklama

		int numb1, numb2;
		numb1 = rand.nextInt(6) + 1;
		numb2 = rand.nextInt(6) + 1;
		gelenler.setText("first number:" + Integer.toString(numb1) + "\t" + "second number:" + Integer.toString(numb2));

		if (numb1 == numb2) {
			results.setText("WINNER!!!");
		} else
			results.setText("FAIL!!!");

	}
}
