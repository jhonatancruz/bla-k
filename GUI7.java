

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

public class GUI7 extends JFrame implements ActionListener {

	public static final String g = null;
	private JFrame mainframe;
	private JPanel p, p1, p2, p3;
	private JButton twod, threed, bexit;
	private static JComboBox sizes = new JComboBox(
			new String[] { "example temple1", "example temple2", "example temple3" });

	public static void main(String[] args) {
		new GUI7();

	}

	public GUI7() {

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
				g.drawRect(15, 50, 150, 270);
				g.drawRect(16, 51, 148, 268);
				
				
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
				
				
				g.drawLine(30, 65, 30, 235);
				g.drawLine(31, 65, 31, 235);
				g.drawLine(32, 65, 32, 235);
				g.drawLine(33, 65, 33, 235);
				g.drawLine(34, 65, 34, 235);
				g.drawLine(35, 65, 35, 235);
				g.drawLine(36, 65, 36, 235);
				g.drawLine(37, 65, 37, 235);
				g.drawLine(38, 65, 38, 235);
				
				g.drawLine(142, 65, 142, 235);
				g.drawLine(143, 65, 143, 235);
				g.drawLine(144, 65, 144, 235);
				g.drawLine(145, 65, 145, 235);
				g.drawLine(146, 65, 146, 235);
				g.drawLine(147, 65, 147, 235);
				g.drawLine(148, 65, 148, 235);
				g.drawLine(149, 65, 149, 235);
				g.drawLine(150, 65, 150, 235);
				
				g.drawLine(30, 227, 150, 227);
				g.drawLine(30, 228, 150, 228);
				g.drawLine(30, 229, 70, 229);
				g.drawLine(30, 230, 70, 230);
				g.drawLine(30, 231, 70, 231);
				g.drawLine(30, 232, 70, 232);
				g.drawLine(30, 233, 70, 233);
				g.drawLine(110,229, 150, 229);
				g.drawLine(110,230, 150, 230);
				g.drawLine(110,231, 150, 231);
				g.drawLine(110,232, 150, 232);
				g.drawLine(110,233, 150, 233);
				g.drawLine(30, 234, 150, 234);
				g.drawLine(30, 235, 150, 235);
				
				//piles
				g.drawArc(28, 260, 12, 12, 0, 360);
				g.drawArc(140, 260, 12, 12, 0, 360);
				g.drawArc(28, 298, 12, 12, 0, 360);
				g.drawArc(140, 298, 12, 12, 0, 360);
				g.drawArc(60, 298, 12, 12, 0, 360);
				g.drawArc(107, 298, 12, 12, 0, 360);
				
				g.fillArc(28, 260, 12, 12, 0, 360);
				g.fillArc(140, 260, 12, 12, 0, 360);
				g.fillArc(28, 298, 12, 12, 0, 360);
				g.fillArc(140, 298, 12, 12, 0, 360);
				g.fillArc(60, 298, 12, 12, 0, 360);
				g.fillArc(107, 298, 12, 12, 0, 360);
				
				//stairs
				g.drawLine(15, 352, 165, 352);
				g.drawLine(15, 351, 165, 351);
				
				g.drawLine(15, 348, 165, 348);
				g.drawLine(15, 347, 165, 347);
				
				g.drawLine(15, 344, 165, 344);
				g.drawLine(15, 343, 165, 343);
				
				g.drawLine(15, 340, 165, 340);
				g.drawLine(15, 339, 165, 339);
				
				g.drawLine(15, 336, 165, 336);
				g.drawLine(15, 335, 165, 335);
				
				g.drawLine(15, 332, 165, 332);
				g.drawLine(15, 331, 165, 331);
				
				g.drawLine(15, 328, 165, 328);
				g.drawLine(15, 327, 165, 327);
				
				g.drawLine(15, 324, 165, 324);
				g.drawLine(15, 323, 165, 323);
				
				g.drawLine(15, 320, 15, 352);
				g.drawLine(16, 320, 16, 352);
				
				g.drawLine(165, 320, 165, 352);
				g.drawLine(164, 320, 164, 352);
				
				
				
				
				
				
				
				
				
			}
		}

	}
}