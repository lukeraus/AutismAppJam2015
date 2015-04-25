package character;



import com.badlogic.gdx.math.Rectangle;

public class Player {
	
	public static final String COPYRIGHT = "Copyright 2014 Luke Raus, Jonathan Kumamoto";
	private int x;
	private int y;
	private short width;
	private short height;
	// ^^ABOVE is the character position and "hitbox"
	private short shoot_style; // that represents from 0 to how many types we want
	private Rectangle hitBox; // Create a hitbox so the intersector can mathematically recognize collision
	private int timer = 0; // This is for counting down and calling the shoot functions and restting
	private int shoot_speed = 25; // Lower is faster


	public Player(){
		// Create player here
		this.width = 48;
		this.height = 32;
		this.y = 144;
		this.x = 40;
		this.shoot_style = 2;
		hitBox = new Rectangle();
		
	}
	
	public void update(){
	}
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public short getWidth() {
		return width;
	}

	public short getHeight() {
		return height;
	}

	public short getShootStyle() {
		return shoot_style;
	}
	
	public void setShootStyle (short shoot_style) {
		this.shoot_style = shoot_style;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public void setShootSpeed(int shoot_speed) {
		this.shoot_speed = shoot_speed;
	}

}
