import java.awt.*;
import java.util.*;
import javax.swing.*;

public class JavaAnonymousObject {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		ArrayList<JLabel> deck = new ArrayList<JLabel>();
		
		/*
		ImageIcon AC = new ImageIcon("src\\cards\\1.png");
		JLabel AClabel = new JLabel(AC);
		deck.add(AClabel);
		
		ImageIcon TwoC = new ImageIcon("src\\cards\\2.png");
		JLabel TwoClabel = new JLabel(TwoC);
		deck.add(TwoClabel);
		
		... repeat for all 52 cards :(
		*/
		
//		for(int i =1;i<=52;i++) {
//			deck.add(new JLabel(new ImageIcon("src\\cards\\"+i+".png")));
//			frame.add(deck.get(i-1));
//		}
			
		//frame.add(deck.get(0));
		//frame.add(deck.get(1));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 420);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);

	}

}
