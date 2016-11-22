package blkGUIone;
//fixing broken code

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import blkGUIone.GUI2.MyChangeListener;


public class mainGUI extends JFrame {

	public static final String g = null;
	private JFrame mainframe;
	private JButton bgo, bexit, bcompare,badd;
	public static JComboBox sizes = new JComboBox(
			new String[] { "Please select a temple", "The Temple at Teos in Asia Minor", "Temple of Hercules", "example temple 3" ,"Example temple 4"});
	public static JComboBox sizes2 = new JComboBox(
			new String[] { "Please select a temple", "The Temple at Teos in Asia Minor", "Temple of Hercules", "example temple 3" ,"Example temple 4"});
	//ImageIcon icon = new ImageIcon("src/blkGUIone/BLK-Logo-White.jpg");
	public JLabel showInfo = new JLabel();
	public static String lbcj="none";
	public JTabbedPane jtp = new JTabbedPane(JTabbedPane.TOP);
	public static Panel panel;
	
	public mainGUI() {
		// create mainframe
		mainframe = new JFrame("BLK project");
		
		//jpanel
		JPanel panel=new JPanel();
		// label hello
		//JLabel label = new JLabel(icon);
		
		//boxlayout
		Box b1=Box.createVerticalBox();
		Box b2=Box.createHorizontalBox();
		b1.add(Box.createRigidArea(new Dimension(0,5)));		
		Box compare= Box.createVerticalBox();
		//tab
		jtp.addTab("Temples", b1);
		jtp.addTab("Compare", compare);
		jtp.addTab("User input", new JPanel());
		jtp.addChangeListener(new MyChangeListener());
		
		
		
		
		// buttons in Panel

		bgo = new JButton("Go");
		bgo.addActionListener(new MyActionListener());

		bexit = new JButton("exit");
		bexit.addActionListener(new MyActionListener());
		
		bcompare = new JButton("compare");
		bexit.addActionListener(new MyActionListener());

		badd = new JButton("add");
		bexit.addActionListener(new MyActionListener());
		// connect to listenner
		sizes.addItemListener(new MyItemListener());

		// add button to panel
		b1.add(sizes);
		b2.add(bgo);
		b2.add(bexit);
		b1.add(b2);
		panel = new temple1();
		b1.add(panel);
		
	
		//b1.add(Box.createVerticalGlue());

		b1.add(showInfo);
		

		//compare pane
		compare.add(sizes2);
		compare.add(bcompare);
		compare.add(badd);
				
		//label.setSize(350, 600);
		// add panel to frame
		//mainframe.add(label);

		mainframe.add(jtp);
		//mainframe.add(p2);
		mainframe.setBackground(Color.white);
		mainframe.setBounds(500, 600,800,1000);
		mainframe.setResizable(true);
		mainframe.setLocationRelativeTo(null);
		mainframe.setDefaultCloseOperation(EXIT_ON_CLOSE);
		mainframe.setVisible(true);
	}

	

	


	public void actionPerformed(ActionEvent e) {

	}

	public static void main(String[] args) {
		new mainGUI();
	}

	class MyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String arg = e.getActionCommand();
			if (arg == "exit") {
				System.exit(0);
			}

			else if (arg == "Go") {
				System.out.println(lbcj);
				if (lbcj == "none") {
					JOptionPane.showMessageDialog(null, "Please choose a temple");
				} else {
					new GUI2();
				}
			}
		}
	}

	class MyItemListener implements ItemListener {

		@Override
		public void itemStateChanged(ItemEvent e) {
			JComboBox<String> cb = (JComboBox<String>) e.getSource();
			String pe = (String) cb.getSelectedItem();
			
			if (pe.equals("The Temple at Teos in Asia Minor")) {
				showInfo.setText("Teos was one of the twelve cities.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
				lbcj = "a";
								
			} else if (pe.equals("Temple of Hercules")) {
				showInfo.setText("description for temple 2");
				lbcj = "b";
			} else if (pe.equals("example temple 3")) {
				showInfo.setText("description for temple 3");
				lbcj = "c";
			} else if (pe.equals("example temple 4")) {
				showInfo.setText("description for temple 4");
				lbcj = "d";
			} else if (pe.equals("Please select a temple")) {

				lbcj = "none";
			}
		}

	



	
	}
	class MyChangeListener implements ChangeListener {

		@Override
		public void stateChanged(ChangeEvent e) {
			String temp = jtp.getTitleAt(jtp.getSelectedIndex());
		}
	}
}