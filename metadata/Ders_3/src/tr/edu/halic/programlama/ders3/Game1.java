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

public class Game1 extends JFrame implements ActionListener {

	private JButton button;
	private JTextField gelenler, results;
	private Random rand;

	public static void main(String[] args) {

		Game1 game = new Game1();
		game.setTitle("Game");
		game.setLocationRelativeTo(null);
		game.setSize(300, 150);
		game.create();
		game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		game.setVisible(true);

	}

	private void create() {

		Container cont = getContentPane();
		cont.setLayout(new GridLayout(3, 3, 15,15));
		button = new JButton("THROW");
		button.setFont(new Font("Times New Roman", Font.BOLD, 30));
		button.setForeground(Color.RED);
		button.setBackground(Color.BLACK);
		cont.add(button);
		gelenler = new JTextField(14);
		cont.add(gelenler);
		results = new JTextField(10);
		cont.add(results);
		rand = new Random();
		button.addActionListener(this);// tiklama

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		int numb1, numb2;
		numb1 = rand.nextInt(6) + 1;
		numb2 = rand.nextInt(6) + 1;
		gelenler.setText("first number:" + Integer.toString(numb1) + "\t" + "second number:" + Integer.toString(numb2));

		if (numb1 == numb2) {
			results.setText("WINNER");
		} else
			results.setText("FAIL!!!");

	}
}
