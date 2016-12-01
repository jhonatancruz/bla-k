package blkGUIone;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class fileChooser extends JFrame {
	 public fileChooser() {
	    JFileChooser fileChooser = new JFileChooser();
	    fileChooser.setDialogTitle("Choose a file");
	    this.getContentPane().add(fileChooser);
	    fileChooser.setVisible(true);
	  }

	 public static void main(String[] args) {
	    JFrame frame = new fileChooser();
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.pack();
	    frame.setVisible(true);
	 }
}

