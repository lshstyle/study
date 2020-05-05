package com.example;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class BallGame extends JFrame {

	long b = 3000000000000l;
	int b1 =2;
	float c= b+ b1;
	
	Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png");
	Image desk = Toolkit.getDefaultToolkit().getImage("images/desk.jpg");
	int x = 100;
	int y = 100;
	int xFlag = 1;
	int yFlag = 1;
	boolean right = true;

	public void paint(Graphics g) {
		g.drawImage(desk, 0, 0, null);
		g.drawImage(ball, x, y, null);

		x = x + xFlag * 10;
		y = y + yFlag * 10;

		if (y > 500 - 40 - 30 || y < 40 + 40) {
			yFlag = -yFlag;
		}
		if (x > 856 - 40 - 30 || x < 40) {
			xFlag = -xFlag;
		}
		
	}

	public void launchFrame() {
		setSize(856, 500);
		setLocation(50, 50);
		setVisible(true);
		while (true) {
			repaint();
			try {
				Thread.sleep(40);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		BallGame ballGame = new BallGame();
		ballGame.launchFrame();
	}
}
