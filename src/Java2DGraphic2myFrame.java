import javax.swing.JFrame;

public class Java2DGraphic2myFrame extends JFrame {

	Java2DGraphic3myPanel panel;
	 
	Java2DGraphic2myFrame(){
	  
	  panel = new Java2DGraphic3myPanel();
	  
	  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  
	  this.add(panel);
	  this.pack();
	  this.setLocationRelativeTo(null);
	  this.setVisible(true);
	 }  
}
