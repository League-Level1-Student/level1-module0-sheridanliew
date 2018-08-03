package extra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	public static void main(String[] args) {
		FortuneCookie fc = new FortuneCookie();
		fc.showButton();

	}

	public void showButton() {
		System.out.println("Button clicked");
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton button = new JButton();
		frame.add(button);
		button.addActionListener(this);
		button.setText("CLick here to see your fortune.");
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Woohoo! Your fortune is:");
		int random = new Random().nextInt(5);
		if (random == 0) {
			JOptionPane.showMessageDialog(null, "Today it's up to you to create the peacefulness you long for.");
		} else if (random == 1) {
			JOptionPane.showMessageDialog(null, "Your high-minded principles spell success.");
		} else if (random == 2) {
			JOptionPane.showMessageDialog(null, "A smile is your passport into the hearts of others.");
		} else if (random == 3) {
			JOptionPane.showMessageDialog(null, "Whatever your goal is in life, embrace it, visualize it, and it will be yours.");
		} else {
			JOptionPane.showMessageDialog(null, "You cannot love the life you live until you live the life you love.");
		}

	}
}
