import mayflower.*;
public class LevelOne extends MyWorld
{
    public LevelOne(Character player)
    {
        super(player, 1, player.getScore() + 20);
        setBackground("img/background(1).jpg");
        
        createZapper(150, 40, 30, 0);
        createCoin(150, 60, 2);
        createCoin(200, 60, 3);
        createCoin(250, 60, 4);
        createZapper(150, 150, 30, 0);
        
        createZapper(550, 150, 0, 0);
        createCoin(450, 200, 2);
        createCoin(300, 180, 3);
        createCoin(550, 110, 4);
        createZapper(550, 250, 0, 0);
        
        createZapper(900, 150, 0, 0);
        createCoin(850, 200, 2);
        createCoin(800, 180, 3);
        createCoin(950, 110, 4);
        createZapper(900, 200, 0, 0);
    }
    
    public void act(){
        super.act();
        if (MainCharacter.getScore() >= mGoalScore)
        {
            World w = new LevelTwo(MainCharacter);
            Mayflower.setWorld(w);
        }
    }
}
