import mayflower.*;
import java.util.Random;

public class MyWorld extends World{
    protected String[][] tiles;
    protected Character MainCharacter;
    protected int mLevel;
    protected int mGoalScore;
    
    public MyWorld(Character player, int level, int goalScore){
       setBackground("img/background(1).jpg");
       mLevel = level;
       mGoalScore = goalScore;
       MainCharacter = player;
       MainCharacter.resetLives();
       tiles = new String[6][8];
       buildWorld(); 
       addMainCharacter();
    }
    public void buildWorld(){
        int tileWidth = 132;
        int tileHeight = 92;
        int screenHeight = 408;
        for (int i = 0; i < tiles.length; i++) 
        {
            for (int j = 0; j < tiles[i].length; j++) 
            {
                if (i == 4)
                {
                    tiles[i][j] = "ground"; 
                } else 
                {
                    tiles[i][j] = ""; 
                }
            }
        }
        

        for (int r = 0; r < tiles.length; r++) 
        {
            for (int c = 0; c < tiles[r].length; c++) 
            {
                if ("ground".equals(tiles[r][c])) 
                {
                    int blockX = (c * tileWidth);
                    int blockY = screenHeight - (tileHeight); 
                    addObject(new Block(), blockX, blockY);
                }
            }
        }
    }
    public void addMainCharacter(){
        addObject(MainCharacter, -21, 120);
    }
    public void createZapper(int x, int y, int rotation, int rotationRate)
    {
        Zapper z = new Zapper(rotationRate);
        z.setRotation(rotation);
        addObject(z, x, y);
    }
    public void createCoin(int x, int y, int speed)
    {
        Coin c = new Coin(speed);
        addObject(c, x, y);
    }
    public void worldStarted(){
        Boolean worldStart = true;
        
    }
    public void act(){
        updateText();
        if (MainCharacter.getLives() == 0)
        {
            World w = new isGameOver(false, MainCharacter.getScore());
            Mayflower.setWorld(w);
        }
    }
    
    public void updateText()
    {
        removeText(10, 30);
        showText("Level: " + mLevel + " Score: " + MainCharacter.getScore() + "/" + mGoalScore + " Lives: " +  MainCharacter.getLives(), 10, 30, Color.BLACK);
    }
}