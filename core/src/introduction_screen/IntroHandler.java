package introduction_screen;

import mainscreen.MainScreen;
import assets.Asset_Manager;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.audio.Music;

public class IntroHandler implements InputProcessor {
	private static Music theme_song = Asset_Manager.manager.get(Asset_Manager.theme_music, Music.class);
	private int choosemode = 0; //0 means play buttons on screen
													//1 means boy and girl on screen, removing play button
	private int gender = 0; // 1 = boy, 2 =girl
	private IntroRender renderer;
	public IntroHandler(IntroRender INTRO){
		renderer = INTRO;
		theme_song.play();
		theme_song.isLooping();
	}

	@Override
	public boolean keyDown(int keycode) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean keyUp(int keycode) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean keyTyped(char character) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		
		if(choosemode == 0){ //remove play button on render screeen
			if(screenY > Gdx.graphics.getHeight()*0.350833 && screenY <Gdx.graphics.getHeight()*0.67 && screenX >Gdx.graphics.getWidth()*0.34443 && screenX <Gdx.graphics.getWidth()*0.34443+ Gdx.graphics.getWidth()*0.3125){
				if(renderer.getMovedowny() == 0){//
					choosemode = 1;
					renderer.setChoosemode_ren(1);
				}
			}
		}else if(choosemode == 1){ //girl and boy should be displayed on screen already
			if(screenY > Gdx.graphics.getHeight()*0.68833333 && screenX >Gdx.graphics.getWidth()*0.34443 && screenX <Gdx.graphics.getWidth()*0.34443+ Gdx.graphics.getWidth()*0.3125){
					choosemode = 0;
					renderer.setChoosemode_ren(0);
			}else if(screenX < Gdx.graphics.getHeight()/2 ){ // boy
				choosemode = 2;
				renderer.setChoosemode_ren(2);
				renderer.setGender(1);
				gender= 1;
			}else if(screenX > Gdx.graphics.getHeight()/2 ){// girl
				choosemode = 2;
				renderer.setChoosemode_ren(2);
				renderer.setGender(2);
				gender = 2;
			}
		}else if(choosemode == 2){
			System.out.println(gender);
			if(screenY <0.6984*Gdx.graphics.getWidth()){
				if(screenX <= Gdx.graphics.getHeight()/2+50){// yes
					theme_song.stop();
					((Game)Gdx.app.getApplicationListener()).setScreen(new MainScreen(gender));
				}else{//no
					choosemode = 1;
					renderer.setChoosemode_ren(1);
				}
			}
			
		}
		renderer.Touch_Screen();
		return false;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean mouseMoved(int screenX, int screenY) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean scrolled(int amount) {
		// TODO Auto-generated method stub
		return false;
	}

}
