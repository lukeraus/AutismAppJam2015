package render;

import introductions.Introduction_1;
import objects.BulletPlayer;
import objects.Enemy;
import world.GameWorld;
import assets.Asset_Manager;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;


public class RenderScreen {
	
	public static final String COPYRIGHT = "Copyright 2014 Luke Raus, Jonathan Kumamoto";
	// This is so we don't have to worry about resizing
	private OrthographicCamera camera;
	private GameWorld world;
	private ShapeRenderer shape_maker;
	private SpriteBatch batch;
	private Introduction_1 scene_render;
	private int obstacle_move = 0; //helps move obstacle smoothly off screen;
	private int scene= 0; //this integer will control the beginning scenes before the game begins
	private int animate_y, animate_x, animate;
	private int obstacles_1_x;
	private int fade_controller, fade_counter, fade= 0;
	private int gender = 0; //1 = male, 2 == female
	private int jiggle_y, jiggle;
	private int rivermove_x;
	private int wallmove_x, wallmove_y, wallmove;
	private int friendmove_x, friendmove_y, friendmove=0, friend_x;
	public static Music water = Asset_Manager.manager.get(Asset_Manager.water_music1, Music.class);
	public static Music cheer = Asset_Manager.manager.get(Asset_Manager.cheer_music1, Music.class);
	

	private int phase = 0; //this controls the obstaclse AFTER scene is completed....
	
	private int thing1_x= 0, thing2_x = 960; //controls multiple bg's
	
	public RenderScreen(GameWorld g_world, int GENDER){
		// inside here we are going to make things to render and set up objects
		scene_render =  new Introduction_1(GENDER);
		gender = GENDER;
		System.out.println("GENDER!   "+ GENDER);
		world = g_world;
		
		camera = new OrthographicCamera(960, 640);
		camera.setToOrtho(true, 960, 640);
		
		shape_maker = new ShapeRenderer();
		shape_maker.setProjectionMatrix(camera.combined);
		
		batch = new SpriteBatch();
		batch.setProjectionMatrix(camera.combined);
		
	}
	public void render(){
		camera.update();
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		Gdx.gl.glClearColor(0, 0, 0, 0);
		jiggler();
		if(scene <7 ){//this controls the beginning render class
			scene_render.render(this, batch, scene);
			if(scene == 2){
				scene_render.setMove_car(0);
			}else if(scene == 3){
				scene_render.setMove_car2(0);
			}else if(scene == 4 ){
				scene_render.setMove_car(0);
			}
		}else if(scene == 7){
			scene = 8;
			phase = 1;
		} else{
			batch.begin();
			
			/////////backgrounds are below
			// moves background this handles it...
			batch.draw(Asset_Manager.Background_Plain, thing1_x,0, 960, 640);
			batch.draw(Asset_Manager.Background_Plain, thing2_x,0, 960, 640);
			
			
			batch.end();
			
			
			batch.begin();
			if(phase ==1){
				//////////////////////////////////////
				batch.draw(Asset_Manager.Object_Park2, 0+thing1_x,0, 360, 360);
				batch.draw(Asset_Manager.Object_Park5, 500+thing1_x,500, 360, 360);
				if(gender == 1){
					batch.draw(Asset_Manager.Boy, 80, 220+jiggle_y, 160, 280);///// this variable should never change all game
				}else{
					batch.draw(Asset_Manager.Girl, 80, 220+jiggle_y, 160, 280);///// this variable should never change all game
				}
				//////////////////////////////////////
					if(world.getTotal_moved() == 800){
				///////////////////////////////////////////////////////////sections of code controls the obstacle #1
						batch.draw(Asset_Manager.Dog_1, 360, 230, 120, 120);
						
						batch.draw(Asset_Manager.Gate_2, 520, 60,480, 480);
						world.setStarted(1);
						world.setObstacle_phase(1);
						world.render(batch);
						
						
						///below just handles the default bubble dont touch too much except choice 0
						if(world.getChoice() ==0){
							batch.draw(Asset_Manager.Bubble_Intro_6, 120,0, 720, 240);
						}else if(world.getChoice() == 2){
							batch.draw(Asset_Manager.Bubble_Intro_7, 120,0, 720, 240);
						}else{//right choice!
							world.setObstacle_phase(2);
							world.setFlood(1);
							phase = 2;
							world.setChoice(0);
							world.clear_items();
						}
						/////
						
				////////////////////////////////////////////////////////////////////////////////
					}else{
						control_bg_scroller();
						world.setTotal_moved(world.getTotal_moved()+1);
					}
					
				
			}else if(phase ==2){
				//////////////////////////////////////
				if(gender == 1){
					batch.draw(Asset_Manager.Boy, 80, 220, 160, 280);///// this variable should never change all game
				}else{
					batch.draw(Asset_Manager.Girl, 80, 220, 160, 280);///// this variable should never change all game
				}
				//////////////////////////////////////
				if(animate == 0){
					animate_y += -1;
					if(animate_y < -20){
						animate = 1;
					}
				}else{
					animate_y += 1;
					if(animate_y > 20){
						animate = 0;
					}
				}
				batch.draw(Asset_Manager.Dog_2, 360, 230+animate_y, 120, 120);
				
				batch.draw(Asset_Manager.Gate_2, 520, 60,480, 480);
				
				world.render(batch);
				
				
				
				
				///below just handles the default bubble dont touch too much except choice 0
				if(world.getChoice() ==0){
					batch.draw(Asset_Manager.Bubble_Intro_8, 120,0, 720, 240);
				}else if(world.getChoice() == 2){
					batch.draw(Asset_Manager.Bubble_Intro_7, 120,0, 720, 240);
				}else{//right choice!
					world.setObstacle_phase(3);
					world.setFlood(1);
					phase = 3;
					world.setChoice(0);
			}
			}else if(phase == 3){// end of phase 2
				
				batch.draw(Asset_Manager.Dog_2, 360+obstacles_1_x, 230+animate_y, 120, 120);
				
				batch.draw(Asset_Manager.Gate_1, 520+obstacles_1_x, 60,480, 480);
				if(world.getTotal_moved() == 1760){
					///////////////////////////////////////////////////////////sections of code controls the obstacle #1
							
							
							///below just handles the default bubble dont touch too much except choice 0
							if(world.getChoice() ==0){
								batch.draw(Asset_Manager.Bubble_Intro_6, 120,0, 720, 240);
							}else if(world.getChoice() == 2){
								batch.draw(Asset_Manager.Bubble_Intro_7, 120,0, 720, 240);
							}else{//right choice!
							}
							/////
							
					////////////////////////////////////////////////////////////////////////////////
						}else{
							obstacles_1_x += -1;
							control_bg_scroller();
							world.setTotal_moved(world.getTotal_moved()+1);
						}
					//////////////////////////////////////
				if(gender == 1){
					batch.draw(Asset_Manager.Boy, 80, 220, 160, 280);///// this variable should never change all game
				}else{
					batch.draw(Asset_Manager.Girl, 80, 220, 160, 280);///// this variable should never change all game
				}
					//////////////////////////////////////
					if(fade_control(batch)){
						
					}else{
						world.setObstacle_phase(4);
						world.setFlood(1);
						phase = 4;
						world.setChoice(0);
						world.clear_items();
					};
			}else if(phase == 4){///end of phase 3 start the object wall
				///below just handles the default bubble dont touch too much except choice 0
				
				batch.draw(Asset_Manager.Object_Wall, 520, 60,480, 480);
				batch.draw(Asset_Manager.Plant_1, 390, 140,480, 480);
				world.render(batch);
				if(world.getChoice() ==0){
					batch.draw(Asset_Manager.Bubble_Intro9, 120,0, 720, 240);
				}else if(world.getChoice() == 2){
					batch.draw(Asset_Manager.Bubble_Intro_7, 120,0, 720, 240);
				}else{//right choice!
					phase = 5;
					fade = 0;
					fade_controller = 0;
				}
				/////
			
				//////////////////////////////////////
				if(gender == 1){
					batch.draw(Asset_Manager.Boy, 80, 220, 160, 280);///// this variable should never change all game
				}else{
					batch.draw(Asset_Manager.Girl, 80, 220, 160, 280);///// this variable should never change all game
				}
				//////////////////////////////////////
			}else if(phase==5){
				batch.draw(Asset_Manager.Object_Wall, 520, 60,480, 480);
				batch.draw(Asset_Manager.Plant_2, 460, 30,480, 480);
				
				//////////////////////////////////////
				if(gender == 1){
					batch.draw(Asset_Manager.Boy, 80+wallmove_x, 220+wallmove_y, 160, 280);///// this variable should never change all game
				}else{
					batch.draw(Asset_Manager.Girl, 80+wallmove_x, 220+wallmove_y, 160, 280);///// this variable should never change all game
				}
				//////////////////////////////////////
				batch.draw(Asset_Manager.Bubble_Intro10, 120,0, 720, 240);
				if(wallmove == 2){
					if(fade_control(batch)){
						
					}else{
						world.setObstacle_phase(6);
						world.setFlood(1);
						phase = 6;
						world.setChoice(0);
						world.clear_items();
					};
					
				}else{
					if(wallmove == 0){
						wallmove_x += 2;
						if(wallmove_x > 500){
							wallmove =1;
						}
					}else{
						wallmove_y += -1;
						if(wallmove_y < - 100){
							wallmove = 2;
						}
					}
				}
				
			}else if(phase ==6){
				batch.draw(Asset_Manager.Background_PlainFLIPPED, 0,150, 960, 640);
				
				
				
				batch.draw(Asset_Manager.Object_Friend, 650, 190,240, 240);
				batch.draw(Asset_Manager.Object_Fallentree, 280, 170,360, 360);
				
				world.render(batch);
				if(world.getChoice() ==0){
					batch.draw(Asset_Manager.Bubble_Intro13, 120,0, 720, 240);
				}else if(world.getChoice() == 2){
					batch.draw(Asset_Manager.Bubble_Intro_7, 120,0, 720, 240);
				}else{//right choice!
					phase = 7;
					fade = 0;
					fade_controller = 0;
				}
				//////////////////////////////////////
				if(gender == 1){
					batch.draw(Asset_Manager.Boy, 80, 220, 160, 280);///// this variable should never change all game
				}else{
					batch.draw(Asset_Manager.Girl, 80, 220, 160, 280);///// this variable should never change all game
				}
				//////////////////////////////////////
			}else if(phase == 7){
				batch.draw(Asset_Manager.Background_PlainFLIPPED, 0,150, 960, 640);
				
				
				if(friendmove == 0){
					batch.draw(Asset_Manager.Object_Fallentree, 280, 170,360, 360);
					friendmove_x += -1;
					if(friendmove_x < -150){
						friendmove = 1;
					}
				}else if(friendmove==1){
					friendmove_y +=1;
					if(friendmove_y > 30){
						friendmove =2;
					}
				}else if(friendmove == 2){
					friendmove_y -= 1;
					if(friendmove_y< -30){
						friendmove = 3;
					}
				}
				batch.draw(Asset_Manager.Object_Friend, 650+friendmove_x, 190+friendmove_y,240, 240);
				
				
				
						//////////////////////////////////////
				if(gender == 1){
					batch.draw(Asset_Manager.Boy, 80+friend_x, 220, 160, 280);///// this variable should never change all game
				}else{
					batch.draw(Asset_Manager.Girl, 80+friend_x, 220, 160, 280);///// this variable should never change all game
				}
						//////////////////////////////////////
						if(friendmove== 3){
							if(fade_control(batch)){
								friend_x+=3;
							}else{
								world.setObstacle_phase(8);
								world.setFlood(1);
								phase = 8;
								world.setChoice(0);
								world.clear_items();
								water.play();
							};
						}
						
			}else if(phase == 8){// last obstacle
				batch.draw(Asset_Manager.Background_River, 0,0, 960, 640);
				batch.draw(Asset_Manager.Object_Bridge1, 380, 170,360, 360);
				batch.draw(Asset_Manager.Object_Lever, 630, 400,120, 120);
			//////////////////////////////////////
				if(gender == 1){
					batch.draw(Asset_Manager.Boy, 60, 140, 160, 280);///// this variable should never change all game
				}else{
					batch.draw(Asset_Manager.Girl, 60, 140, 160, 280);///// this variable should never change all game
				}
				//////////////////////////////////////
				world.render(batch);
				if(world.getChoice() ==0){
					batch.draw(Asset_Manager.Bubble_Intro15, 120,0, 720, 240);
				}else if(world.getChoice() == 2){
					batch.draw(Asset_Manager.Bubble_Intro_7, 120,0, 720, 240);
				}else{//right choice!
					phase = 9;
					fade = 0;
					fade_controller = 0;
				}
			}else if(phase==9){
				
				batch.draw(Asset_Manager.Background_River, 0,0, 960, 640);
				batch.draw(Asset_Manager.Bubble_Intro16, 120,0, 720, 240);
				batch.draw(Asset_Manager.Object_Bridge2, 380, 170,360, 360);
				batch.draw(Asset_Manager.LeverFLIPPED, 630, 400,120, 120);
					//////////////////////////////////////
				if(gender == 1){
					batch.draw(Asset_Manager.Boy, 60+rivermove_x, 140, 160, 280);///// this variable should never change all game
				}else{
					batch.draw(Asset_Manager.Girl, 60+rivermove_x, 140, 160, 280);///// this variable should never change all game
				}
					//////////////////////////////////////
				if(rivermove_x < 400){
					rivermove_x +=2;
				}else{
					if(fade_control(batch)){
						rivermove_x +=2;
					}else{
						world.setObstacle_phase(10);
						world.setFlood(1);
						phase = 10;
						world.setChoice(0);
						world.clear_items();
						water.stop();
					};
				}
			}else if(phase == 10){
				cheer.play();
				batch.draw(Asset_Manager.Background_Park, 0,0, 960, 640);
				batch.draw(Asset_Manager.Object_Park5, 450,-50, 360, 360);
				batch.draw(Asset_Manager.Bubble_Intro17, 120,0, 720, 240);
				batch.draw(Asset_Manager.Object_Friend, 650, 190-jiggle_y,240, 240);
				batch.draw(Asset_Manager.Object_Park4, 500,200, 120, 120);
				batch.draw(Asset_Manager.Object_Park2, 700,420, 360, 360);
				////////////////////////////////////// victory screen
				if(gender == 1){
				batch.draw(Asset_Manager.Boy, 360, 140, 160, 280);///// this variable should never change all game
				batch.draw(Asset_Manager.Girl, 60, 270+jiggle_y, 160, 280);///// this variable should never change all game
				}else{
				batch.draw(Asset_Manager.Girl, 360, 140, 160, 280);///// this variable should never change all game
				}
				//////////////////////////////////////
			}
			batch.end();
		}
	}
	
	
	public void jiggler(){
		if(jiggle == 0){
			jiggle_y += -1;
			if(jiggle_y < -30){
				jiggle = 1;
			}
		}else{
			jiggle_y += 1;
			if(jiggle_y > 30){
				jiggle = 0;
			}
		}
	}
	public void control_bg_scroller(){
		thing1_x += -1;
		thing2_x += -1;
		if(thing1_x < -960){
			thing1_x = 960;
		}
		if(thing2_x < -960){
			thing2_x = 960;
		}
	}

	public int getScene() {
		return scene;
	}

	public void setScene(int scene) {
		this.scene = scene;
	}
	
	public boolean fade_control(SpriteBatch batch){
		if(fade == 0){
		switch(fade_counter){
		case 0:
			fade_controller ++;
			fade_counter = 6;
			break;
		default:
			fade_counter += -1;
			break;
		}}else if (fade== 1){
			switch(fade_counter){
			case 0:
				fade_controller --;
				fade_counter = 6;
				break;
			default:
				fade_counter += -1;
				break;
		}
		}
		if(fade_controller >=15){
			fade = 1;
		}
		if (fade_controller == 13 && fade == 1){
			return false;
		}
			for(int i=1; i<fade_controller; i++){
				batch.draw(Asset_Manager.Background_Fade, 0,0, 960, 640);
			}/// once it hits 11 its good lol	
		return true;
	}

	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	
}
