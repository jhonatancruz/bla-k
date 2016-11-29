package blkGUIone;

import javax.swing.JComboBox;
import javax.swing.JPanel;

public class templeprogress extends JPanel {
	public static JComboBox size = new JComboBox(
			new String[] { "Please select a temple", "The Temple at Teos in Asia Minor", "Temple of Hercules", "example temple 3" ,"Example temple 4"});
	public templeprogress(){
		JPanel panel=new JPanel();
		panel.add(size);
}
}
