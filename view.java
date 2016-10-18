import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class view extends Applet implements ActionListener{
	int squareSize =50;
	private Button enter=new Button("Enter");
	private Button twod=new Button("2D");
	private Button threed=new Button("3D");

	public void start(){
		
	}
	public void init() {
		setName("3D View");
		setBackground(Color.pink);
		System.out.println("start");
		Panel panelBody= new Panel();
		panelBody.setLayout(new GridLayout(3,1));
		
		
		panelBody.add(twod);
		twod.addActionListener(this);
		panelBody.add(threed);
		threed.addActionListener(this);
		panelBody.add(enter);
		enter.addActionListener(this);
		
		
		add("Center",panelBody);
		setSize(500,500);
		
	}

	public void paint(Graphics g) {
		g.drawString("BLK project!!!", 230,200);
	}
	
	public void stop(){
		System.out.println("stop");
	}
	
	public void destory(){
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}

