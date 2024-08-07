import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class JavaCombobox2myFrame extends JFrame implements ActionListener {

	JComboBox comboBox;
	 
	JavaCombobox2myFrame(){
	  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  this.setLayout(new FlowLayout()); 
	  
	  String[] animals = {"dog","cat","bird"};
	  
	  comboBox = new JComboBox(animals);
	  comboBox.addActionListener(this);
	  
	  //comboBox.setEditable(true);
	  //System.out.println(comboBox.getItemCount());
	  //comboBox.addItem("horse");
	  //comboBox.insertItemAt("pig", 0);
	  //comboBox.setSelectedIndex(0);
	  //comboBox.removeItem("cat");
	  //comboBox.removeItemAt(0);
	  //comboBox.removeAllItems();
	  
	  this.add(comboBox);
	  this.pack();
	  this.setVisible(true);
}

	@Override
	public void actionPerformed(ActionEvent e) {

		 if(e.getSource()==comboBox) {
			   System.out.println(comboBox.getSelectedItem());
			   //System.out.println(comboBox.getSelectedIndex());
			  }
		
	}
}
