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

class GUI2 extends JFrame {
	private JFrame birdyf;
	private JTabbedPane jtp = new JTabbedPane(JTabbedPane.TOP);
	private JTextField showFeild = new JTextField();

	public GUI2() {

		// Jframe
		birdyf = new JFrame("Example temple 1");
		System.out.println("out");
		setVisible(true);

		// JPanel
		JPanel panel = new temple1();

		// JTabbed Pane

		jtp.addTab("2D", panel);
		jtp.addTab("3D", new JPanel());
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
