package blkGUIone;

import java.awt.Graphics;

import javax.swing.JPanel;

class Doric extends JPanel {
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		
		//outline
		g.drawLine(15, 50, 15, 450);
		g.drawLine(16, 50, 16, 450);
		g.drawLine(215, 50, 215, 450);
		g.drawLine(214, 50, 214, 450);
		g.drawLine(15, 50, 215, 50);
		g.drawLine(15, 51, 215, 51);
		g.drawLine(15, 450, 215, 450);
		g.drawLine(15, 449, 215, 449);
		
		
		g.drawLine(19, 54, 19, 446);
		g.drawLine(20, 54, 20, 446);
		g.drawLine(211, 54, 211, 446);
		g.drawLine(210, 54, 210, 446);
		g.drawLine(19, 54, 211, 54);
		g.drawLine(19, 55, 211, 55);
		g.drawLine(19, 446, 211, 446);
		g.drawLine(19, 445, 211, 445);
		
		
		g.drawLine(23, 58, 23, 442);
		g.drawLine(24, 58, 24, 442);
		g.drawLine(207, 58, 207, 442);
		g.drawLine(206, 58, 206, 442);
		g.drawLine(23, 58, 207, 58);
		g.drawLine(23, 59, 207, 59);
		g.drawLine(23, 442, 207, 442);
		g.drawLine(23, 441, 207, 441);
		
		
		g.drawLine(54, 88, 54, 412);
		g.drawLine(55, 88, 55, 412);
		g.drawLine(180, 88, 180, 412);
		g.drawLine(179, 88, 179, 412);
		g.drawLine(54, 88, 180, 88);
		g.drawLine(54, 89, 180, 89);
		g.drawLine(54, 412, 180, 412);
		g.drawLine(54, 411, 180, 411);
		
		g.drawLine(58, 92, 58, 408);
		g.drawLine(59, 92, 59, 408);
		g.drawLine(176, 92, 176, 408);
		g.drawLine(175, 92, 175, 408);
		g.drawLine(58, 92, 176, 92);
		g.drawLine(58, 93, 176, 93);
		g.drawLine(58, 408, 176, 408);
		g.drawLine(58, 407, 176, 407);
		
		
		//draw mid house
		g.drawLine(60, 122, 60, 378);
		g.drawLine(61, 122, 61, 378);
		g.drawLine(62, 122, 62, 378);
		g.drawLine(63, 122, 63, 378);
		
		g.drawLine(174, 122, 174, 378);
		g.drawLine(173, 122, 173, 378);
		g.drawLine(172, 122, 172, 378);
		g.drawLine(171, 122, 171, 378);
		
		g.drawLine(60, 122, 106, 122);
		g.drawLine(60, 123, 106, 123);
		g.drawLine(60, 124, 106, 124);
		g.drawLine(60, 125, 106, 125);
		g.drawLine(60, 126, 106, 126);
		g.drawLine(60, 127, 106, 127);
		
		g.drawLine(128, 122, 174, 122);
		g.drawLine(128, 123, 174, 123);
		g.drawLine(128, 124, 174, 124);
		g.drawLine(128, 125, 174, 125);
		g.drawLine(128, 126, 174, 126);
		g.drawLine(128, 127, 174, 127);
		
		g.drawLine(60, 378, 106, 378);
		g.drawLine(60, 377, 106, 377);
		g.drawLine(60, 376, 106, 376);
		g.drawLine(60, 375, 106, 375);
		g.drawLine(60, 374, 106, 374);
		g.drawLine(60, 373, 106, 373);
		
		g.drawLine(128, 378, 174, 378);
		g.drawLine(128, 377, 174, 377);
		g.drawLine(128, 376, 174, 376);
		g.drawLine(128, 375, 174, 375);
		g.drawLine(128, 374, 174, 374);
		g.drawLine(128, 373, 174, 373);
		
		g.drawLine(106, 379, 128, 379);
		g.drawLine(105, 372, 129, 372);
		g.drawLine(106, 121, 128, 121);
		g.drawLine(105, 128, 129, 128);
		
		g.drawLine(60, 207, 174, 207);
		g.drawLine(60, 208, 174, 208);
		g.drawLine(60, 209, 174, 209);
		g.drawLine(60, 210, 174, 210);
		g.drawLine(60, 211, 174, 211);
		
		g.drawLine(54, 121, 63, 121);
		g.drawLine(54, 120, 63, 120);
		g.drawLine(54, 119, 63, 119);
		g.drawLine(54, 118, 63, 118);
		g.drawLine(54, 117, 63, 117);
		
		g.drawLine(169, 121, 178, 121);
		g.drawLine(169, 120, 178, 120);
		g.drawLine(169, 119, 178, 119);
		g.drawLine(169, 118, 178, 118);
		g.drawLine(169, 117, 178, 117);
		
		g.drawLine(54, 380, 63, 380);
		g.drawLine(54, 381, 63, 381);
		g.drawLine(54, 382, 63, 382);
		g.drawLine(54, 383, 63, 383);
		g.drawLine(54, 379, 63, 379);
		
		g.drawLine(169, 379, 178, 379);
		g.drawLine(169, 380, 178, 380);
		g.drawLine(169, 381, 178, 381);
		g.drawLine(169, 382, 178, 382);
		g.drawLine(169, 383, 178, 383);
		
		
		//plies
		g.drawArc(24, 58, 10, 10, 0, 360);
		g.drawArc(24, 81, 10, 10, 0, 360);
		g.drawArc(24, 104, 10, 10, 0, 360);
		g.drawArc(24, 127, 10, 10, 0, 360);
		g.drawArc(24, 150, 10, 10, 0, 360);
		g.drawArc(24, 173, 10, 10, 0, 360);
		g.drawArc(24, 196, 10, 10, 0, 360);
		g.drawArc(24, 219, 10, 10, 0, 360);
		g.drawArc(24, 242, 10, 10, 0, 360);
		g.drawArc(24, 265, 10, 10, 0, 360);
		g.drawArc(24, 288, 10, 10, 0, 360);
		g.drawArc(24, 312, 10, 10, 0, 360);
		g.drawArc(24, 336, 10, 10, 0, 360);
		g.drawArc(24, 360, 10, 10, 0, 360);
		g.drawArc(24, 384, 10, 10, 0, 360);
		g.drawArc(24, 408, 10, 10, 0, 360);
		g.drawArc(24, 432, 10, 10, 0, 360);
		
		g.drawArc(196, 58, 10, 10, 0, 360);
		g.drawArc(196, 81, 10, 10, 0, 360);
		g.drawArc(196, 104, 10, 10, 0, 360);
		g.drawArc(196, 127, 10, 10, 0, 360);
		g.drawArc(196, 150, 10, 10, 0, 360);
		g.drawArc(196, 173, 10, 10, 0, 360);
		g.drawArc(196, 196, 10, 10, 0, 360);
		g.drawArc(196, 219, 10, 10, 0, 360);
		g.drawArc(196, 242, 10, 10, 0, 360);
		g.drawArc(196, 265, 10, 10, 0, 360);
		g.drawArc(196, 288, 10, 10, 0, 360);
		g.drawArc(196, 312, 10, 10, 0, 360);
		g.drawArc(196, 336, 10, 10, 0, 360);
		g.drawArc(196, 360, 10, 10, 0, 360);
		g.drawArc(196, 384, 10, 10, 0, 360);
		g.drawArc(196, 408, 10, 10, 0, 360);
		g.drawArc(196, 432, 10, 10, 0, 360);
		
		g.drawArc(48, 58, 10, 10, 0, 360);
		g.drawArc(72, 58, 10, 10, 0, 360);
		g.drawArc(96, 58, 10, 10, 0, 360);
		g.drawArc(123, 58, 10, 10, 0, 360);
		g.drawArc(147, 58, 10, 10, 0, 360);
		g.drawArc(171, 58, 10, 10, 0, 360);
		
		g.drawArc(48, 432, 10, 10, 0, 360);
		g.drawArc(72, 432, 10, 10, 0, 360);
		g.drawArc(96, 432, 10, 10, 0, 360);
		g.drawArc(123, 432, 10, 10, 0, 360);
		g.drawArc(147, 432, 10, 10, 0, 360);
		g.drawArc(171, 432, 10, 10, 0, 360);
		
		g.drawArc(59, 92, 9, 9, 0, 360);
		g.drawArc(81, 92, 9, 9, 0, 360);
		g.drawArc(103, 92, 9, 9, 0, 360);
		g.drawArc(124, 92, 9, 9, 0, 360);
		g.drawArc(145, 92, 9, 9, 0, 360);
		g.drawArc(167, 92, 9, 9, 0, 360);
		
		g.drawArc(59, 398, 9, 9, 0, 360);
		g.drawArc(81, 398, 9, 9, 0, 360);
		g.drawArc(103, 398, 9, 9, 0, 360);
		g.drawArc(124, 398, 9, 9, 0, 360);
		g.drawArc(145, 398, 9, 9, 0, 360);
		g.drawArc(167, 398, 9, 9, 0, 360);
		
		g.drawArc(96, 147, 10, 10, 0, 360);
		g.drawArc(96, 177, 10, 10, 0, 360);
		g.drawArc(126, 147, 10, 10, 0, 360);
		g.drawArc(126, 177, 10, 10, 0, 360);
		
		
		
		//plies-fills
		g.fillArc(24, 58, 10, 10, 0, 360);
		g.fillArc(24, 81, 10, 10, 0, 360);
		g.fillArc(24, 104, 10, 10, 0, 360);
		g.fillArc(24, 127, 10, 10, 0, 360);
		g.fillArc(24, 150, 10, 10, 0, 360);
		g.fillArc(24, 173, 10, 10, 0, 360);
		g.fillArc(24, 196, 10, 10, 0, 360);
		g.fillArc(24, 219, 10, 10, 0, 360);
		g.fillArc(24, 242, 10, 10, 0, 360);
		g.fillArc(24, 265, 10, 10, 0, 360);
		g.fillArc(24, 288, 10, 10, 0, 360);
		g.fillArc(24, 312, 10, 10, 0, 360);
		g.fillArc(24, 336, 10, 10, 0, 360);
		g.fillArc(24, 360, 10, 10, 0, 360);
		g.fillArc(24, 384, 10, 10, 0, 360);
		g.fillArc(24, 408, 10, 10, 0, 360);
		g.fillArc(24, 432, 10, 10, 0, 360);
		
		g.fillArc(196, 58, 10, 10, 0, 360);
		g.fillArc(196, 81, 10, 10, 0, 360);
		g.fillArc(196, 104, 10, 10, 0, 360);
		g.fillArc(196, 127, 10, 10, 0, 360);
		g.fillArc(196, 150, 10, 10, 0, 360);
		g.fillArc(196, 173, 10, 10, 0, 360);
		g.fillArc(196, 196, 10, 10, 0, 360);
		g.fillArc(196, 219, 10, 10, 0, 360);
		g.fillArc(196, 242, 10, 10, 0, 360);
		g.fillArc(196, 265, 10, 10, 0, 360);
		g.fillArc(196, 288, 10, 10, 0, 360);
		g.fillArc(196, 312, 10, 10, 0, 360);
		g.fillArc(196, 336, 10, 10, 0, 360);
		g.fillArc(196, 360, 10, 10, 0, 360);
		g.fillArc(196, 384, 10, 10, 0, 360);
		g.fillArc(196, 408, 10, 10, 0, 360);
		g.fillArc(196, 432, 10, 10, 0, 360);
	
		g.fillArc(48, 58, 10, 10, 0, 360);
		g.fillArc(72, 58, 10, 10, 0, 360);
		g.fillArc(96, 58, 10, 10, 0, 360);
		g.fillArc(123, 58, 10, 10, 0, 360);
		g.fillArc(147, 58, 10, 10, 0, 360);
		g.fillArc(171, 58, 10, 10, 0, 360);
		
		g.fillArc(48, 432, 10, 10, 0, 360);
		g.fillArc(72, 432, 10, 10, 0, 360);
		g.fillArc(96, 432, 10, 10, 0, 360);
		g.fillArc(123, 432, 10, 10, 0, 360);
		g.fillArc(147, 432, 10, 10, 0, 360);
		g.fillArc(171, 432, 10, 10, 0, 360);
		
		g.fillArc(59, 92, 9, 9, 0, 360);
		g.fillArc(81, 92, 9, 9, 0, 360);
		g.fillArc(103, 92, 9, 9, 0, 360);
		g.fillArc(124, 92, 9, 9, 0, 360);
		g.fillArc(145, 92, 9, 9, 0, 360);
		g.fillArc(167, 92, 9, 9, 0, 360);
		
		g.fillArc(59, 398, 9, 9, 0, 360);
		g.fillArc(81, 398, 9, 9, 0, 360);
		g.fillArc(103, 398, 9, 9, 0, 360);
		g.fillArc(124, 398, 9, 9, 0, 360);
		g.fillArc(145, 398, 9, 9, 0, 360);
		g.fillArc(167, 398, 9, 9, 0, 360);
		
		g.fillArc(96, 147, 10, 10, 0, 360);
		g.fillArc(96, 177, 10, 10, 0, 360);
		g.fillArc(126, 147, 10, 10, 0, 360);
		g.fillArc(126, 177, 10, 10, 0, 360);
		
		
		//inside-stacks
		g.drawLine(82, 229, 82, 373);
		g.drawLine(86, 229, 86, 373);
		g.drawLine(149, 229, 149, 373);
		g.drawLine(153, 229, 153, 373);
		
		g.drawLine(82, 229, 153, 229);
		g.drawLine(82, 234, 153, 234);
		
		
		g.drawLine(83, 366, 83, 373);
		g.drawLine(84, 366, 84, 373);
		g.drawLine(85, 366, 85, 373);
		
		g.drawLine(83, 352, 83, 359);
		g.drawLine(84, 352, 84, 359);
		g.drawLine(85, 352, 85, 359);
		
		g.drawLine(83, 338, 83, 345);
		g.drawLine(84, 338, 84, 345);
		g.drawLine(85, 338, 85, 345);
		
		g.drawLine(83, 324, 83, 331);
		g.drawLine(84, 324, 84, 331);
		g.drawLine(85, 324, 85, 331);
		
		g.drawLine(83, 310, 83, 317);
		g.drawLine(84, 310, 84, 317);
		g.drawLine(85, 310, 85, 317);
		
		g.drawLine(83, 296, 83, 303);
		g.drawLine(84, 296, 84, 303);
		g.drawLine(85, 296, 85, 303);
		
		g.drawLine(83, 282, 83, 289);
		g.drawLine(84, 282, 84, 289);
		g.drawLine(85, 282, 85, 289);
		
		g.drawLine(83, 268, 83, 275);
		g.drawLine(84, 268, 84, 275);
		g.drawLine(85, 268, 85, 275);
		
		g.drawLine(83, 254, 83, 261);
		g.drawLine(84, 254, 84, 261);
		g.drawLine(85, 254, 85, 261);
		
		g.drawLine(83, 240, 83, 247);
		g.drawLine(84, 240, 84, 247);
		g.drawLine(85, 240, 85, 247);
		
		g.drawLine(83, 229, 83, 234);
		g.drawLine(84, 229, 84, 234);
		g.drawLine(85, 229, 85, 234);
		
		g.drawLine(150, 366, 150, 373);
		g.drawLine(151, 366, 151, 373);
		g.drawLine(152, 366, 152, 373);
		
		g.drawLine(150, 352, 150, 359);
		g.drawLine(151, 352, 151, 359);
		g.drawLine(152, 352, 152, 359);
		
		g.drawLine(150, 338, 150, 345);
		g.drawLine(151, 338, 151, 345);
		g.drawLine(152, 338, 152, 345);
		
		g.drawLine(150, 324, 150, 331);
		g.drawLine(151, 324, 151, 331);
		g.drawLine(152, 324, 152, 331);
		
		g.drawLine(150, 310, 150, 317);
		g.drawLine(151, 310, 151, 317);
		g.drawLine(152, 310, 152, 317);
		
		g.drawLine(150, 296, 150, 303);
		g.drawLine(151, 296, 151, 303);
		g.drawLine(152, 296, 152, 303);
		
		g.drawLine(150, 282, 150, 289);
		g.drawLine(151, 282, 151, 289);
		g.drawLine(152, 282, 152, 289);
		
		g.drawLine(150, 268, 150, 275);
		g.drawLine(151, 268, 151, 275);
		g.drawLine(152, 268, 152, 275);
		
		g.drawLine(150, 254, 150, 261);
		g.drawLine(151, 254, 151, 261);
		g.drawLine(152, 254, 152, 261);
		
		g.drawLine(150, 240, 150, 247);
		g.drawLine(151, 240, 151, 247);
		g.drawLine(152, 240, 152, 247);
		
		g.drawLine(150, 229, 150, 234);
		g.drawLine(151, 229, 151, 234);
		g.drawLine(152, 229, 152, 234);
		
		
		g.drawLine(135, 230, 142, 230);
		g.drawLine(135, 231, 142, 231);
		g.drawLine(135, 232, 142, 232);
		g.drawLine(135, 233, 142, 233);
		
		g.drawLine(121, 230, 128, 230);
		g.drawLine(121, 231, 128, 231);
		g.drawLine(121, 232, 128, 232);
		g.drawLine(121, 233, 128, 233);
		
		g.drawLine(107, 230, 114, 230);
		g.drawLine(107, 231, 114, 231);
		g.drawLine(107, 232, 114, 232);
		g.drawLine(107, 233, 114, 233);
		
		g.drawLine(93, 230, 100, 230);
		g.drawLine(93, 231, 100, 231);
		g.drawLine(93, 232, 100, 232);
		g.drawLine(93, 233, 100, 233);
		
		g.drawLine(100, 261, 100, 275);
		g.drawLine(99, 261, 99, 275);
		g.drawLine(100, 261, 135, 261);
		g.drawLine(100, 262, 135, 262);
		g.drawLine(135, 261, 135, 275);
		g.drawLine(136, 261, 136, 275);
		g.drawLine(100, 275, 135, 275);
		g.drawLine(100, 274, 135, 274);	
		
		
	}
}

