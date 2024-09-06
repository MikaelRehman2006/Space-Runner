
import mayflower.*;

public class isGameOver extends World
{
   private int finalScore;
   private Boolean didPlayerWin;
   public isGameOver(Boolean won, int score)
    {
        didPlayerWin = won;
        finalScore = score;
        setBackground("img/background(1).jpg");
        
        if (didPlayerWin)
        {
            showText("You Win", 40, 130, 130, Color.RED);
        }
        else
        {
            showText("You Lose", 40, 130, 130, Color.RED);
        }
        showText("Final Score " + finalScore, 40, 130, 180, Color.RED);
   }
    
    public void act()
    {
        if (Mayflower.isKeyPressed(Keyboard.KEY_ENTER))
        {
            World w = new TitleScreen();
            Mayflower.setWorld(w);
        }
    }
    
}