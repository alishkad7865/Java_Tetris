package application;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LaunchPage implements ActionListener{
	JFrame frame = new JFrame();
	JButton myButton = new JButton("New Game");
	LaunchPage(){
		myButton.setBounds(50,360,260,50);
		myButton.setFocusable(false);
		myButton.addActionListener(this);
		frame.add(myButton);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(360,720);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==myButton) {
			frame.dispose();
			NewWindow GameStart = new NewWindow();
		}
	}
}
