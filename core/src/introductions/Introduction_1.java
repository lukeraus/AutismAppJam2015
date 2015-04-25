package introductions;

import render.RenderScreen;
import assets.Asset_Manager;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Introduction_1 {
	//this package of "intoductions" is mainly to represent the beginning storyline of our game levels.
	/*
	 * so it's render will be fed a number, an int. This represents the scenes in this class
	 * so if the int is 1, in this specific case, the render will show the show background and car ready
	 * to head out to the park environment
	 * 
	 * 
	 * this scene will change each time the screen is tapped, until the intended scenes are finished
	 * then this class will not be used, and the game will start,
	 * this class's purpose is too render the beginning scenes and tell a story
	 */
	private int move_car = 0, move_car2= -240; // this is the scene_1 introduction to move the car, and increase amount to move car.
	private int gender;
	private int jiggle_y, jiggle = 0;
	public Introduction_1(int GENDER){
		//blank for now?
		gender = GENDER;
	}
	
	public void render(RenderScreen renderer, SpriteBatch batch, int scene_number){
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
		batch.begin();
		switch(scene_number){
		case 0:
			batch.draw(Asset_Manager.Scene1, 0,0, 960, 640);
			batch.draw(Asset_Manager.Family_1, 400,250, 240, 240);
			batch.draw(Asset_Manager.Boy, 650,300, 80, 140);
			batch.draw(Asset_Manager.Girl, 300,300, 80, 140);
			batch.draw(Asset_Manager.Car_1, 630,380, 240, 240);
			batch.draw(Asset_Manager.Bubble_Intro_1, 120,0, 720, 240);
			break;
		case 1:
			batch.draw(Asset_Manager.Scene1, 0,0, 960, 640);
			batch.draw(Asset_Manager.Car_1, 630+move_car,380, 240, 240);
			batch.draw(Asset_Manager.Bubble_Intro_1, 120,0, 720, 240);
			move_car += 1;
			if(move_car > 330){
				scene_number = 2;
				renderer.setScene(2);
			}
			break;
		case 2:
			move_car= 0;
			
			batch.draw(Asset_Manager.Background_Park, 0,0, 960, 640);
			batch.draw(Asset_Manager.Car_1, move_car2,380, 240, 240);
			batch.draw(Asset_Manager.Bubble_Intro_2, 120,0, 720, 240);
			if(move_car2 < 140){
				move_car2 += 1;
			}else{
				scene_number = 3;
				renderer.setScene(3);
			}
			break;
		case 3:
			
			batch.draw(Asset_Manager.Background_Park, 0,0, 960, 640);
			batch.draw(Asset_Manager.Object_Park5, 450,-50, 360, 360);
			batch.draw(Asset_Manager.Car_1, 140,380, 240, 240);
			System.out.println(jiggle_y);
			batch.draw(Asset_Manager.Family_1, 140+move_car,250, 240, 240);
			batch.draw(Asset_Manager.Boy, 300+move_car,350-jiggle_y, 80, 140);
			batch.draw(Asset_Manager.Girl, 140+move_car,350+jiggle_y, 80, 140);
			move_car += 1;
			if(move_car > 640){
				scene_number = 4;
				renderer.setScene(4);
			}
			break;
		case 4:
			batch.draw(Asset_Manager.Background_Park, 0,0, 960, 640);
			
			batch.draw(Asset_Manager.Family_1, 0+move_car2,250, 240, 240);
			batch.draw(Asset_Manager.Object_Park1, 300,420, 120, 120);
			batch.draw(Asset_Manager.Boy, 400+move_car,350-jiggle_y, 80, 140);
			batch.draw(Asset_Manager.Girl, 240+move_car,350+jiggle_y, 80, 140);
			batch.draw(Asset_Manager.Bubble_Intro_3, 120,0, 720, 240);
			move_car2 +=1;
			if(move_car2 > 640){
				scene_number = 5;
				renderer.setScene(5);
			}
			break;
		case 5:
			
			batch.draw(Asset_Manager.Background_Park, 0,0, 960, 640);
			batch.draw(Asset_Manager.Object_Park2, 700,420, 360, 360);
			batch.draw(Asset_Manager.Object_Park3, 50,520, 120, 120);
			batch.draw(Asset_Manager.Object_Park5, 450,-50, 360, 360);
			batch.draw(Asset_Manager.Family_1, 0+move_car,250, 240, 240);
			batch.draw(Asset_Manager.Bubble_Intro_4, 120,0, 720, 240);
			break;
		case 6:
			batch.draw(Asset_Manager.Background_Park, 0,0, 960, 640);
			batch.draw(Asset_Manager.Object_Park2, 700,420, 360, 360);
			batch.draw(Asset_Manager.Object_Park3, 50,520, 120, 120);
			batch.draw(Asset_Manager.Object_Park5, 450,-50, 360, 360);
			batch.draw(Asset_Manager.Family_1, 0,250, 240, 240);
			batch.draw(Asset_Manager.Bubble_Intro_5, 120,0, 720, 240);
			if(gender ==1){
				batch.draw(Asset_Manager.Boy, 50+move_car, 270-jiggle_y, 80, 140);
			}else{
				batch.draw(Asset_Manager.Girl, 50+move_car, 270-jiggle_y, 80, 140);
			}
			
			move_car += 1;
			break;
		default:
			break;
		}
		batch.end();
	}

	public int getMove_car2() {
		return move_car2;
	}

	public void setMove_car2(int move_car2) {
		this.move_car2 = move_car2;
	}

	public int getMove_car() {
		return move_car;
	}

	public void setMove_car(int move_car) {
		this.move_car = move_car;
	}
}

