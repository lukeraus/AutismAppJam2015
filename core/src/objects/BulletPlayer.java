package objects;

import com.badlogic.gdx.math.Rectangle;

public class BulletPlayer {

	public static final String COPYRIGHT = "Copyright 2014 Luke Raus, Jonathan Kumamoto";
	private int height;
	private int width;
	private float x;
	private float y;
	private Rectangle hitBox; // Create a hitbox so the intersector can mathematically recognize collision
	private int type;
	
	public BulletPlayer(int x, int y, int type){
		this.x = x;
		this.y = y;
		this.width = 5;
		this.height = 5;
		hitBox = new Rectangle();
		this.type = type;
	}
	
	public void update(){
		switch(type){
			case 0:
				x += 2.5f;
				break;
			case 1:
				x += 2.5f;
				y -= 0.5f;
				break;
			case 2:
				x += 2.5f;
				y += 0.5f;
				break;
			default:
				break;
		}
		hitBox.set(x, y, width, height);
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
