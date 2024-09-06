import mayflower.*;
public class Zapper extends MovableBackground
{
    private int mRotationRate;
    private int mOrigRotationRate;
    public Zapper(int rotationRate)
    {
        super(1000, 1);
        mRotationRate = rotationRate;
        mOrigRotationRate = rotationRate;
        setImage("img/lazer2.png");
    }
    public void act()
    {
        super.act();
        setRotation(getRotation() + mRotationRate);
        if (isTouching(Character.class))
        {
            Object a = getOneIntersectingObject(Character.class);
            Character c = (Character) a;
            if (c.isVolnerable())
            {
                c.decreaseLives(1);
                
            }
            mRotationRate = mOrigRotationRate * 5;
        }
        else
        {
            mRotationRate = mOrigRotationRate;
        }
    }
}

