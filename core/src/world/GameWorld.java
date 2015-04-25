package world;



import objects.Item;
import objects.Obstacle;
import assets.Asset_Manager;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Intersector;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.utils.Array;

import character.Player;

public class GameWorld {
	
	public static final String COPYRIGHT = "Copyright 2014 Luke Raus, Jonathan Kumamoto";
	private Player main_character;
	private int started = 0; // 0 = means game didn't start, do not update anything....
	private int total_moved= 0; //how far the game has progresses, controls bg flow
	private Array<Item> items = new Array<Item>();
	private Obstacle current_obstacle;
	private int choice = 0; //0 = neutral beg, 1 = good, 2 = bad;
	private int gameHeight, gameWidth;
	private int pulsx, pulsy, pulse= 0;

	private int touch_drag_ready = 0; // 0= false, 1 = true;
	private int touch_drag_number = 0; // 0 = false item so when user lets go, its no good, 1 = correct & move on
	private int obstacle_phase; // obstacle = phase of obstacles...
	//so if obstacle = #1 then it is at the gate, and those obstacles/items need to be loaded
	//if obstacle #2 = then it is a rt bridge and load appropriate items...
	private Rectangle temp_box;
	
	public int getObstacle_phase() {
		return obstacle_phase;
	}

	public void setObstacle_phase(int obstacle_phase) {
		this.obstacle_phase = obstacle_phase;
	}

	private int flood= 1;
	
	public GameWorld(){
		// Make stuff here
		temp_box = new Rectangle();
		current_obstacle = new Obstacle("Gate");
		gameHeight = Gdx.graphics.getHeight();
		gameWidth = Gdx.graphics.getWidth();
		
	}
	
	public int getFlood() {
		return flood;
	}


	public void setFlood(int flood) {
		this.flood = flood;
	}
	
	
	public void render(SpriteBatch batcher){
		batcher.draw(Asset_Manager.ItemBOX, 105,490, 150, 150);
		batcher.draw(Asset_Manager.ItemBOX, 255,490, 150, 150);
		batcher.draw(Asset_Manager.ItemBOX, 405,490, 150, 150);
		batcher.draw(Asset_Manager.ItemBOX, 555,490, 150, 150);
		batcher.draw(Asset_Manager.ItemBOX, 705,490, 150, 150);
		for(Item I: items){ // renders all items in their current position
			I.render(batcher);
			if(I.getMoving()==1){
				batcher.draw(I.getImage(), (I.getXpos()-75-pulsx/2)*960/Gdx.graphics.getWidth(), (I.getYpos()-75-pulsy/2)*640/Gdx.graphics.getHeight(), 150+pulsx, 150+pulsy);

			}
		}
	}	
	public void update(){
		///this controls pulsating for all time ;) #bad code I guess....
		if(pulse==0){
			pulsx += -1;
			pulsy += -1;
			if(pulsx < -30){
				pulse = 1;
			}
		}else{
			pulsx += 1;
			pulsy += 1;
			if(pulsx > 30){
				pulse = 0;
			}
		}
		////
		
		
		// update objects here
		if(started == 1){// means game has actually started
			switch(obstacle_phase){
			case 1:
				if(flood== 1){
					items.add(new Item(1, 1, "ball", Asset_Manager.Item_Ball, 1));
					items.add(new Item(2, 0, "Rope", Asset_Manager.Item_Rope, 2));
					items.add(new Item(3, 1, "Stick", Asset_Manager.Item_Stick, 3));
					items.add(new Item(4, 1, "WaterBottle", Asset_Manager.Item_WaterBottle, 4)); // this one will work
					current_obstacle.setbox(360*gameWidth/960, 230*gameHeight/640, 120*gameWidth/960, 120*gameHeight/640);
					flood = 0;
				}
				break;
			case 2:
				if(flood ==1){
					items.add(new Item(1, 0, "ball", Asset_Manager.Item_Ball, 1));
					items.add(new Item(2, 0, "Rope", Asset_Manager.Item_Rope, 2));
					items.add(new Item(3, 0, "Stick", Asset_Manager.Item_Stick, 3)); 
					items.add(new Item(4, 0, "WaterBottle", Asset_Manager.Item_WaterBottle, 4));
					items.add(new Item(5, 1, "Key", Asset_Manager.Item_Key, 5));
					current_obstacle.setbox(570*gameWidth/960, 160*gameHeight/640, 300*gameWidth/960, 300*gameHeight/640);
					flood = 0;
				}
				break;
			case 3:
				break;
			case 4:
				if(flood==1){
					items.add(new Item(1, 0, "ball", Asset_Manager.Item_Ball, 1));
					items.add(new Item(2, 1, "Rope", Asset_Manager.Item_Rope, 2));
					items.add(new Item(3, 0, "Stick", Asset_Manager.Item_Stick, 3)); 
					items.add(new Item(4, 1, "WaterBottle", Asset_Manager.Item_WaterBottle, 4));
					current_obstacle.setbox(390*gameWidth/960, 190*gameHeight/640, 300*gameWidth/960, 300*gameHeight/640);
					flood = 0;
				}
				break;
			case 5:
				break;
			case 6:
				if(flood==1){
					items.add(new Item(1, 1, "ball", Asset_Manager.Item_Ball, 1));
					items.add(new Item(3, 0, "Rope", Asset_Manager.Item_Rope, 3));
					items.add(new Item(2, 0, "Stick", Asset_Manager.Item_Stick, 2)); 
					items.add(new Item(4, 1, "Glove", Asset_Manager.Item_Glove, 4));
					current_obstacle.setbox(650*gameWidth/960, 190*gameHeight/640, 240*gameWidth/960, 240*gameHeight/640);
					flood = 0;
				}
				break;
			case 8:
				if(flood==1){
					items.add(new Item(4, 1, "ball", Asset_Manager.Item_Ball, 4));
					items.add(new Item(3, 1, "Rope", Asset_Manager.Item_Rope, 3));
					items.add(new Item(2, 0, "Stick", Asset_Manager.Item_Stick, 2)); 
					current_obstacle.setbox(600*gameWidth/960, 350*gameHeight/640, 120*gameWidth/960, 120*gameHeight/640);
					flood = 0;
				}
			default:
				break;
			}
		}
	}
	public void clear_items(){
		items.clear();
	}
	public void click_down(int number){
		for(Item I: items){
			if(I.getIdentification() == number){
				I.setMoving(1);
				touch_drag_ready = 1;//this means that this item slot is not BLANK
				touch_drag_number = I.getWrong_Right();
			}
		}
	}
		//draw item thats being dragged if indeed an item is being dragged...
	public void dragged(int xpos, int ypos){
		for(Item I: items){
			if(I.getMoving() == 1){
				I.setXpos(xpos);
				I.setYpos(ypos);
			}
		}
	}
	
	public void click_up(int x_coor, int y_coor){
		if(touch_drag_ready == 1){
			temp_box.set(x_coor, y_coor, 50, 50);
			if(Intersector.overlaps(temp_box, current_obstacle.getBox())){
				if(touch_drag_number == 1){
					choice = 1;
				}else{
					choice = 2;
				}
			}
			////below resets all variable for moving items...
			for(Item I: items){
				I.setMoving(0);
			}
		}
		touch_drag_number = 0;
		touch_drag_ready = 0;
	}
	
	
	public int getChoice() {
		return choice;
	}

	public void setChoice(int choice) {
		this.choice = choice;
	}

	
	
	public int getTotal_moved() {
		return total_moved;
	}

	public void setTotal_moved(int total_moved) {
		this.total_moved = total_moved;
	}

	
	
	public int getStarted() {
		return started;
	}

	public void setStarted(int started) {
		this.started = started;
	}

	public Player getPlayer(){
		return main_character;
	}
	
	
	public void playerDragUp(){
		
	}
	
	public void playerDragDown(){
			
	}

}
