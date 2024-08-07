import java.awt.*;
import javax.swing.*;

public class Java2DAnimation2myFrame extends JFrame{

	Java2DAnimation3myPanel panel;
	
    Java2DAnimation2myFrame(){
		
		panel = new Java2DAnimation3myPanel();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(panel);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}  
}
