package assets;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class Asset_Manager {
	
	public static final String COPYRIGHT = "Copyright 2014 Luke Raus, Jonathan Kumamoto";
	public static final AssetManager manager = new AssetManager();
	public static final String button_intro1 = "buttons/PlayButton.png";
	public static final String button_back = "buttons/BackButton.png";
	public static final String button_yes = "buttons/YesButton.png";
	public static final String button_no = "buttons/NoButton.png";
	/////////////////////////////////////////////////////////////////////////below are park backgrounds
	public static final String background_river = "background/RiverBG.png";
	public static final String background_title = "background/Title.png";
	public static final String background_fade = "background/Fade.png";
	public static final String background_park = "background/ParkBG.png";
	public static final String background_plain = "background/PlainBG.png";
	public static final String background_scene1 = "background/Intro_scene1.png";
	public static final String background_scene2 = "background/Intro_scene2.png";
	public static final String background_scene3 = "background/Intro_scene3.png";
	///////////////////////////////////////////////////////////////////////Below are objects (such as cars, ppl etc.)
	
	public static final String object_car = "objects/Car.png";
	public static final String object_family = "objects/Family.png";
	public static final String object_gate1 = "objects/Gate_after.png";
	public static final String object_gate2 = "objects/Gate_before.png";
	public static final String object_sun = "objects/Sun.png";
	public static final String object_dog1 = "objects/Dog_1.png";
	public static final String object_dog2 = "objects/Dog_2.png";
	
	public static final String object_plant1 = "objects/Plant_1.png";
	public static final String object_plant2 = "objects/Plant_2.png";
	public static final String object_wall = "objects/Wall.png";
	public static final String object_friend = "objects/Friend.png";
	public static final String object_fallentree = "objects/Fallen_Tree.png";
	public static final String object_lever = "objects/Lever.png";
	public static final String object_bridge1 = "objects/Bridge1.png";
	public static final String object_bridge2 = "objects/Bridge2.png";
	public static final String object_park3 = "objects/Park3.png";
	public static final String object_park5 = "objects/Park5.png";
	public static final String object_park1 = "objects/Park1.png";
	public static final String object_park2 = "objects/Park2.png";
	public static final String object_park4 = "objects/Park4.png";
	
	//////////////////////////////////////////////////////////////////////////////////////below are items
	public static final String itembox = "items/ItemBox.png";
	public static final String item_ball = "items/Ball.png";
	public static final String item_rope = "items/Rope.png";
	public static final String item_stick = "items/Stick.png";
	public static final String item_waterbottle = "items/WaterBottle.png";
	public static final String item_key = "items/Key.png";
	public static final String item_glove = "items/Glove.png";
	
	//////////////////////////////items/
	public static final String theme_music = "music/8bitIntro.mp3";
	public static final String game_music1 = "music/Game_Song1.mp3";
	public static final String water_music1 = "music/Stream.mp3";
	public static final String cheer_music1 = "music/cheer.mp3";
	public static final String boy_character = "sprite/Boy.png";
	public static final String girl_character = "sprite/Girl.png";
	
	//////////////////////////////////////////////////below are bubble texts in chronilogical order.
	public static final String bubble_intro = "bubble/GlobalBubble_level1_1.png";
	public static final String bubble_intro1 = "bubble/GlobalBubble_level1_2.png";
	public static final String bubble_intro2 = "bubble/GlobalBubble_level1_3.png";
	public static final String bubble_intro3 = "bubble/GlobalBubble_level1_4.png";
	public static final String bubble_intro4 = "bubble/GlobalBubble_level1_5.png";
	public static final String bubble_intro5 = "bubble/GlobalBubble_level1_6.png";
	public static final String bubble_intro6 = "bubble/GlobalBubble_level1_7.png";
	public static final String bubble_intro7 = "bubble/GlobalBubble_level1_8.png";
	public static final String bubble_intro8 = "bubble/GlobalBubble_level1_9.png";
	public static final String bubble_intro9 = "bubble/GlobalBubble_level1_10.png";
	public static final String bubble_intro10 = "bubble/GlobalBubble_level1_11.png";
	public static final String bubble_intro11 = "bubble/GlobalBubble_level1_12.png";
	public static final String bubble_intro12 = "bubble/GlobalBubble_level1_13.png";
	public static final String bubble_intro13 = "bubble/GlobalBubble_level1_14.png";
	public static final String bubble_intro14 = "bubble/GlobalBubble_level1_15.png";
	public static final String bubble_intro15 = "bubble/GlobalBubble_level1_16.png";
	public static final String bubble_intro16 = "bubble/GlobalBubble_level1_17.png";
	public static final String bubble_intro17 = "bubble/GlobalBubble_level1_18.png";
	
	
	
	private static Texture Background_plain,  Background_park, Background_title, 
	Background_fade, Intro_Button1, Back_button, boy, girl,Background_river, Button_yes, Button_no,
///////////////////////////////Below are park backgrounds
	scene1, scene2, scene3,
	//////////////////////////////Below are objects
	car_1, family_1, gate_1, gate_2, sun_1, dog_1, dog_2, 
	plant_1, plant_2, Object_wall,
	Object_lever, Object_bridge1, Object_bridge2,
	Object_friend, Object_fallentree,
	Object_park1, Object_park2, Object_park3, Object_park4, Object_park5,
	///////////////////////////Below are items
	Itembox, Item_ball, Item_rope, Item_stick, Item_waterbottle, Item_key, Item_glove,
	////////////////////////////////Below are private bubble things
	Bubble_intro, Bubble_intro_1, Bubble_intro_2, Bubble_intro_3, Bubble_intro_4, Bubble_intro_5,
	Bubble_intro_6, Bubble_intro_7, Bubble_intro_8, Bubble_intro9, Bubble_intro10, Bubble_intro11,
	Bubble_intro12, Bubble_intro13, Bubble_intro14, Bubble_intro15, Bubble_intro16, Bubble_intro17;
	
	public static Texture spaceship_pic;
	
	public static TextureRegion Background_Title, Background_Plain, Background_PlainFLIPPED, Background_Park, Bg1, 
	Introduction_Button1, Back_Button, Boy, Girl, Background_Fade, Background_River,
	Button_Yes, Button_No,
///////////////////////////////Below are park backgrounds
	Scene1, Scene2, Scene3,
//////////////////////////////Below are objects
	Car_1, Family_1, Gate_1, Gate_2, Sun_1, Dog_1, Dog_2, 
	Object_Mat, Object_Basket_Black, Object_Wall, Plant_1, Plant_2,
	Object_Friend, Object_Fallentree,
	Object_Lever, Object_Bridge1, Object_Bridge2,LeverFLIPPED,
	Object_Park1, Object_Park2, Object_Park3, Object_Park4,Object_Park5,
	///////////////////////////Below are items
	ItemBOX, Item_Ball, Item_Rope, Item_Stick, Item_WaterBottle, Item_Key, Item_Glove,
	/////////////////////////////////Below are public bubble things
	
	Bubble_Intro, Bubble_Intro_1, Bubble_Intro_2, Bubble_Intro_3, Bubble_Intro_4, Bubble_Intro_5,
	Bubble_Intro_6, Bubble_Intro_7, Bubble_Intro_8, Bubble_Intro9, Bubble_Intro10, Bubble_Intro11,
	Bubble_Intro12, Bubble_Intro13, Bubble_Intro14, Bubble_Intro15, Bubble_Intro16, Bubble_Intro17;
	
	public static void load(){
		manager.load(background_river, Texture.class);
		manager.load(background_fade, Texture.class);
		manager.load(background_title, Texture.class);
		manager.load(background_scene1, Texture.class);
		manager.load(background_scene2, Texture.class);
		manager.load(background_scene3, Texture.class);
		manager.load(itembox, Texture.class);
		manager.load(item_ball, Texture.class);
		manager.load(item_glove, Texture.class);
		manager.load(item_rope, Texture.class);
		manager.load(item_stick, Texture.class);
		manager.load(item_key, Texture.class);
		manager.load(object_plant1, Texture.class);
		manager.load(object_wall, Texture.class);
		manager.load(object_plant2, Texture.class);
		manager.load(object_friend, Texture.class);
		manager.load(object_fallentree, Texture.class);
		manager.load(object_lever, Texture.class);
		manager.load(object_bridge1, Texture.class);
		manager.load(object_bridge2, Texture.class);
		manager.load(object_park1, Texture.class);
		manager.load(object_park2, Texture.class);
		manager.load(object_park3, Texture.class);
		manager.load(object_park4, Texture.class);
		manager.load(object_park5, Texture.class);
		manager.load(item_waterbottle, Texture.class);
		manager.load(button_intro1, Texture.class);
		manager.load(bubble_intro1, Texture.class);
		manager.load(bubble_intro2, Texture.class);
		manager.load(bubble_intro3, Texture.class);
		manager.load(bubble_intro4, Texture.class);
		manager.load(bubble_intro5, Texture.class);
		manager.load(bubble_intro6, Texture.class);
		manager.load(bubble_intro7, Texture.class);
		manager.load(bubble_intro8, Texture.class);
		manager.load(bubble_intro9, Texture.class);
		manager.load(bubble_intro10, Texture.class);
		manager.load(bubble_intro11, Texture.class);
		manager.load(bubble_intro12, Texture.class);
		manager.load(bubble_intro13, Texture.class);
		manager.load(bubble_intro14, Texture.class);
		manager.load(bubble_intro15, Texture.class);
		manager.load(bubble_intro16, Texture.class);
		manager.load(bubble_intro17, Texture.class);
		manager.load(button_back, Texture.class);
		manager.load(background_park, Texture.class);
		manager.load(background_plain, Texture.class);
		manager.load(boy_character, Texture.class);
		manager.load(girl_character, Texture.class);
		manager.load(object_car, Texture.class);
		manager.load(object_family, Texture.class);
		manager.load(object_gate1, Texture.class);
		manager.load(object_gate2, Texture.class);
		manager.load(object_sun, Texture.class);
		manager.load(object_dog1, Texture.class);
		manager.load(object_dog2, Texture.class);
		manager.load(bubble_intro, Texture.class);
		manager.load(theme_music, Music.class);
		manager.load(game_music1, Music.class);
		manager.load(water_music1, Music.class);
		manager.load(cheer_music1, Music.class);
		manager.load(button_yes, Texture.class);
		manager.load(button_no, Texture.class);
	}
	
	public static void create(){
		////////BELOW ARE ITEMS ONLY
		Item_glove = manager.get(item_glove, Texture.class);
		Item_Glove = new TextureRegion(Item_glove, 0,0, 192, 192);
		Item_Glove.flip(false,true);
		
		
		Item_key = manager.get(item_key, Texture.class);
		Item_Key = new TextureRegion(Item_key, 0,0, 192, 192);
		Item_Key.flip(false,true);
		
		Itembox = manager.get(itembox, Texture.class);
		ItemBOX = new TextureRegion(Itembox, 0,0, 192, 192);
		ItemBOX.flip(false,true);
		
		Item_ball = manager.get(item_ball, Texture.class);
		Item_Ball = new TextureRegion(Item_ball, 0,0, 192, 192);
		Item_Ball.flip(false,true);
		
		Item_rope = manager.get(item_rope, Texture.class);
		Item_Rope = new TextureRegion(Item_rope, 0,0, 192, 192);
		Item_Rope.flip(false,true);
		
		Item_stick= manager.get(item_stick, Texture.class);
		Item_Stick = new TextureRegion(Item_stick, 0,0, 192, 192);
		Item_Stick.flip(false,true);
		
		Item_waterbottle= manager.get(item_waterbottle, Texture.class);
		Item_WaterBottle = new TextureRegion(Item_waterbottle, 0,0, 192, 192);
		Item_WaterBottle.flip(false,true);
		
		//BELOW ARE BUBBLE IMAGES ONLY
		Bubble_intro= manager.get(bubble_intro, Texture.class);
		Bubble_Intro = new TextureRegion(Bubble_intro, 0,0, 720, 240);
		Bubble_Intro.flip(false, true);
		
		Bubble_intro_1= manager.get(bubble_intro1, Texture.class);
		Bubble_Intro_1 = new TextureRegion(Bubble_intro_1, 0,0, 720, 240);
		Bubble_Intro_1.flip(false, true);
		
		Bubble_intro_2= manager.get(bubble_intro2, Texture.class);
		Bubble_Intro_2 = new TextureRegion(Bubble_intro_2, 0,0, 720, 240);
		Bubble_Intro_2.flip(false, true);
		
		Bubble_intro_3= manager.get(bubble_intro3, Texture.class);
		Bubble_Intro_3 = new TextureRegion(Bubble_intro_3, 0,0, 720, 240);
		Bubble_Intro_3.flip(false, true);
		
		Bubble_intro_4= manager.get(bubble_intro4, Texture.class);
		Bubble_Intro_4 = new TextureRegion(Bubble_intro_4, 0,0, 720, 240);
		Bubble_Intro_4.flip(false, true);
		
		
		Bubble_intro_5= manager.get(bubble_intro5, Texture.class);
		Bubble_Intro_5 = new TextureRegion(Bubble_intro_5, 0,0, 720, 240);
		Bubble_Intro_5.flip(false, true);
		
		Bubble_intro_6= manager.get(bubble_intro6, Texture.class);
		Bubble_Intro_6= new TextureRegion(Bubble_intro_6, 0,0, 720, 240);
		Bubble_Intro_6.flip(false, true);
		
		Bubble_intro_7= manager.get(bubble_intro7, Texture.class);
		Bubble_Intro_7 = new TextureRegion(Bubble_intro_7, 0,0, 720, 240);
		Bubble_Intro_7.flip(false, true);
		
		Bubble_intro_8= manager.get(bubble_intro8, Texture.class);
		Bubble_Intro_8 = new TextureRegion(Bubble_intro_8, 0,0, 720, 240);
		Bubble_Intro_8.flip(false, true);
		
		Bubble_intro9= manager.get(bubble_intro9, Texture.class);
		Bubble_Intro9 = new TextureRegion(Bubble_intro9, 0,0, 720, 240);
		Bubble_Intro9.flip(false, true);
		
		Bubble_intro10= manager.get(bubble_intro10, Texture.class);
		Bubble_Intro10 = new TextureRegion(Bubble_intro10, 0,0, 720, 240);
		Bubble_Intro10.flip(false, true);
		
		Bubble_intro11= manager.get(bubble_intro11, Texture.class);
		Bubble_Intro11 = new TextureRegion(Bubble_intro11, 0,0, 720, 240);
		Bubble_Intro11.flip(false, true);
		
		Bubble_intro11= manager.get(bubble_intro11, Texture.class);
		Bubble_Intro11 = new TextureRegion(Bubble_intro11, 0,0, 720, 240);
		Bubble_Intro11.flip(false, true);
		
		Bubble_intro12= manager.get(bubble_intro12, Texture.class);
		Bubble_Intro12 = new TextureRegion(Bubble_intro12, 0,0, 720, 240);
		Bubble_Intro12.flip(false, true);
		
		
		Bubble_intro13= manager.get(bubble_intro13, Texture.class);
		Bubble_Intro13 = new TextureRegion(Bubble_intro13, 0,0, 720, 240);
		Bubble_Intro13.flip(false, true);
		
		
		Bubble_intro14= manager.get(bubble_intro14, Texture.class);
		Bubble_Intro14 = new TextureRegion(Bubble_intro14, 0,0, 720, 240);
		Bubble_Intro14.flip(false, true);
		
		Bubble_intro15= manager.get(bubble_intro15, Texture.class);
		Bubble_Intro15 = new TextureRegion(Bubble_intro15, 0,0, 720, 240);
		Bubble_Intro15.flip(false, true);
		
		Bubble_intro16= manager.get(bubble_intro16, Texture.class);
		Bubble_Intro16 = new TextureRegion(Bubble_intro16, 0,0, 720, 240);
		Bubble_Intro16.flip(false, true);
		
		Bubble_intro17= manager.get(bubble_intro17, Texture.class);
		Bubble_Intro17 = new TextureRegion(Bubble_intro17, 0,0, 720, 240);
		Bubble_Intro17.flip(false, true);
		
		///////ABOVE ARE BUBBLE ONLY
		boy = manager.get(boy_character, Texture.class);
		Boy = new TextureRegion(boy, 0,0,160,280);
		Boy.flip(false, true);
		
		girl = manager.get(girl_character,Texture.class);
		Girl = new TextureRegion(girl, 0,0, 160, 280);
		Girl.flip(false, true);
		////////////////////////////////////////////////////BELOW ARE OBJECTS SUCH AS PEOPLE CARS ETC.
		plant_1 = manager.get(object_plant1, Texture.class);
		Plant_1 = new TextureRegion(plant_1, 0,0, 480, 480);
		Plant_1.flip(false,true);
		
		plant_2 = manager.get(object_plant2, Texture.class);
		Plant_2 = new TextureRegion(plant_2, 0,0, 480, 480);
		Plant_2.flip(false,true);
		
		Object_wall = manager.get(object_wall, Texture.class);
		Object_Wall = new TextureRegion(Object_wall, 0,0, 480, 480);
		Object_Wall.flip(false,true);
		
		
		Object_fallentree = manager.get(object_fallentree, Texture.class);
		Object_Fallentree = new TextureRegion(Object_fallentree, 0,0, 480, 480);
		Object_Fallentree.flip(false,true);
		
		Object_friend = manager.get(object_friend, Texture.class);
		Object_Friend = new TextureRegion(Object_friend, 0,0, 480, 480);
		Object_Friend.flip(false,true);
		
		Object_lever = manager.get(object_lever, Texture.class);
		Object_Lever = new TextureRegion(Object_lever, 0,0, 480, 480);
		Object_Lever.flip(false,true);
		
		LeverFLIPPED =new TextureRegion(Object_lever, 0,0, 480, 480);
		LeverFLIPPED.flip(true,true);
		
		Object_bridge1 = manager.get(object_bridge1, Texture.class);
		Object_Bridge1 = new TextureRegion(Object_bridge1, 0,0, 480, 480);
		Object_Bridge1.flip(false,true);
		
		Object_bridge2 = manager.get(object_bridge2, Texture.class);
		Object_Bridge2 = new TextureRegion(Object_bridge2, 0,0, 480, 480);
		Object_Bridge2.flip(false,true);
		
		Object_park1 = manager.get(object_park1, Texture.class);
		Object_Park1 = new TextureRegion(Object_park1, 0,0, 480, 480);
		Object_Park1.flip(false,true);
		
		Object_park2 = manager.get(object_park2, Texture.class);
		Object_Park2 = new TextureRegion(Object_park2, 0,0, 480, 480);
		Object_Park2.flip(false,true);
		
		Object_park3 = manager.get(object_park3, Texture.class);
		Object_Park3 = new TextureRegion(Object_park3, 0,0, 480, 480);
		Object_Park3.flip(false,true);
		
		Object_park4 = manager.get(object_park4, Texture.class);
		Object_Park4 = new TextureRegion(Object_park4, 0,0, 480, 480);
		Object_Park4.flip(false,true);
		
		Object_park5 = manager.get(object_park5, Texture.class);
		Object_Park5 = new TextureRegion(Object_park5, 0,0, 480, 480);
		Object_Park5.flip(false,true);
		
		
		
		sun_1 = manager.get(object_sun, Texture.class);
		Sun_1 = new TextureRegion(sun_1, 0,0, 480, 480);
		Sun_1.flip(false,true);
		
		
		car_1 = manager.get(object_car, Texture.class);
		Car_1 = new TextureRegion(car_1, 0,0, 480, 480);
		Car_1.flip(false,true);
		
		
		family_1 = manager.get(object_family, Texture.class);
		Family_1 = new TextureRegion(family_1, 0,0, 480, 480);
		Family_1.flip(false,true);
		
		gate_1 = manager.get(object_gate1, Texture.class);
		Gate_1 = new TextureRegion(gate_1, 0,0, 480, 480);
		Gate_1.flip(false,true);
		
		gate_2 = manager.get(object_gate2, Texture.class);
		Gate_2 = new TextureRegion(gate_2, 0,0, 480, 480);
		Gate_2.flip(false,true);
		
		dog_1 = manager.get(object_dog1, Texture.class);
		Dog_1 = new TextureRegion(dog_1, 0,0, 480, 480);
		Dog_1.flip(false,true);
		
		dog_2 = manager.get(object_dog2, Texture.class);
		Dog_2 = new TextureRegion(dog_2, 0,0, 480, 480);
		Dog_2.flip(false,true);
		/////
		
		
		///////////////////////////////////////////////////BELOW ARE BACKGROUNDS ONLYS
		scene1 = manager.get(background_scene1, Texture.class);
		Scene1 = new TextureRegion(scene1, 0,0, 960, 640);
		Scene1.flip(false, true);
		
		scene2 = manager.get(background_scene2, Texture.class);
		Scene2 = new TextureRegion(scene2, 0,0, 960, 640);
		Scene2.flip(false, true);
		
		scene3 = manager.get(background_scene3, Texture.class);
		Scene3 = new TextureRegion(scene3, 0,0, 960, 640);
		Scene3.flip(false, true);
		
		
		Background_fade = manager.get(background_fade, Texture.class);
		Background_Fade = new TextureRegion(Background_fade, 0,0, 960, 640);
		Background_Fade.flip(false, true);
		
		Background_title = manager.get(background_title, Texture.class);
		Background_Title = new TextureRegion(Background_title, 0,0, 960, 640);
		Background_Title.flip(false, true);
		
		Background_river = manager.get(background_river, Texture.class);
		Background_River = new TextureRegion(Background_river, 0,0, 960, 640);
		Background_River.flip(false, true);
		
		Background_park = manager.get(background_park, Texture.class);
		Background_Park = new TextureRegion(Background_park, 0,0, 960, 640);
		Background_Park.flip(false, true);
		
		Background_plain = manager.get(background_plain, Texture.class);
		Background_Plain = new TextureRegion(Background_plain, 0,0, 960, 640);
		Background_Plain.flip(false, true);
		
		Background_PlainFLIPPED = new TextureRegion(Background_plain, 0,0, 960, 640);
		
/////////////////////////////////////////////////////////////////////////////ABOVE ARE BACKGROUNDS ONLY...
		
		Intro_Button1 = manager.get(button_intro1, Texture.class);
		Introduction_Button1 = new TextureRegion(Intro_Button1, 0,0, 225, 225);
		Introduction_Button1.flip(false, true);
		
		Back_button = manager.get(button_back, Texture.class);
		Back_Button = new TextureRegion(Back_button, 0,0, 225, 225);
		Back_Button.flip(false, true);
		
		Button_yes = manager.get(button_yes, Texture.class);
		Button_Yes = new TextureRegion(Button_yes, 0,0, 225, 225);
		Button_Yes.flip(false, true);
		
		Button_no = manager.get(button_no, Texture.class);
		Button_No = new TextureRegion(Button_no, 0,0, 225, 225);
		Button_No.flip(false, true);
	}

}
