package mainscreen;

import inputhandler.GameTouchHandler;
import render.RenderScreen;
import world.GameWorld;
import assets.Asset_Manager;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.audio.Music;

public class MainScreen implements Screen {
	
	public static final String COPYRIGHT = "Copyright 2014 Luke Raus, Jonathan Kumamoto";
	private RenderScreen render;
	private GameWorld world;
	public static Music game_song1 = Asset_Manager.manager.get(Asset_Manager.game_music1, Music.class);
	
	
	public MainScreen(int gender){
		// make different objects and methods inside here.
		game_song1.play();
		game_song1.setLooping(true);
		world = new GameWorld();
		render = new RenderScreen(world, gender);
		Gdx.input.setInputProcessor(new GameTouchHandler(render, world));
	}

	@Override
	public void render(float delta) {
		// Update all the objects in the screen
		// And draw them
		world.update();
		render.render();

	}

	@Override
	public void resize(int width, int height) {
		// Don't have to worry because we use orthographiccamera

	}

	@Override
	public void show() {
		// Called once at beginning
	}

	@Override
	public void hide() {
		// When the screen is away (or paused or in background)
		// it gets called

	}

	@Override
	public void pause() {
		// Leave blank (it calls dispose automatically)

	}

	@Override
	public void resume() {
		// Leave (works with pause, don't use it)

	}

	@Override
	public void dispose() {
		// Get rid of obejects from ram
		
	}

}
