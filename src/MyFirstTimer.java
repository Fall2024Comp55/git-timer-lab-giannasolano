import acm.graphics.*;
import acm.program.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MyFirstTimer extends GraphicsProgram implements ActionListener{
	public static final int PROGRAM_HEIGHT = 600;
	public static final int PROGRAM_WIDTH = 800;
	public static final int MAX_STEPS = 20;
	private GLabel myLabel;
	private int numTimes = 0;
	private Timer t;
	//private TimerBall ball;
	//private TimerBall ball2;

	
	public void init() {
		setSize(PROGRAM_WIDTH, PROGRAM_HEIGHT);
		requestFocus();
	}
	
	public void run() {
		myLabel = new GLabel("# of times called? " + numTimes, 0, 100);
		add(myLabel);
		
		
		
		/* ball = new TimerBall(20,30,20,20);
		add(ball);
		
		ball2 = new TimerBall(20, 60, 30, 30);
		add(ball2);
		
		Timer ballTimer = new Timer(1000, ball);
		ball.setSpeed(5);
		ballTimer.start(); 
		
		Timer ballTimer2 = new Timer(1000, ball2);
		ball2.setSpeed(2);
		ballTimer2.start(); */
		
		t = new Timer(1000, this);
		t.setInitialDelay(3000);
		t.start();
	}
@Override 
public void actionPerformed(ActionEvent e) {
	numTimes++;
	myLabel.setLabel("# of times calle? " + numTimes);
	myLabel.move(5, 0);
	if (numTimes == 10) {
		t.stop();
	}

}
	public static void main(String[] args) {
		new MyFirstTimer().start();
	}
}