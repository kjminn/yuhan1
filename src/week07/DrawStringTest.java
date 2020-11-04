package week07;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawStringTest extends JFrame {
	
	public DrawStringTest() {
		setTitle("drawString()");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		MyCanvas canvas = new MyCanvas();
		add(canvas);
		setBounds(1000, 200, 400, 300);
		setVisible(true);
	}
	
	class MyCanvas extends JPanel{
		@Override
		public void paint(Graphics g) {
			super.paint(g);
			g.drawString("유한대학교", 100, 150);
		}
	}

	public static void main(String[] args) {
		new DrawStringTest();

	}

}
