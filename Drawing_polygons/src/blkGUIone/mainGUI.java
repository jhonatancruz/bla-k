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
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class mainGUI extends JFrame {

	private JFrame mainframe;
	private JButton bgo, bexit;
	private JLabel showinfo = new JLabel();
	private TEMPLE_TYPE lbcj=TEMPLE_TYPE.PLEASE_SELECT_ONE_TEMPLE;
	private JComboBox sizes = new JComboBox(TEMPLE_TYPE.values());
	private JTabbedPane jtp = new JTabbedPane(JTabbedPane.TOP);
	public mainGUI() {
		// create mainframe
		mainframe = new JFrame("BLK project");

		//boxlayout
		Box a=Box.createVerticalBox();
		Box b2=Box.createHorizontalBox();
		a.add(Box.createRigidArea(new Dimension(0,5)));		
		Box compare= Box.createVerticalBox();
		Box compareh=Box.createHorizontalBox();
		//tab
		jtp.addTab("Temples", a);

		// buttons in Panel

		bgo = new JButton("Go");
		bgo.addActionListener(new MyActionListener());

		bexit = new JButton("exit");
		bexit.addActionListener(new MyActionListener());




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
			}else if (arg=="close"){
				System.out.println("delete works");
				jtp.remove(jtp.getSelectedIndex());
			}
		}
	}

	class MyItemListener implements ItemListener {
		@Override
		public void itemStateChanged(ItemEvent e) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
				JComboBox<TEMPLE_TYPE> cb = (JComboBox<TEMPLE_TYPE>) e.getSource();
				TEMPLE_TYPE pe = (TEMPLE_TYPE) cb.getSelectedItem();
				if(pe !=TEMPLE_TYPE.PLEASE_SELECT_ONE_TEMPLE){
					System.out.println("here" + pe);
					JPanel panel = new JPanel();
					JButton closeButton =new JButton("close");
					closeButton.addActionListener(new MyActionListener());
					if (pe== TEMPLE_TYPE.ASIA_MINOR) {
						panel=new temple1();
					} else if (pe == TEMPLE_TYPE.HERCULER) {
						panel=new templeofherculer();
					}else if (pe == TEMPLE_TYPE.TEMPLE2){
						panel=new temple2();
					}else if (pe==TEMPLE_TYPE.DORIC){
						panel=new Doric();
					}else if (pe==TEMPLE_TYPE.TEMPLE3){
						panel=new temple3();
					}else if (pe==TEMPLE_TYPE.TEMPLE4){
						panel=new temple4();
					}else if (pe==TEMPLE_TYPE.TEMPLE5){
						panel=new temple5();
					}
					jtp.add(pe.name,panel);
					panel.add(closeButton);
					//mainframe.revalidate();
				}else {
					JOptionPane.showMessageDialog(null,"you have not select any temple" );
				}
				

				lbcj=pe;
				showinfo.setText(pe.getInfo());
			}
		}
	}
}