import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class NewWindow {
	JFrame frame = new JFrame();
	JLabel label = new JLabel("Game Starts in");
	JLabel countDown = new JLabel();
	int counter = 3;
	Timer timer;
	NewWindow(){
		label.setBounds(75,200,360,50);
		label.setFont(new Font(null,Font.PLAIN,30));
		frame.add(label);
		countDown.setBounds(180,260,360,50);
		countDown.setFont(new Font(null,Font.PLAIN,30));
		countDown.setText(Integer.toString(counter));
		frame.add(countDown);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(360,720);
		frame.setLayout(null);
		frame.setVisible(true);
		setCounter();
	}
	void setCounter() {
		try {
			
			ActionListener taskPerformed=new ActionListener() {
	            public void actionPerformed(ActionEvent evt) {
	            	
	            	if(counter==0) {
	            		label.setText("GO!");
	            		label.setBounds(150,260,360,50);
	            		countDown.setText("");
	            		timer.stop();
	            	}
	            	else {
	            		countDown.setText(Integer.toString(counter));
		            	counter--;
	            	}
	            };
			};
			int delay =1000;
			timer =new Timer(delay,taskPerformed);
			timer.start();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}
