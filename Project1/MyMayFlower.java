import mayflower.*;

public class MyMayFlower extends Mayflower{
    public MyMayFlower(){
        super("Project 1", 612, 408);
    }
    
    public void init(){
        Mayflower.setFullScreen(false);
        //World w = new LevelOne(new Character());
        World w = new TitleScreen();
        Mayflower.setWorld(w);
        
    }
}