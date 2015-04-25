package objects;

import com.badlogic.gdx.math.Rectangle;

public class Enemy {
	
	public static final String COPYRIGHT = "Copyright 2014 Luke Raus, Jonathan Kumamoto";
	protected float x;
	protected float y;
	protected int height;
	protected int width;
	protected int type;
	protected Rectangle hitBox; // Create a hitbox so the intersector can mathematically recognize collision

	public Enemy(int X, int Y, int type){
		this.type = type;
		this.x = X;
		this.y = Y;
		hitBox = new Rectangle();
		switch(type){
		case 0:
			this.width = 15;
			this.height = 15;
			break;
		default:
			break;
		}
	}
	
	public void update(){
		switch(type){
		case 0:
			this.x -= 0.1f;
			break;
		default:
			break;
		}
		hitBox.set(x, y, width, height);
	}
	
	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public float getX() {
		return x;
	}

	public float getY() {
		return y;
	}

	public int getHeight() {
		return height;
	}

	public int getWidth() {
		return width;
	}
	
	public Rectangle getHitBox() {
		return hitBox;
	}
}
