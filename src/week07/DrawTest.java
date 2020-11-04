package week07;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawTest extends JFrame {
	
	public DrawTest() {
		setTitle("그래픽 기본 클래스");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		MyCanvas canvas = new MyCanvas();
		add(canvas, "Center");
		setBounds(1000, 200, 500, 400);
		setVisible(true);
	}
	
//	도화지 역할의 클래스
	class MyCanvas extends JPanel{
		@Override
		public void paint(Graphics g) {
			super.paint(g);
			g.drawOval(50, 50, 400, 300);
		}
	}

	public static void main(String[] args) {
		new DrawTest();

	}

}
