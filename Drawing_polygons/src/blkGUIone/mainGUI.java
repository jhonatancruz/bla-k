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


/**
 * @author danielxu
 *
 */
public class mainGUI extends JFrame{
	

	public static final String g = null;
	private JFrame mainframe;
	private JPanel p1;
	private JButton bgo ,bexit;
	private static JComboBox sizes = new JComboBox(new String[] {"Please select one temple","example temple1","example temple2","example temple3"});	
	//java.net.URL imgUrl = getClass().getResource("BLK-Logo-White.png");
	//ImageIcon icon = new ImageIcon("");
	ImageIcon icon = new ImageIcon("/Users/danielxu/Downloads/BLK-Logo-White.jpg");
	public JLabel showInfo = new JLabel();
	public static String lbcj;
	

	public mainGUI(){
		//create mainframe
		mainframe =new JFrame("BLK project");
		
		
		
		//Panels
		JPanel p1= new JPanel();
		JPanel p2=new JPanel();
		JPanel cards= new JPanel(new CardLayout());
		cards.add(p1,"mainpanel");
		cards.add(p2,"subpanel");
		CardLayout cl= (CardLayout)(cards.getLayout());
		cl.show(cards, "mainpanel");
		//label
        JLabel label = new JLabel(icon);
        
		//buttons in Panel
		
		bgo=new JButton("Go");
		bgo.addActionListener(new MyActionListener());
		
		bexit=new JButton("exit");
		bexit.addActionListener(new MyActionListener());
		
		//connect to listenner
		sizes.addItemListener(new MyItemListener());
		
		//add button to panel
		
		p1.add(sizes);
		p1.add(bgo);
		p1.add(showInfo);
		
		p1.add(bexit);
		
		label.setSize(350,600);
		//add panel to frame
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
	

	class MyActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String arg =e.getActionCommand();
			if (arg=="exit"){
				System.exit(0);
			}
	
			else if(arg=="Go"){
				System.out.println(lbcj);
				if(lbcj=="none"){
					JOptionPane.showMessageDialog(null, "Please choose a temple");
				}else{
					new GUI2();
				}
				
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
			}else if(pe.equals("Please select one temple")){
				
				lbcj="none";
			}
		}

		
	}
}





