package week07;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawLineTest extends JFrame {
	
	public DrawLineTest() {
		setTitle("drawLine()");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		MyCanvas canvas = new MyCanvas();
		add(canvas);
		setBounds(1000, 200, 500, 500);
		setVisible(true);
	}
	
	class MyCanvas extends JPanel{
		@Override
		public void paint(Graphics g) {
			super.paint(g);
			g.setColor(Color.RED);
			g.drawLine(50, 200, 400, 200);
			g.setColor(new Color(255, 0, 255));
			g.drawLine(250, 50, 250, 400);
		}
	}

	public static void main(String[] args) {
		new DrawLineTest();

	}

}
