import java.awt.Color;
import java.awt.Container;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;

public class ButtonDemo extends JFrame implements ActionListener
{
	public final static int WIDTH = 300;
	public final static int HEIGHT = 200;
	
	public ButtonDemo() {
		setSize(WIDTH,HEIGHT);
		setTitle("Button Demo");
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.BLUE);
		contentPane.setLayout(new FlowLayout());
		
		JButton stopButton = new JButton("Red");
		stopButton.addActionListener(this);
		contentPane.add(stopButton);
		JButton goButton = new JButton("Green");
		goButton.addActionListener(this);
		contentPane.add(goButton);
		JButton gogoButton = new JButton("Blue");
		gogoButton.addActionListener(this);
		contentPane.add(gogoButton);
	}
	
	@Override
	public void actionPerformed (ActionEvent e)
	{
	Container contentPane = getContentPane ();
	if (e.getActionCommand ().equals ("Red"))
	contentPane.setBackground (Color.RED);
	else if (e.getActionCommand ().equals ("Green"))
	contentPane.setBackground (Color.GREEN);
	else if (e.getActionCommand ().equals ("Blue"))
		contentPane.setBackground (Color.BLUE);
	else
	System.out.println ("Error in button interface.");
	}
	/**
	Creates and displays a window of the class ButtonDemo.
	*/
	public static void main (String [] args)
	{
	ButtonDemo buttonGui = new ButtonDemo ();
	buttonGui.setVisible (true);
	}
	}

