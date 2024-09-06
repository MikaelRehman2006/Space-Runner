import mayflower.*;

public class TitleScreen extends World
{
   public TitleScreen()
   {
        setBackground("img/background(1).jpg");
        showText("Press Enter to Start", 40, 130, 130, Color.RED);

   }
    
    public void act()
    {
        if (Mayflower.isKeyPressed(Keyboard.KEY_ENTER))
        {
            Character player = new Character();
            World w = new LevelOne(player);
            Mayflower.setWorld(w);
        }
    }
    
}