import javax.swing.*;

public class HekkoSwing {

	public static void main(String[] args) {
		JFrame f = new JFrame("Hello");
		JPanel p = new JPanel();
		JButton b = new JButton("Press me");
	
		f.setSize(600,600);
		f.setContentPane(p);
		p.add(b);
		f.setVisible(true);
	}

}
