
import java.util.Scanner;


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

public class GUI extends JFrame implements ActionListener {

	public static final String g = null;
	private JFrame mainframe;
	private JPanel p, p1, p2, p3;
	private JButton twod, threed, bexit;
	private static JComboBox sizes = new JComboBox(
			new String[] { "example temple1", "example temple2", "example temple3" });

	public static void main(String[] args) {
		new GUI();

	}

	public GUI() {

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
		System.out.println(mainframe.getWidth());
		System.out.println(mainframe.getHeight());
		

	}

	@Override

	public void actionPerformed(ActionEvent e) {

		String arg = e.getActionCommand();

		if (arg == "2D") {
			new GUI2();

			// JOptionPane.showMessageDialog(p, message);

		} else if (arg == "3D") {
			//new GUI3();
		} else if (arg == "exit") {
			System.exit(0);
		}

	}

	class GUI2 extends JFrame {

		private JFrame birdyf;

		public GUI2() {

			birdyf = new JFrame("Bird Eye View");

			System.out.println("out");

			Scanner scanner = new Scanner(System.in);
			birdyf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			birdyf.setVisible(true);
			birdyf.setSize(scanner.nextInt(), scanner.nextInt());

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
				
				//upper triangle
				g.drawLine(90, 200, 225, 100);
				g.drawLine(90, 201, 225, 101);
				g.drawLine(90, 202, 225, 102);
				g.drawLine(91, 202, 226, 102);
				
				g.drawLine(360, 200, 226, 100);
				g.drawLine(360, 201, 226, 101);
				g.drawLine(360, 202, 226, 102);
				g.drawLine(359, 202, 225, 102);
				
				g.drawLine(90, 200, 150, 200);
				g.drawLine(90, 201, 150, 201);
				g.drawLine(90, 202, 150, 202);
				
				g.drawLine(300, 200, 360, 200);
				g.drawLine(300, 201, 360, 201);
				g.drawLine(300, 202, 360, 202);
				
				//mid-square
				g.drawLine(150, 200, 150, 250);
				g.drawLine(151, 200, 151, 250);
				g.drawLine(152, 200, 152, 250);
				g.drawLine(153, 200, 153, 250);
				g.drawLine(154, 200, 154, 250);
				
				g.drawLine(150, 300, 150, 350);
				g.drawLine(151, 300, 151, 350);
				g.drawLine(152, 300, 152, 350);
				g.drawLine(153, 300, 153, 350);
				g.drawLine(154, 300, 154, 350);
				
				g.drawLine(300, 200, 300, 350);
				g.drawLine(299, 200, 299, 350);
				g.drawLine(298, 200, 298, 350);
				g.drawLine(297, 200, 297, 350);
				g.drawLine(296, 200, 296, 350);
				
				//lower triangle
				g.drawLine(90, 350, 150, 350);
				g.drawLine(90, 349, 150, 349);
				g.drawLine(90, 348, 150, 348);
				
				g.drawLine(300, 350, 360, 350);
				g.drawLine(300, 349, 360, 349);
				g.drawLine(300, 348, 360, 348);
				
				g.drawLine(90, 350, 225, 450);
				g.drawLine(90, 351, 225, 451);
				g.drawLine(90, 352, 225, 452);
				g.drawLine(91, 352, 226, 452);
				
				g.drawLine(360, 350, 225, 450);
				g.drawLine(360, 351, 225, 451);
				g.drawLine(360, 352, 225, 452);
				g.drawLine(361, 352, 226, 452);
				
				// piles
				g.drawArc(210, 110, 30, 30, 0, 360);
				g.drawArc(120, 178, 20, 20, 0, 360);
				g.drawArc(310, 178, 20, 20, 0, 360);
				g.drawArc(210, 410, 30, 30, 0, 360);
				g.drawArc(120, 352, 20, 20, 0, 360);
				g.drawArc(310, 352, 20, 20, 0, 360);
				
				g.drawArc(195,  220, 15, 15, 0, 360);
				g.drawArc(240,  220, 15, 15, 0, 360);
				g.drawArc(195,  315, 15, 15, 0, 360);
				g.drawArc(240,  315, 15, 15, 0, 360);
				
				
				// Fill
				g.fillArc(210, 110, 30, 30, 0, 360);
				g.fillArc(120, 178, 20, 20, 0, 360);
				g.fillArc(310, 178, 20, 20, 0, 360);
				g.fillArc(210, 410, 30, 30, 0, 360);
				g.fillArc(120, 352, 20, 20, 0, 360);
				g.fillArc(310, 352, 20, 20, 0, 360);
				
				g.fillArc(195,  220, 15, 15, 0, 360);
				g.fillArc(240,  220, 15, 15, 0, 360);
				g.fillArc(195,  315, 15, 15, 0, 360);
				g.fillArc(240,  315, 15, 15, 0, 360);
				
				// mid-square
				g.drawLine(180, 210, 180, 255);
				g.drawLine(181, 210, 181, 255);
				g.drawLine(182, 210, 182, 255);
				g.drawLine(183, 210, 183, 255);
				g.drawLine(184, 210, 184, 255);
				
				g.drawLine(180, 295, 180, 340);
				g.drawLine(181, 295, 181, 340);
				g.drawLine(182, 295, 182, 340);
				g.drawLine(183, 295, 183, 340);
				g.drawLine(184, 295, 184, 340);
				
				g.drawLine(270, 210, 270, 340);
				g.drawLine(269, 210, 269, 340);
				g.drawLine(268, 210, 268, 340);
				g.drawLine(267, 210, 267, 340);
				g.drawLine(266, 210, 266, 340);
				
				g.drawLine(180, 210, 270, 210);
				g.drawLine(180, 211, 270, 211);
				g.drawLine(180, 212, 270, 212);
				g.drawLine(180, 213, 270, 213);
				g.drawLine(180, 214, 270, 214);
				
				g.drawLine(180, 340, 270, 340);
				g.drawLine(180, 339, 270, 339);
				g.drawLine(180, 338, 270, 338);
				g.drawLine(180, 337, 270, 337);
				g.drawLine(180, 336, 270, 336);
				
				//staircase
				g.drawLine(200, 180, 250, 180);
				g.drawLine(200, 181, 250, 181);
				g.drawLine(200, 182, 250, 182);
				
				g.drawLine(200, 200, 250, 200);
				g.drawLine(200, 201, 250, 201);
				g.drawLine(200, 202, 250, 202);
				
				g.drawLine(200, 180, 200, 200);
				g.drawLine(201, 180, 201, 200);
				g.drawLine(202, 180, 202, 200);
				
				g.drawLine(212, 180, 212, 200);
				g.drawLine(213, 180, 213, 200);
				g.drawLine(214, 180, 214, 200);
				
				g.drawLine(225, 180, 225, 200);
				g.drawLine(226, 180, 226, 200);
				g.drawLine(227, 180, 227, 200);
				
				g.drawLine(238, 180, 238, 200);
				g.drawLine(239, 180, 239, 200);
				g.drawLine(240, 180, 240, 200);
				
				g.drawLine(250, 180, 250, 200);
				g.drawLine(251, 180, 251, 200);
				g.drawLine(252, 180, 252, 200);
				
				
				g.drawLine(200, 350, 250, 350);
				g.drawLine(200, 349, 250, 349);
				g.drawLine(200, 348, 250, 348);
				
				g.drawLine(200, 370, 250, 370);
				g.drawLine(200, 369, 250, 369);
				g.drawLine(200, 368, 250, 368);
				
				g.drawLine(200, 350, 200, 370);
				g.drawLine(201, 350, 201, 370);
				g.drawLine(202, 350, 202, 370);
				
				g.drawLine(212, 350, 212, 370);
				g.drawLine(213, 350, 213, 370);
				g.drawLine(214, 350, 214, 370);
				
				g.drawLine(225, 350, 225, 370);
				g.drawLine(226, 350, 226, 370);
				g.drawLine(227, 350, 227, 370);
				
				g.drawLine(238, 350, 238, 370);
				g.drawLine(239, 350, 239, 370);
				g.drawLine(240, 350, 240, 370);
				
				g.drawLine(250, 350, 250, 370);
				g.drawLine(251, 350, 251, 370);
				g.drawLine(252, 350, 252, 370);
				
				
				
				
				
				
				
				
				
				//g.drawLine(y1, y1, x2, y2);

				// g.drawArc(20,150,10,10,0,360);
				
				
				
			}
		}

	}
}