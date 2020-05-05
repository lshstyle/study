package com.example.game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Date;

public class MyGameFrame extends Frame{

	
	Image planeImage = GameUtil.getImage("images/plane.png");
	Image bgImage = GameUtil.getImage("images/bg.jpg");
	
	Plane plane = new Plane(planeImage, 250, 250);
	Shell[] shells = new Shell[50];
	
	Explode crash;
	Date startTime = new Date();
	Date endTime ;
	int period;
	
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		Color   c =  g.getColor();
		g.drawImage(bgImage, 0, 0, null);
		plane.drawSelf(g);
		
		for (int i=0; i<shells.length; i++) {
			shells[i].draw(g);
			
			boolean isCrash = shells[i].getRect().intersects(plane.getRect());
			
			if (isCrash) {
				plane.live = false;
				if (crash == null) {
					crash = new Explode(plane.x, plane.y);
					endTime = new Date();
					period = (int)(endTime.getTime() - startTime.getTime())/1000;
				}
				crash.draw(g);
				
			}
			
			if (!plane.live) {
				g.setColor(Color.RED);
				Font font = new Font("宋体", Font.BOLD, 50);
				g.setFont(font);
				g.drawString("用时 " + period + "s", 250, 250);
			}
		}
		g.setColor(c);
	}
	
	public void launchFrame() {
		this.setTitle("游戏");
		this.setVisible(true);
		this.setSize(500, 500);
		this.setLocation(300, 300);
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		new PaintThread().start();
		
		addKeyListener(new KeyMonitor());
		
		for (int i=0; i<shells.length; i++) {
			shells[i] = new Shell();
		}
	}
	
	public static void main(String[] args) {
		MyGameFrame myGameFrame = new MyGameFrame();
		myGameFrame.launchFrame(); 
		
	}
	
	class PaintThread extends Thread {
		@Override
		public void run() {
			// TODO Auto-generated method stub
			while(true) {
				repaint();
				try {
					Thread.sleep(40);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	class KeyMonitor extends KeyAdapter {
		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			super.keyPressed(e);
			plane.addDirection(e);
			
		}
		
		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			super.keyReleased(e);
			plane.minusDirection(e);
		}
	}
	
	private Image offScreenImage = null;
	 
	public void update(Graphics g) {
	    if(offScreenImage == null)
	        offScreenImage = this.createImage(Constant.GAME_WIDTH,Constant.GAME_HEIGHT);//ÕâÊÇÓÎÏ·´°¿ÚµÄ¿í¶ÈºÍ¸ß¶È
	     
	    Graphics gOff = offScreenImage.getGraphics();
	    paint(gOff);
	    g.drawImage(offScreenImage, 0, 0, null);
	}
}
