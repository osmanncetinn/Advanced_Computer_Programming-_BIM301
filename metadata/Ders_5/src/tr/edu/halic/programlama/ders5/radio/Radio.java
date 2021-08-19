package tr.edu.halic.programlama.ders5.radio;

import javax.swing.JOptionPane;

public class Radio {

	final double maxSoundLevel = 120;
	final double minSoundLevel = 0;
	double currentSoundLevel;
	final double minFrekansLevel = 108;
	final double maxFrekansLevel = 87.5;
	double currentFrekans;
	boolean on;

	public Radio() {
		on = false;
		currentSoundLevel = 80;
		currentFrekans = 99.5;

	}

	public Radio(boolean beginningStatus, double beginningSoundLevel, double beginningFrekansLevel) {

		on = beginningStatus;
		currentSoundLevel = beginningSoundLevel;
		currentFrekans = beginningFrekansLevel;
	}

	public void onAndOffRadio() {
		if (on == true)
			on = false;
		else
			on = true;

	}

	public void onSound(double onAmount) {
		if (on = false) {
			JOptionPane.showMessageDialog(null, "Turn on the radio", "Warning", JOptionPane.WARNING_MESSAGE);

		} else {
			if ((currentSoundLevel + onAmount) > maxSoundLevel)
				currentSoundLevel = maxSoundLevel;
			else {
				currentSoundLevel = currentSoundLevel + onAmount;
			}
		}
	}

	public void muteSound(double onAmount) {
		if (on = false) {
			JOptionPane.showMessageDialog(null, "Mute sound the radio", "Warning", JOptionPane.WARNING_MESSAGE);

		} else {
			if ((currentSoundLevel - onAmount) < maxSoundLevel)
				currentSoundLevel = maxSoundLevel;
			else {
				currentSoundLevel = currentSoundLevel - onAmount;
			}
		}
	}

	public void changeFrekans(double newFrekans) {

		if (on = false) {

			JOptionPane.showMessageDialog(null, "Turn on the Radio", "Warning", JOptionPane.WARNING_MESSAGE);

		} else {

			if ((minFrekansLevel < newFrekans) && (newFrekans <= maxFrekansLevel))

				currentFrekans = newFrekans;
		}

	}
}
