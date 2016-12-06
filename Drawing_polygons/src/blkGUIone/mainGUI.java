package blkGUIone;
import java.awt.Color;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class mainGUI extends JFrame {

	private JFrame mainframe;
	private JButton bgo, bexit, bdelete;
	
	public JLabel showinfo = new JLabel();
	private static TEMPLE_TYPE lbcj=TEMPLE_TYPE.PLEASE_SELECT_ONE_TEMPLE;
	public static JComboBox sizes = new JComboBox(lbcj.values());
	public static JPanel panel;
	public static JLabel label;
	
	public JTabbedPane jtp = new JTabbedPane(JTabbedPane.TOP);
	
	public mainGUI() {
		// create mainframe
		mainframe = new JFrame("BLK project");
		
		//jpanel
		JPanel panel=new JPanel();
		mainGUI.panel=panel;
		//mainGUI.panel=new templeofherculer();
		
	
		
		//boxlayout
		Box a=Box.createVerticalBox();
		Box b2=Box.createHorizontalBox();
		a.add(Box.createRigidArea(new Dimension(0,5)));		
		Box compare= Box.createVerticalBox();
		Box compareh=Box.createHorizontalBox();
		//tab
		jtp.addTab("Temples", a);

		//jtp.addTab("User input", new JPanel());
		jtp.addChangeListener(new MyChangeListener());
		
		
		// buttons in Panel

		bgo = new JButton("Go");
		bgo.addActionListener(new MyActionListener());

		bexit = new JButton("exit");
		bexit.addActionListener(new MyActionListener());
		
		bdelete = new JButton("delete");
		bdelete.addActionListener(new MyActionListener());
		
	
		// connect to listenner
		sizes.addItemListener(new MyItemListener());

		// add button to panel
		a.add(sizes);
		b2.add(bgo);
		b2.add(bexit);
		a.add(b2);
		a.add(showinfo);
		
		
		mainframe.add(jtp);
		mainframe.setBackground(Color.white);
		mainframe.setBounds(500, 600,800,1000);
		mainframe.setResizable(true);
		mainframe.setLocationRelativeTo(null);
		mainframe.setDefaultCloseOperation(EXIT_ON_CLOSE);
		mainframe.setVisible(true);
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
				if(lbcj!=TEMPLE_TYPE.PLEASE_SELECT_ONE_TEMPLE){
					System.out.println(lbcj);
				}else{
					JOptionPane.showMessageDialog(null,"you have not select any temple" );
				}
			}else if (arg=="delete"){
				System.out.println("delete works");
			}
		}
	}

	class MyItemListener implements ItemListener {
		
		@Override
		public void itemStateChanged(ItemEvent e) {
			JComboBox<TEMPLE_TYPE> cb = (JComboBox<TEMPLE_TYPE>) e.getSource();
			TEMPLE_TYPE pe = (TEMPLE_TYPE) cb.getSelectedItem();
			System.out.println(pe);
			if(pe == TEMPLE_TYPE.PLEASE_SELECT_ONE_TEMPLE){
				JOptionPane.showMessageDialog(null,"you have not select any temple" );
			}else if (pe== TEMPLE_TYPE.ASIA_MINOR) {
				showinfo.setText(TEMPLE_TYPE.ASIA_MINOR.getInfo());
				lbcj=TEMPLE_TYPE.ASIA_MINOR;
				
				//jtp.remove(mainGUI.panel);
				mainGUI.panel=new temple1();
				jtp.add(TEMPLE_TYPE.ASIA_MINOR.name,mainGUI.panel);
				mainframe.revalidate();
				
			} else if (pe == TEMPLE_TYPE.HERCULER) {
				showinfo.setText(TEMPLE_TYPE.HERCULER.getInfo());
				lbcj=TEMPLE_TYPE.HERCULER;
				
				mainGUI.panel=new templeofherculer();
				jtp.add(TEMPLE_TYPE.HERCULER.name,mainGUI.panel);
				mainframe.revalidate();
			}else if (pe == TEMPLE_TYPE.TEMPLE2){
				showinfo.setText(TEMPLE_TYPE.TEMPLE2.getInfo());
				lbcj=TEMPLE_TYPE.TEMPLE2;
				mainGUI.panel=new templeofherculer();
				jtp.add(TEMPLE_TYPE.TEMPLE2.name,mainGUI.panel);
				mainGUI.panel.add(bdelete);
				
				mainframe.revalidate();
			}
		}
	}
	
	class MyChangeListener implements ChangeListener {

		@Override
		public void stateChanged(ChangeEvent e) {
			String temp = jtp.getTitleAt(jtp.getSelectedIndex());
		}
	}
	
	public static TEMPLE_TYPE getLbcj() {
		return lbcj;
	}
	
}