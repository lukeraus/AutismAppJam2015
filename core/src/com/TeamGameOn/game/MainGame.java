package com.TeamGameOn.game;

import introduction_screen.introScreen;
import mainscreen.MainScreen;
import assets.Asset_Manager;

import com.badlogic.gdx.Game;

public class MainGame extends Game {
	
	// 4-14-2015 7:35pm @author Luke Raus
	// I Just copied all the classes we made before exactly so when run the game is shoot em up
	// Feel free to go ahead and rename things as you see fit
	
	public static final String COPYRIGHT = "Copyright 2015 Luke Raus, Jonathan Kumamoto";
//	SpriteBatch batch;
//	Texture img;
	
	@Override
	public void create () {
		// Load the main Screen
		Asset_Manager.load();
		while (!Asset_Manager.manager.update()){
			// Getting ready
		}
		Asset_Manager.create();
		setScreen( new introScreen() );
//		batch = new SpriteBatch();
//		img = new Texture("badlogic.jpg");
	}

//	@Override
//	public void render () {
//		Gdx.gl.glClearColor(1, 0, 0, 1);
//		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
//		batch.begin();
//		batch.draw(img, 0, 0);
//		batch.end();
//	}
}
