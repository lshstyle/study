package com.example.game;

import java.awt.Color;
import java.awt.Graphics;

public class Shell  extends GameObject{

	double degree;
	
	public Shell() {
		this.x = 200;
		this.y = 200;
		this.width = 10;
		this.height = 10;
		this.speed = 3;
		degree = Math.random()*Math.PI*2;
				
	}
	
	public void draw(Graphics g) {
		Color c = g.getColor();
		g.setColor(Color.YELLOW);
		
		g.fillOval((int)x, (int)y, width, height);
		
		x += speed*Math.cos(degree);
		y += speed*Math.sin(degree);
		
		if (x<0 || Constant.GAME_WIDTH - width <x) {
			degree = Math.PI -degree;
		}
		
		if (y<0 || Constant.GAME_HEIGHT - height < y) {
			degree = - degree;
		}
		g.setColor(c);
	}
}
