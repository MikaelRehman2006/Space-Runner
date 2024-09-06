import mayflower.*;

public class Character extends Actor{
    private int score;
    private int lives;
    private int hitFrame;
    private Timer hitTimer;
    
    public Character(){
       setImage("img/actor(1).png");
       score = 0;
       lives = 300;
       hitFrame = 0;
    }
    public void act(){
        int x = getX();
        int y = getY();
        int w = getWidth();
        int h = getHeight();
        if (Mayflower.isKeyDown ( Keyboard.KEY_RIGHT  ))
        {
            x = x + 1;
            if (Mayflower.isKeyDown(Keyboard.KEY_LSHIFT))
            {
               x = x + 1;     
            }
        }
        if (Mayflower.isKeyDown ( Keyboard.KEY_LEFT  ))
        {
            x = x - 1;
            if (Mayflower.isKeyDown(Keyboard.KEY_LSHIFT))
            {
               x = x - 1;     
            }
        }
        if (Mayflower.isKeyDown ( Keyboard.KEY_UP ))
            y = y - 1;
        else
            y = y + 2;
        if (Mayflower.isKeyDown ( Keyboard.KEY_DOWN  ))
            y = y + 1;
            
        if (x < -21)
            x = -21;
        else if (x > 298)
            x = 298;
        if (y > 120)
            y = 120;
        else if (y < -25)
            y = -25;    
        setLocation(x, y);
        scale(.65);
        if (hitFrame > 0)
        {
            if (hitTimer.isDone())
            {
                hitTimer.reset();
                if (hitFrame % 2 == 0)
                {
                    getImage().setTransparency(80);
                }
                else
                {
                    getImage().setTransparency(0);
                }
                --hitFrame;
            }
        }
        //World w2 = getWorld();
        //w2.removeText(10, 80);
        //w2.showText("X: " + x + " Y: " +  y + " Width: " + w + " Height: " + h, 10, 80, Color.BLACK);
    }
    public void increaseScore( int amount )
    {
        score += amount;    
    }
    public void decreaseLives(int Amount)
    {
        if (isVolnerable())
        {
            lives -= Amount;
            hitFrame = 120;
            hitTimer = new Timer(500);
        }
    }
    public void resetLives()
    {
        lives = 3;
        hitFrame = 0;
        getImage().setTransparency(0);
    }
    public Boolean isVolnerable()
    {
        return hitFrame == 0;
    }
    public int getScore()
    {
        return score;
    }
    public int getLives()
    {
        return lives;
    }
    
}
