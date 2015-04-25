package inputhandler;

import render.RenderScreen;
import world.GameWorld;
import character.Player;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;

public class GameTouchHandler implements InputProcessor {
	
	public static final String COPYRIGHT = "Copyright 2014 Luke Raus, Jonathan Kumamoto";
	private RenderScreen render_screen;
	private GameWorld world;
	private int GameHeight, GameWidth;
	private double width_beg;
	
	public GameTouchHandler (RenderScreen screen, GameWorld WORLD){
		//Create anything important here
		this.render_screen = screen;
		this.world = WORLD;
		GameHeight = Gdx.graphics.getHeight();
		GameWidth = Gdx.graphics.getWidth();
		width_beg = 0.109375*GameWidth;
	}

	@Override
	public boolean keyDown(int keycode) {
		// when a key is pressed DOWN literally
		return false;
	}

	@Override
	public boolean keyUp(int keycode) {
		// For a game we don't want to use this at all because we don't like keys
		return false;
	}

	@Override
	public boolean keyTyped(char character) {
		// This refers to keyboard, which phones do not use...
		return false;
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		// Same as keyDown except just touching a phone screen or clicking with a mouse
		if(render_screen.getScene() < 7){
			render_screen.setScene(render_screen.getScene()+1);
		}else{ // actual game and allows pull-up of items
			if(world.getObstacle_phase() == 0){
				world.setTotal_moved(800);
			}
			if(screenY > 0.7656*Gdx.graphics.getHeight()){
				if(screenX > width_beg && screenX < width_beg+GameWidth*0.15625){
					world.click_down(1);
				}//box 1
				if(screenX > width_beg+GameWidth*0.15625 && screenX < width_beg+(GameWidth*0.15625)*2){
					world.click_down(2);
				}
				if(screenX > width_beg+(GameWidth*0.15625)*2 && screenX < width_beg+(GameWidth*0.15625)*3){
					world.click_down(3);
				}
				if(screenX >width_beg+(GameWidth*0.15625)*3 && screenX < width_beg+(GameWidth*0.15625)*4){
					world.click_down(4);
				}
				if(screenX > width_beg+(GameWidth*0.15625)*4){
					world.click_down(5);
					System.out.println("5 has been touched");
				}
			}
		}
		return true;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		world.click_up(screenX, screenY);
		return false;
	}

	@SuppressWarnings("static-access")
	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {
		if(render_screen.getScene() >= 7){
			world.dragged(screenX, screenY);		
		}
		return true;
	}

	@Override
	public boolean mouseMoved(int screenX, int screenY) {
		return false;
	}

	@Override
	public boolean scrolled(int amount) {
		return false;
	}

}
