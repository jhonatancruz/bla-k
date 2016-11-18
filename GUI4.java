

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
 * @author Peiyu Guo
 *
 */

public class GUI4 extends JFrame implements ActionListener {

	public static final String g = null;
	private JFrame mainframe;
	private JPanel p, p1, p2, p3;
	private JButton twod, threed, bexit;
	private static JComboBox sizes = new JComboBox(
			new String[] { "example temple1", "example temple2", "example temple3" });

	public static void main(String[] args) {
		new GUI4();

	}

	public GUI4() {

		// create mainframe
		mainframe = new JFrame("BLK project");
		mainframe.setLayout(new GridLayout(1, 2));

		// layout
		p3 = new JPanel(new FlowLayout());
		p = new JPanel(new FlowLayout());
		p1 = new JPanel(new FlowLayout());
		p2 = new JPanel(new FlowLayout());

		// buttons in mainframe
		twod = new JButton("2D");
		twod.addActionListener(this);
		threed = new JButton("3D");
		threed.addActionListener(this);
		bexit = new JButton("exit");
		bexit.addActionListener(this);
		sizes.addActionListener(this);

		// add button to panel
		p3.add(sizes);
		p.add(twod);
		p1.add(threed);
		p2.add(bexit);

		// add panel to frame
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

		String arg = e.getActionCommand();

		if (arg == "2D") {
			new GUI();

			// JOptionPane.showMessageDialog(p, message);

		} else if (arg == "3D") {
			//new GUI3();
		} else if (arg == "exit") {
			System.exit(0);
		}

	}

	class GUI extends JFrame {

		private JFrame birdyf;

		public GUI() {

			birdyf = new JFrame("Bird Eye View");

			System.out.println("out");

			birdyf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			birdyf.setVisible(true);

			birdyf.setSize(800, 800);

			JPanel panel = new MyJPanel(); // changed this line
			birdyf.add(panel);

			birdyf.validate(); // because you added panel after setVisible was
								// called
			birdyf.repaint(); // because you added panel after setVisible was
								// called

		}

		class MyJPanel extends JPanel {
			@Override
			public void paintComponent(Graphics g) {
				super.paintComponent(g);
				
				
				//outline
				g.drawRect(15, 50, 150, 250);
				g.drawRect(16, 51, 148, 248);
				
				
				//inside square
				g.drawLine(30, 65, 150, 65);
				g.drawLine(30, 66, 150, 66);
				g.drawLine(30, 67, 150, 67);
				g.drawLine(30, 68, 150, 68);
				g.drawLine(30, 69, 150, 69);
				g.drawLine(30, 70, 150, 70);
				g.drawLine(30, 71, 150, 71);
				g.drawLine(30, 72, 150, 72);
				g.drawLine(30, 73, 150, 73);
				
				
				g.drawLine(30, 65, 30, 185);
				g.drawLine(31, 65, 31, 185);
				g.drawLine(32, 65, 32, 185);
				g.drawLine(33, 65, 33, 185);
				g.drawLine(34, 65, 34, 185);
				g.drawLine(35, 65, 35, 185);
				g.drawLine(36, 65, 36, 185);
				g.drawLine(37, 65, 37, 185);
				g.drawLine(38, 65, 38, 185);
				
				g.drawLine(142, 65, 142, 185);
				g.drawLine(143, 65, 143, 185);
				g.drawLine(144, 65, 144, 185);
				g.drawLine(145, 65, 145, 185);
				g.drawLine(146, 65, 146, 185);
				g.drawLine(147, 65, 147, 185);
				g.drawLine(148, 65, 148, 185);
				g.drawLine(149, 65, 149, 185);
				g.drawLine(150, 65, 150, 185);
				
				g.drawLine(30, 177, 150, 177);
				g.drawLine(30, 178, 150, 178);
				g.drawLine(30, 179, 70, 179);
				g.drawLine(30, 180, 70, 180);
				g.drawLine(30, 181, 70, 181);
				g.drawLine(30, 182, 70, 182);
				g.drawLine(30, 183, 70, 183);
				g.drawLine(110,179, 150, 179);
				g.drawLine(110,180, 150, 180);
				g.drawLine(110,181, 150, 181);
				g.drawLine(110,182, 150, 182);
				g.drawLine(110,183, 150, 183);
				g.drawLine(30, 184, 150, 184);
				g.drawLine(30, 185, 150, 185);
				
				//piles
				g.drawArc(28, 210, 12, 12, 0, 360);
				g.drawArc(140, 210, 12, 12, 0, 360);
				g.drawArc(28, 263, 12, 12, 0, 360);
				g.drawArc(140, 263, 12, 12, 0, 360);
				
				g.fillArc(28, 210, 12, 12, 0, 360);
				g.fillArc(140, 210, 12, 12, 0, 360);
				g.fillArc(28, 263, 12, 12, 0, 360);
				g.fillArc(140, 263, 12, 12, 0, 360);
				
				//stairs
				g.drawLine(5, 198, 15, 198);
				g.drawLine(5, 199, 15, 199);
				
				g.drawLine(5, 198, 5, 400);
				g.drawLine(6, 198, 6, 400);
				
				g.drawLine(5, 400, 165, 400);
				g.drawLine(5, 399, 165, 399);
				
				g.drawLine(165, 300, 165, 400);
				g.drawLine(164, 300, 164, 400);
				
				g.drawLine(5, 396, 161, 396);
				g.drawLine(5, 395, 161, 395);
				
				g.drawLine(161, 300, 161, 396);
				g.drawLine(160, 300, 160, 396);
				
				g.drawLine(5, 392, 157, 392);
				g.drawLine(5, 391, 157, 391);
				
				g.drawLine(157, 300, 157, 392);
				g.drawLine(156, 300, 156, 392);
				
				g.drawLine(5, 388, 153, 388);
				g.drawLine(5, 387, 153, 387);
				
				g.drawLine(153, 300, 153, 388);
				g.drawLine(152, 300, 152, 388);
				
				g.drawLine(5, 384, 149, 384);
				g.drawLine(5, 383, 149, 383);
				
				g.drawLine(149, 300, 149, 384);
				g.drawLine(148, 300, 148, 384);
				
				
				
				
				
				
				
			}
		}

	}
}