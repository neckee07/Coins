package gui.coins;

import java.awt.Color;
import java.awt.Graphics;

public class Coin extends Figure {

	public Coin(int x, int y, int width) {
		super(x, y, width);
	}
	int nizx[] = new int[5];
	int nizy[] = new int[5];

	@Override
	public void paint(Graphics g) {
		
		Color prevColor = g.getColor();
		g.setColor(Color.YELLOW);
		double ugao2 = 2*Math.PI/5;
		double ugao3 = Math.random()*2*Math.PI;
		for(int i = 0; i<5 ;i++) {
			nizx[i] = x + (int) (width * Math.cos(i*ugao2 + ugao3));
			nizy[i] = y +(int) (width * Math.sin(i*ugao2 + ugao3));
		}
		
		g.fillPolygon(nizx, nizy, 5);
		
		g.setColor(prevColor);
	}

}

