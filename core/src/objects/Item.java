package objects;

import assets.Asset_Manager;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class Item {
	private int Identification, moving, slot,  Wrong_Right, Display_Info= 0; //Wrong_Right = 1 or 0, 1 meaing items is correct item & 0 = wrong item
	private int Xpos, Ypos;
	public int getXpos() {
		return Xpos;
	}

	public void setXpos(int xpos) {
		Xpos = xpos;
	}

	public int getYpos() {
		return Ypos;
	}

	public void setYpos(int ypos) {
		Ypos = ypos;
	}

	/*
	 * display info = 0 means false, if it's 1 display the information...
	 * identification = posiotion, 1 meaning its at 0,0, 2 meaning its at 192,192, etc...
	 */
	private String name;
	private TextureRegion image;

	public Item(int ID, int correct, String theName, TextureRegion image_INPUT, int SLOT){
		Identification = ID;
		Wrong_Right = correct;
		name = theName;
		slot = SLOT;
		image = image_INPUT;
		moving = 0;
		Xpos = -200;
		Ypos = -200;
	}
	
	public int getMoving() {
		return moving;
	}

	public void setMoving(int moving) {
		this.moving = moving;
	}

	public void render(SpriteBatch batcher){
			switch(slot){
			case 1:
				batcher.draw(image, 105,490, 150, 150);
				break;
			case 2:
				batcher.draw(image, 255,490, 150, 150);
				break;
			case 3:
				batcher.draw(image, 405,490, 150, 150);
				break;
			case 4:
				batcher.draw(image, 555,490, 150, 150);
				break;
			case 5:
				batcher.draw(image, 705,490, 150, 150);
				break;
			default:
				break;
			}
	}

	public TextureRegion getImage() {
		return image;
	}

	public void setImage(TextureRegion image) {
		this.image = image;
	}

	public int getIdentification() {
		return Identification;
	}

	public void setIdentification(int identification) {
		Identification = identification;
	}

	public int getWrong_Right() {
		return Wrong_Right;
	}

	public void setWrong_Right(int wrong_Right) {
		Wrong_Right = wrong_Right;
	}

	public int getDisplay_Info() {
		return Display_Info;
	}

	public void setDisplay_Info(int display_Info) {
		Display_Info = display_Info;
	}
	
	
	

}
