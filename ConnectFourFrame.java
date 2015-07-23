import java.awt.*;
import javax.swing.*;

public class ConnectFourFrame extends JFrame
{
	public ConnectFourFrame()
	{
		//calls super and sets the name of the window
		super();
		//default close
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//set resize
		setResizable(false);
		//set size
		setSize(800, 600);
		//set visible
		setVisible(true);
		//lets the program
	}

	public void paint(Graphics g)
	{
		//fills in a black background
		g.setColor(new Color(0,0,0));
		g.fillRect(0, 0, 800, 600);

		//draw a red box on the screen at (boxX,boxY)

		//draws
	}
}
