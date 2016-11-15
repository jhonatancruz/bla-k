package blkGUIone;
//fixing broken code

import java.awt.CardLayout;
import java.awt.Color;
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


public class mainGUI extends JFrame {

	public static final String g = null;
	private JFrame mainframe;
	private JPanel p1;
	private JButton bgo, bexit;
	private static JComboBox sizes = new JComboBox(
			new String[] { "Please select a temple", "The Temple at Teos in Asia Minor", "Temple of Hercules", "Example temple 3" ,"Example temple 4"});
	
	ImageIcon icon = new ImageIcon("src/blkGUIone/BLK-Logo-White.jpg");
	public JLabel showInfo = new JLabel();
	public static String lbcj="none";
	
	public mainGUI() {
		// create mainframe
		mainframe = new JFrame("BLK project");

		// Panels
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel cards = new JPanel(new CardLayout());
		cards.add(p1, "mainpanel");
		cards.add(p2, "subpanel");
		CardLayout cl = (CardLayout) (cards.getLayout());
		cl.show(cards, "mainpanel");
		// label hello
		JLabel label = new JLabel(icon);

		// buttons in Panel

		bgo = new JButton("Go");
		bgo.addActionListener(new MyActionListener());

		bexit = new JButton("exit");
		bexit.addActionListener(new MyActionListener());

		// connect to listenner
		sizes.addItemListener(new MyItemListener());

		// add button to panel

		p1.add(sizes);
		p1.add(bgo);
		p1.add(showInfo);

		p1.add(bexit);

		label.setSize(350, 600);
		// add panel to frame
		mainframe.add(label);

		mainframe.add(cards);
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
				showInfo.setText("Teos was one of the twelve cities.");
						
				lbcj = "a";
			} else if (pe.equals("Temple of Hercules")) {
				showInfo.setText("description for temple 2");
				lbcj = "b";
			} else if (pe.equals("example temple3")) {
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
}