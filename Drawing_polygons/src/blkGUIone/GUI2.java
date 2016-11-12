package blkGUIone;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class GUI2 extends JFrame {
	private JFrame birdyf;
	public JTabbedPane jtp = new JTabbedPane(JTabbedPane.TOP);
	private JTextField showFeild = new JTextField();

	public GUI2() {

		// Jframe
		birdyf = new JFrame();
		System.out.println("out");
		setVisible(true);

		// JPanel

		if (mainGUI.lbcj.equals("a")) {
			JPanel panel = new temple1();
			jtp.add("2d", panel);
		} else if (mainGUI.lbcj.equals("b")) {
			JPanel panel = new templeofherculer();
			jtp.add("2d", panel);

		}
		// JTabbed Pane

		jtp.addTab("3d", new JPanel());
		jtp.addChangeListener(new MyChangeListener());
		jtp.setSize(350, 100);

		birdyf.add(jtp);

		// add
		birdyf.setSize(350, 600);
		birdyf.setVisible(true);

	}

	class MyChangeListener implements ChangeListener {

		@Override
		public void stateChanged(ChangeEvent e) {
			String temp = jtp.getTitleAt(jtp.getSelectedIndex());
		}
	}

}
