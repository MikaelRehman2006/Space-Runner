import mayflower.*;
public class LevelThree extends MyWorld
{
    public LevelThree(Character player)
    {
        super(player, 3, player.getScore() + 30);
        setBackground("img/background(1).jpg");
        
        createZapper(150, 40, 0, 2);
        createCoin(150, 60, 2);
        createCoin(200, 60, 3);
        createCoin(250, 60, 4);
        createZapper(150, 150, 0, -2);
        
        createZapper(550, 150, 0, 1);
        createCoin(450, 200, 2);
        createCoin(300, 180, 3);
        createCoin(550, 110, 4);
        createZapper(550, 250, 0, -1);
        
        createZapper(900, 150, 0, 2);
        createCoin(850, 200, 2);
        createCoin(800, 180, 3);
        createCoin(950, 110, 4);
        createZapper(900, 200, 0, -3);
    }
    
    public void act(){
        super.act();
        if (MainCharacter.getScore() >= mGoalScore)
        {
            World w = new isGameOver(true, MainCharacter.getScore());
            Mayflower.setWorld(w);
        }
    }
}