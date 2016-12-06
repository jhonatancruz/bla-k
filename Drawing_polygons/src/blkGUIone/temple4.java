package blkGUIone;

import java.awt.Graphics;

import javax.swing.JPanel;

class temple4 extends JPanel {
	public void paintComponent(Graphics g) {
		g.drawRect(15, 50, 150, 190);
		g.drawRect(16, 51, 148, 188);
		
		
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
		
		//plies
		g.drawArc(25, 222, 12, 12, 0, 360);
		g.drawArc(55, 222, 12, 12, 0, 360);
		g.drawArc(112, 222, 12, 12, 0, 360);
		g.drawArc(142, 222, 12, 12, 0, 360);
		
		g.fillArc(25, 222, 12, 12, 0, 360);
		g.fillArc(55, 222, 12, 12, 0, 360);
		g.fillArc(112, 222, 12, 12, 0, 360);
		g.fillArc(142, 222, 12, 12, 0, 360);
		
		//stairs
		g.drawLine(37, 240, 37, 260);
		g.drawLine(38, 240, 38, 260);
		
		g.drawLine(142, 240, 142, 264);
		g.drawLine(141, 240, 141, 264);
		
		g.drawLine(37, 260, 142, 260);
		g.drawLine(37, 259, 142, 259);
		
		g.drawLine(37, 256, 142, 256);
		g.drawLine(37, 255, 142, 255);
		
		g.drawLine(37, 252, 142, 252);
		g.drawLine(37, 251, 142, 251);
		
		g.drawLine(37, 248, 142, 248);
		g.drawLine(37, 247, 142, 247);
		
		g.drawLine(37, 244, 142, 244);
		g.drawLine(37, 243, 142, 243);
		
		g.drawLine(90, 264, 142, 264);
		g.drawLine(90, 263, 142, 263);
		
		g.drawLine(90, 260, 90, 264);
		g.drawLine(91, 259, 91, 263);
	}
}
