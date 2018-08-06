package extra;

import java.applet.AudioClip;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffectsMachine implements ActionListener {
	JButton button = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();

	public static void main(String[] args) {
		SoundEffectsMachine sound = new SoundEffectsMachine();
		sound.showButton();
	}

	public void showButton() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		frame.add(panel);
		panel.add(button);
		button.addActionListener(this);
		button.setText("service bell");
		panel.add(button2);
		button2.addActionListener(this);
		button2.setText("SOS");
		panel.add(button3);
		button3.addActionListener(this);
		button3.setText("Power up!");
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton b = (JButton) e.getSource();
		if (b == button) {
			playSound("service-bell_daniel_simion (1).wav");
		} else if (b == button2) {
			playSound("sos-morse-code_daniel-simion.wav");
		} else {
			playSound("Power-Up-KP-1879176533.wav");
		}
	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

}
