import mayflower.*;
public class Coin extends MovableBackground
{
    public Coin(int speed)
    {
        super(1000, speed);
        setImage("img/coin.png");
        //
    }
      public void act()
    {
        super.act();
        scale(40, 40);
        if (isTouching(Character.class))
        {
            Object a = getOneIntersectingObject(Character.class);
            Character c = (Character) a;
            World w = getWorld();
            c.increaseScore(1);
            
            int newY = (int) (Math.random() * 200);
            setLocation(-100, newY);
            scale(40, 40);
            int newSpeed = getSpeed() * 2;
            if (newSpeed > 10)
            {
                newSpeed = 10;
            }
            setSpeed(newSpeed);
        }
    }
}
