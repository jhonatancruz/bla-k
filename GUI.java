package groupproject;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class GUI2 extends JFrame{
	private JFrame birdyf;
	private JTabbedPane jtp=new JTabbedPane(JTabbedPane.TOP);
	private JTextField showFeild=new JTextField();
	
	public GUI2(){
				
		
		//Jframe
		birdyf =new JFrame("Bird Eye View");
		System.out.println("out");
		setVisible(true);
		
		//JPanel
		JPanel panel= new MyJPanel();
		
		//JTabbed Pane
		jtp.addTab("2d", new JPanel());
		jtp.addTab("3d", new JPanel());
		jtp.addTab("description", new JPanel());
		jtp.addChangeListener(new MyChangeListener());
		birdyf.add(jtp);
		birdyf.add(showFeild, BorderLayout.SOUTH);
		birdyf.add(jtp,BorderLayout.CENTER);
		
		//add
		birdyf.add(panel,BorderLayout.CENTER);
		birdyf.setSize(800, 800);
		birdyf.setVisible(true);
	}
	class MyChangeListener implements ChangeListener{

		@Override
		public void stateChanged(ChangeEvent e) {
			String temp = jtp.getTitleAt(jtp.getSelectedIndex());
		}
		
	}

	class MyJPanel extends JPanel {
	public void paintComponent(Graphics g){
		super.paintComponents(g);
	
		g.drawArc(20,50,10,10,0,360);
		g.drawArc(35,50,10,10,0,360);
		g.drawArc(50,50,10,10,0,360);
		g.drawArc(70,50,10,10,0,360);
		g.drawArc(85,50,10,10,0,360);
		g.drawArc(100,50,10,10,0,360);
		g.drawArc(20,70,10,10,0,360);
		g.drawArc(35,70,10,10,0,360);
		g.drawArc(50,70,10,10,0,360);
		g.drawArc(70,70,10,10,0,360);
		g.drawArc(85,70,10,10,0,360);
		g.drawArc(100,70,10,10,0,360);
		//Fill
		g.fillArc(20,50,10,10,0,360);
		g.fillArc(35,50,10,10,0,360);
		g.fillArc(50,50,10,10,0,360);
		g.fillArc(70,50,10,10,0,360);
		g.fillArc(85,50,10,10,0,360);
		g.fillArc(100,50,10,10,0,360);
		g.fillArc(20,70,10,10,0,360);
		g.fillArc(35,70,10,10,0,360);
		g.fillArc(50,70,10,10,0,360);
		g.fillArc(70,70,10,10,0,360);
		g.fillArc(85,70,10,10,0,360);
		g.fillArc(100,70,10,10,0,360);
		g.setColor(Color.black);
		//Down Left side
		g.drawArc(20,90,10,10,0,360);
		g.drawArc(20,110,10,10,0,360);
		g.drawArc(20,130,10,10,0,360);
		g.drawArc(20,150,10,10,0,360);
		g.drawArc(20,170,10,10,0,360);
		g.drawArc(20,190,10,10,0,360);
		g.drawArc(20,210,10,10,0,360);
		g.drawArc(20,230,10,10,0,360);
		g.drawArc(20,250,10,10,0,360);
		//Fill Left side
		g.fillArc(20,90,10,10,0,360);
		g.fillArc(20,110,10,10,0,360);
		g.fillArc(20,130,10,10,0,360);
		g.fillArc(20,150,10,10,0,360);
		g.fillArc(20,170,10,10,0,360);
		g.fillArc(20,190,10,10,0,360);
		g.fillArc(20,210,10,10,0,360);
		g.fillArc(20,230,10,10,0,360);
		g.fillArc(20,250,10,10,0,360);
		g.setColor(Color.black);
		//Across bottom
		g.drawArc(35,250,10,10,0,360);
		g.drawArc(50,250,10,10,0,360);
		g.drawArc(70,250,10,10,0,360);
		g.drawArc(85,250,10,10,0,360);
		g.drawArc(100,250,10,10,0,360);
		g.drawArc(20,270,10,10,0,360);
		g.drawArc(35,270,10,10,0,360);
		g.drawArc(50,270,10,10,0,360);
		g.drawArc(70,270,10,10,0,360);
		g.drawArc(85,270,10,10,0,360);
		g.drawArc(100,270,10,10,0,360);
		//Fill Bottom
		g.fillArc(35,250,10,10,0,360);
		g.fillArc(50,250,10,10,0,360);
		g.fillArc(70,250,10,10,0,360);
		g.fillArc(85,250,10,10,0,360);
		g.fillArc(100,250,10,10,0,360);
		g.fillArc(20,270,10,10,0,360);
		g.fillArc(35,270,10,10,0,360);
		g.fillArc(50,270,10,10,0,360);
		g.fillArc(70,270,10,10,0,360);
		g.fillArc(85,270,10,10,0,360);
		g.fillArc(100,270,10,10,0,360);
		g.setColor(Color.black);
		//Down right side
		g.drawArc(100,90,10,10,0,360);
		g.drawArc(100,110,10,10,0,360);
		g.drawArc(100,130,10,10,0,360);
		g.drawArc(100,150,10,10,0,360);
		g.drawArc(100,170,10,10,0,360);
		g.drawArc(100,190,10,10,0,360);
		g.drawArc(100,210,10,10,0,360);
		g.drawArc(100,230,10,10,0,360);
		g.drawArc(100,250,10,10,0,360);
		//Fill
		g.fillArc(100,90,10,10,0,360);
		g.fillArc(100,110,10,10,0,360);
		g.fillArc(100,130,10,10,0,360);
		g.fillArc(100,150,10,10,0,360);
		g.fillArc(100,170,10,10,0,360);
		g.fillArc(100,190,10,10,0,360);
		g.fillArc(100,210,10,10,0,360);
		g.fillArc(100,230,10,10,0,360);
		g.fillArc(100,250,10,10,0,360);
		g.setColor(Color.black);
		//Border around
		g.drawRect(15,15,100,280);
		g.drawRect(14,14,100,280);
		g.drawRect(15,15,101,281);
		//Line_left_side
		g.drawLine(38,70,38,260);
		g.drawLine(39,70,39,260);
		g.drawLine(40,70,40,260);
		g.drawLine(41,70,41,260);
		g.drawLine(42,70,42,260);
		g.drawLine(43,70,43,260);
		//Line_right_side
		g.drawLine(88,70,88,260);
		g.drawLine(89,70,89,260);
		g.drawLine(90,70,90,260);
		g.drawLine(91,70,91,260);
		g.drawLine(92,70,92,260);
		g.drawLine(93,70,93,260);
		//Line across1
		g.fillRect(39,230,54,8);
		//line across2
		g.fillRect(39,130,20,8);
		g.fillRect(39,129,35,1);
		g.fillRect(70,130,20,8);
		}
	}
}
