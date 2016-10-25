package blkGUIone;

import java.applet.Applet;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.PaintEvent;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * @author danielxu
 *
 */
public class GUI extends JFrame implements ActionListener{
	public static final String g = null;
	private JFrame mainframe;
	private JPanel p,p1,p2,p3;
	private JButton twod, threed,bexit;
	private static JComboBox sizes = new JComboBox(new String[] { "example temple1","example temple2","example temple3"});

	
	
	public static void main(String[] args) {
		 new GUI();
	}
	
	public GUI(){
		//create mainframe
		mainframe =new JFrame("BLK project");
		mainframe.setLayout(new GridLayout(1,2));
		
		//layout
		p3 =new JPanel(new FlowLayout());
		p= new JPanel(new FlowLayout());
		p1= new JPanel(new FlowLayout());
		p2=new JPanel(new FlowLayout());
		
		

		//buttons in mainframe
		twod=new JButton("2D");
		twod.addActionListener(this);
		
		threed=new JButton("3D");
		threed.addActionListener(this);
		
		bexit=new JButton("exit");
		bexit.addActionListener(this);
		
		sizes.addActionListener(this);
		//add button to panel
		p3.add(sizes);
		p.add(twod);
		p1.add(threed);
		p2.add(bexit);
		
		
		//add panel to frame
		mainframe.add(p3);
		mainframe.add(p);
		mainframe.add(p1);
		mainframe.add(p2);
		
		mainframe.setSize(400, 100);
		mainframe.setResizable(false);
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

class GUI2 extends JFrame{
	private JFrame birdyf;
	private JPanel p;
	
	public GUI2(){
	birdyf =new JFrame("Bird Eye View");
	System.out.println("out");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
    
	p= new JPanel();
	birdyf.add(p);
	birdyf.setSize(800, 800);
	birdyf.setVisible(true);
	
	
	}
	
}	


}
