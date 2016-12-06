package blkGUIone;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

class temple2 extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponents(g);
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
	}
}