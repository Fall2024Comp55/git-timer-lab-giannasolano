import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import acm.graphics.*;
import acm.program.*;
public class ColorCircleDecomp extends GraphicsProgram implements ActionListener {
public static final int PROGRAM_WIDTH = 800;
public static final int PROGRAM_HEIGHT = 600;
public static final int BALL_SIZE = 50;
public static final int DELAY_MS = 25;
//TODO create a private GOval here
private GOval ball;;
private int angle = 0;
private Color color = new Color (0, 0, 0);
//private int red = color.getAlpha();
int nRed = 0;
int nBlue = 85;
int nGreen = 170;
public void run() {
//TODO add your ball here
ball = new GOval (400, 500, BALL_SIZE, BALL_SIZE);

ball.setColor(color);
ball.setFilled(true);
add(ball);


Timer t = new Timer(DELAY_MS, this);
t.start();
}
@Override
public void actionPerformed(ActionEvent e) {
		
		ball.movePolar(20, angle);
		angle = (angle + 5) % 360;
		
		
		int red = 255 - Math.abs(255 - (nRed % 510));
	     int green = 255 - Math.abs(255 - (nGreen % 510));
	     int blue = 255 - Math.abs(255 - (nBlue % 510));
	 
	 
     
	 System.out.println("red: " + red + " blue: " + blue + " green: " + green);
	 color = new Color(red, blue, green);
	 ball.setFillColor(color);
	 
	 /* red = (red + 5) % 255;
		 int red = 255 - Math.abs(255 - (n % 510));
	     int green = 255 - Math.abs(255 - (n % 510));
	     int blue = 255 - Math.abs(255 - (n % 510)); */
		
		color = new Color(red, blue, green);
		ball.setFillColor(color); 
		
		//int value = 255 - Math.abs(255 - (n % 510));
		//System.out.println(value);
		
		nRed++;
		nBlue++;
		nGreen++;
}
	

public void init() {
setSize(PROGRAM_WIDTH, PROGRAM_HEIGHT);
}
public static void main(String args[]) {
new ColorCircleDecomp().start();
}
}

