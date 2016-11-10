package blkGUIone;


import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


/**
 * @author danielxu
 *
 */
public class mainGUI extends JFrame{
	public static final String g = null;
	private JFrame mainframe;
	private JPanel p1;
	private JButton twod, threed,bexit;
	private static JComboBox sizes = new JComboBox(new String[] {"Please select one temple","example temple1","example temple2","example temple3"});	
	//java.net.URL imgUrl = getClass().getResource("BLK-Logo-White.png");
	//ImageIcon icon = new ImageIcon("");
	ImageIcon icon = new ImageIcon("/Users/danielxu/Downloads/BLK-Logo-White.jpg");
	public JLabel showInfo = new JLabel();
	public String lbcj;
	
	
	public String getLbcj() {
		return lbcj;
	}
	public void setLbcj(String lbcj) {
		this.lbcj = lbcj;
	}
	public mainGUI(){
		//create mainframe
		mainframe =new JFrame("BLK project");
		
		
		//Panels
		JPanel p1= new JPanel();
		
		//label
        JLabel label = new JLabel(icon);
        
		//buttons in Panel
		
		twod=new JButton("Go");
		twod.addActionListener(new MyActionListener());
		/*
		threed=new JButton("3D");
		threed.addActionListener(new MyActionListener());
		*/
		bexit=new JButton("exit");
		bexit.addActionListener(new MyActionListener());
		
		//connect to listenner
		sizes.addActionListener(new MyActionListener1());
		sizes.addItemListener(new MyItemListener());
		
		//add button to panel
		
		p1.add(sizes);
		p1.add(twod);
		//p1.add(threed);
		

		p1.add(bexit);
		
		label.setSize(350,600);
		//add panel to frame
		mainframe.add(label);
		mainframe.add(p1);

		p1.add(showInfo);
		


		mainframe.setBackground(Color.white);
		mainframe.setSize(350, 600);
		mainframe.setResizable(false);
		mainframe.setLocationRelativeTo(null);
		mainframe.setDefaultCloseOperation(EXIT_ON_CLOSE);
		mainframe.setVisible(true);		
	}
	public void actionPerformed(ActionEvent e) {
		
	}
	public static void main(String[] args) {
		 new mainGUI();
	}
	

	class MyActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String arg =e.getActionCommand();
			if (arg=="exit"){
				System.exit(0);
			}
	
			else if(arg=="Go"){
				System.out.println(lbcj);
			}
		}
	}
	
	class MyActionListener1 implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			JComboBox<String> cb = (JComboBox<String>)e.getSource();
			String pe = (String)cb.getSelectedItem();
	
			if(pe.equals("example temple1")){
				new GUI2();
				
			}else if(pe.equals("example temple2")){
				new templeofherculer();
			}else if(pe.equals("example temple3")){
			}
		}
	}
	
	class MyItemListener implements ItemListener{
	
		@Override
		public void itemStateChanged(ItemEvent e) {
			JComboBox<String> cb = (JComboBox<String>)e.getSource();
			String pe = (String)cb.getSelectedItem();
			if(pe.equals("example temple1")){
				showInfo.setText("test description for temple1");
				lbcj= "a";
			}else if(pe.equals("example temple2")){
				showInfo.setText("test description for temple2");
				lbcj="b";
			}else if(pe.equals("example temple3")){
				showInfo.setText("test description for temple3");
				lbcj="c";
			}
		}

		
		
	}

	public static void addpanel() {
		// TODO Auto-generated method stub
		
	}

}





