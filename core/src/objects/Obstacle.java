package objects;

import com.badlogic.gdx.math.Rectangle;

public class Obstacle {
	private String name;
	private int Display_Info= 0;
	protected Rectangle box;
	public Obstacle(String NAME){
		name = NAME;
		box = new Rectangle();
	}
	
	public void setbox(float posx, float posy, float width, float height){
		box.set(posx, posy, width, height);
		System.out.println("done");
	}
	
	
	public Rectangle getBox() {
		return box;
	}

	public int getDisplay_Info() {
		return Display_Info;
	}
	public void setDisplay_Info(int display_Info) {
		Display_Info = display_Info;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
