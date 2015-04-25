package introduction_screen;

import assets.Asset_Manager;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class IntroRender {
	
	private OrthographicCamera camera;
	private ShapeRenderer shapeMaker;  //this is to create shapes 
	private SpriteBatch batch;   
	private int choosemode_ren = 0;
	private int gender = 0;// 1 = boy, /2= girl
	
	
	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public int getChoosemode_ren() {
		return choosemode_ren;
	}

	public void setChoosemode_ren(int choosemode_ren) {
		this.choosemode_ren = choosemode_ren;
	}

	private int movedowny = -370, countdown_sun = -460;
	private int thing1_x= 0, thing2_x = 960; //there needs to be a distance of 1230... so that that infiity can happen
	private float sun_x, sun_y, sun;
	private int character_x;
	private int Gender;
	
	
	public IntroRender(){
		camera = new OrthographicCamera(960, 640);
		camera.setToOrtho(true, 960, 640);
		batch = new SpriteBatch();
		batch.setProjectionMatrix(camera.combined);
		shapeMaker = new ShapeRenderer();
		shapeMaker.setProjectionMatrix(camera.combined);
	}
	
	public void render(){
		camera.update();
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		Gdx.gl.glClearColor(0, 0, 0, 0);
		batch.begin();
		batch.draw(Asset_Manager.Background_Park, thing1_x,0, 960, 640);
		batch.draw(Asset_Manager.Background_Park, thing2_x,0, 960, 640);
		
		batch.end();
		thing1_x += -1;
		thing2_x += -1;
		if(thing1_x <= -960){
			thing1_x = 960;
		}
		if(thing2_x <= -960){
			thing2_x = 960;
		}
		if(movedowny < 0){
			movedowny += 1;
		}
		if(countdown_sun < 1){
			countdown_sun += 1;
		}
		if(countdown_sun > -200 && countdown_sun < -50){
			character_x +=2;
		}
		if(sun == 0){
			sun_x +=1;
			sun_y += 0.5;
			if(sun_x > 15){
				sun = 1;
			}
		}else{
			sun_x -= 1;
			sun_y -= 0.5;
			if(sun_x < -15){
				sun = 0;
			}
		}
		batch.begin();
		if(choosemode_ren == 0){
			batch.draw(Asset_Manager.Background_Title, 0,0+movedowny, 960, 640);
			batch.draw(Asset_Manager.Introduction_Button1, 368, 208+movedowny, 225, 255 );
			batch.draw(Asset_Manager.Boy, 960-character_x, 320, 160, 280);
			batch.draw(Asset_Manager.Girl, -160+character_x, 320, 160, 280);
			if(countdown_sun >0){
				batch.draw(Asset_Manager.Sun_1, 0+sun_x, 0+sun_y, 120, 120 );	
			}
			
		}else if(choosemode_ren == 1){
			batch.draw(Asset_Manager.Boy, 160, 200, 160, 280);
			batch.draw(Asset_Manager.Girl, 700, 200, 160, 280);
			batch.draw(Asset_Manager.Bubble_Intro, 0,0, 960, 240);
			batch.draw(Asset_Manager.Back_Button, 368, 415, 225, 255 );	
		}else if(choosemode_ren ==2){
			if(gender == 1){
				batch.draw(Asset_Manager.Boy, 160, 200, 160, 280);
			}else{
				batch.draw(Asset_Manager.Girl, 700, 200, 160, 280);
			}
			batch.draw(Asset_Manager.Button_Yes, 200, 415, 225, 255 );	
			batch.draw(Asset_Manager.Button_No, 500, 415, 225, 255 );	
		}
		batch.end();
	}
	public void Touch_Screen(){ //this function is used to skip introduction if screen is touched
		movedowny = 0;
	}

	public int getMovedowny() {
		return movedowny;
	}

	public void setMovedowny(int movedowny) {
		this.movedowny = movedowny;
	}

}
