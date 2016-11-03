package blkGUIone;

import java.awt.CardLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author danielxu
 *
 */
public class GUI extends JFrame implements ActionListener{
	public static final String g = null;
	private JFrame mainframe;
	private JPanel p;
	private JButton twod, threed,bexit;
	private static JComboBox sizes = new JComboBox(new String[] { "example temple1","example temple2","example temple3"});

	
	
	public static void main(String[] args) {
		 new GUI();
	}
	
	public GUI(){
		//create mainframe
		mainframe =new JFrame("BLK project");
		
		
		//Panels
		JPanel p1= new JPanel();
		
		JPanel p2= new JPanel();
		//buttons in Panel
		
		twod=new JButton("2D");
		twod.addActionListener(this);
		
		threed=new JButton("3D");
		threed.addActionListener(this);
		
		bexit=new JButton("exit");
		bexit.addActionListener(this);
		
		sizes.addActionListener(this);
		//add button to panel
		
		p1.add(twod);
		p1.add(threed);
		p1.add(bexit);
		p1.add(sizes);
		
		//lay out 
		p = new JPanel(new CardLayout());
        p.add(p1);
		//add panel to frame
		mainframe.add(p);
		
		//mainframe.add(p1);
		
		mainframe.setSize(400, 300);
		mainframe.setResizable(true);
		mainframe.setLocationRelativeTo(null);
		mainframe.setDefaultCloseOperation(EXIT_ON_CLOSE);
		mainframe.setVisible(true);
		
		
		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		String arg =e.getActionCommand();
		if(arg == "2D"){
			new GUI2();
			
			//JOptionPane.showMessageDialog(p, message);
		}
		else if(arg=="3D"){
			
		}
		else if(arg=="exit"){
			System.exit(0);

		}
	}
}
