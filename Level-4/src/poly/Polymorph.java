package poly;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Polymorph {
    int x;
	int y;
    private int width;
    private int height;
    
    public Polymorph(int x, int y){
   	 this.x = x;
   	 this.y = y;
   	 width = 10;
   	 height = 10;
    }
    
    public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
    
    public void setWidth(int width) {
    	this.width = width;
    }
    
    public void setHeight(int height) {
    	this.height = height;
    }
    
    public int getHeight() {
    	return height;
    }
    
    public int getWidth() {
    	return width;
    }
    
    public void update(){
   	
    }
    
    public void draw(Graphics g){
   	 g.setColor(Color.BLUE);
   	 g.fillRect(x, y, width, height);
    }
}

class RedMorph extends Polymorph {

	public RedMorph(int x, int y) {
		super(x, y);
		int width = 10;
		int height = 10;
	}
	
	public void draw(Graphics g){
	   	 g.setColor(Color.RED);
	   	 g.fillRect(x, y, getWidth(), getHeight());
	    }
}

class MovingMorph extends Polymorph {
	
	public MovingMorph(int x, int y) {
		super(x, y);
	}
	
	@Override
	public void update(){
	   	super.setX(new Random().nextInt(PolymorphWindow.HEIGHT));
	   	super.setY(new Random().nextInt(PolymorphWindow.WIDTH));
    }
	
	//public void draw(Graphics g){
	   //g.setColor(Color.BLUE);
	   //(x, y, getWidth(), getHeight());
	// }
}

class CircleMorph extends Polymorph {

	public CircleMorph(int x, int y) {
		super(x, y);
		
	}
	
	@Override
	public void update(){
	   	super.setX(new Random().nextInt(PolymorphWindow.HEIGHT));
	   	super.setY(new Random().nextInt(PolymorphWindow.WIDTH));
    }
	
}

class MouseMorph extends Polymorph {

	public MouseMorph(int x, int y) {
		super(x, y);
	}
	
}

class ImageMorph extends Polymorph {

	public ImageMorph(int x, int y) {
		super(x, y);
		
	}
	
}

class ClickMorph extends Polymorph {

	public ClickMorph(int x, int y) {
		super(x, y);
		
	}
	
}