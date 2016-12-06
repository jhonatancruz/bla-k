package blkGUIone;

import java.awt.Graphics;

import javax.swing.JPanel;

class temple5 extends JPanel {
	public void paintComponent(Graphics g) {

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
