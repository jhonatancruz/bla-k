import java.awt.*;
import java.util.Scanner;
import java.applet.*;

public class polygons extends Applet {
	//adding this message so that I can learn how to push
	int[] squarex = { 50, 50, 150, 150 };
	int[] squarey = { 150, 50, 50, 150 };
	int[] trix = { 65, 115, 165 };
	int[] triy = { 150, 100, 150 };
	int[] squarehx = { 25, 25, 150, 150 };
	int[] squarehy = { 200, 100, 100, 200 };
	int[] trihx = { 25, 88, 150 };
	int[] trihy = { 100, 50, 100 };


	public void init() {

	}

	public void paint(Graphics g) {
		Scanner input = new Scanner(System.in);
		String userinput = input.nextLine();

		if (userinput.equals("house")) {
			g.drawPolygon(squarehx, squarehy, 4);
			g.drawPolygon(trihx, trihy, 3);
		} else if (userinput.equals("triangle")) {
			g.fillPolygon(trix, triy, 3);
		} else if (userinput.equals("square")) {
			g.fillPolygon(squarex, squarey, 4);
		}else if(userinput.equals("circle")){
            g.drawOval(50,50,100,100);
		} else {
			System.out.println("no input");
		}

	}

}



