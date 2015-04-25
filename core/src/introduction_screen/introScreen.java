package introduction_screen;

import inputhandler.GameTouchHandler;
import render.RenderScreen;
import world.GameWorld;
import assets.Asset_Manager;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.audio.Music;

public class introScreen implements Screen {
	private IntroRender render;
	
	
	public introScreen(){
		// make different objects and methods inside here.
		render = new IntroRender();
		Gdx.input.setInputProcessor(new IntroHandler(render));
		
	}
	@Override
	public void show() {
		
	}

	@Override
	public void render(float delta) {
		render.render();
		
	}

	@Override
	public void resize(int width, int height) {
		
	}

	@Override
	public void pause() {
		
	}

	@Override
	public void resume() {
		
	}

	@Override
	public void hide() {
		
	}

	@Override
	public void dispose() {
		
	}

}
