package tr.edu.halic.programlama.ders5.radio;

import java.awt.Button;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class UserGraphicRadio extends JFrame implements ActionListener {

	static UserGraphicRadio r;
	static Radio radio;
	private JButton onAndOff = new JButton("Turn On/Turn Off");
	private JLabel frekans = new JLabel("Frekans");
	private JTextField frekansField = new JTextField(5);
	private JButton changeFrekans = new JButton("Change Frekans");
	private JLabel soundLevel = new JLabel("On Sound");
	private JTextField soundLevelField = new JTextField(5);
	private JButton onSound = new JButton("On Sound");
	private JButton muteSound = new JButton("Mute Sound");
	private JTextArea printArea = new JTextArea(3, 12);

	public UserGraphicRadio() {
		Container cont = getContentPane();
		setTitle("RADIO");
		setSize(180, 280);
		setLocationRelativeTo(null);
		cont.setLayout(new FlowLayout());
		cont.add(onAndOff);
		cont.add(frekans);
		cont.add(onAndOff);
		cont.add(frekansField);
		cont.add(onSound);
		cont.add(soundLevelField);
		cont.add(soundLevel);
		cont.add(muteSound);
		cont.add(printArea);

		onAndOff.addActionListener(this); // Bir kere cagirilir (this)
		changeFrekans.addActionListener(this);
		onSound.addActionListener(this);
		muteSound.addActionListener(this);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}

	public static void main(String[] args) {

		r = new UserGraphicRadio();
		radio = new Radio();

	}

	@Override
	public void actionPerformed(ActionEvent event) {

		if (event.getSource() == onAndOff) { // If event equals on and off button
			radio.onAndOffRadio();

			printArea.setText(
					"On: " + radio.on + "\n" + radio.currentFrekans + "\nSoundLevel: " + radio.currentSoundLevel);
		}

		if (event.getSource() == changeFrekans) {
			String enteredFrekans = frekansField.getText();

			if (enteredFrekans.length() == 0)
				printArea.setText("Enter the frekans value");
			else {
				double newFrekans = Double.parseDouble(enteredFrekans);
				radio.changeFrekans(newFrekans);

			}
		}

		if (event.getSource() == onSound) {
			String enteredSoundLevel = soundLevelField.getText();

			if (enteredSoundLevel.length() == 0)
				printArea.setText("Enter the sound level");
			else {
				double newSound = Double.parseDouble(enteredSoundLevel);
				radio.onSound(newSound);

			}
		}

		if (event.getSource() == muteSound) {
			String muteSound = soundLevelField.getText();

			if (muteSound.length() == 0)
				printArea.setText("Enter the sound level");
			else {
				double newSound = Double.parseDouble(muteSound);
				radio.muteSound(newSound);

			}

			printArea.setText("On: " + radio.on + "\nFrekans: " + radio.currentFrekans + "\nSoundLevel: "
					+ radio.currentSoundLevel);

		}
	}
}
