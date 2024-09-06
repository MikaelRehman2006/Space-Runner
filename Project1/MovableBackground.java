import mayflower.*;

public class MovableBackground extends Actor{
    private int mMaxX;
    private int mSpeed;
    
    public MovableBackground(int maxX, int speed){
        mMaxX = maxX;
        mSpeed = speed;
    }
    int getSpeed()
    {
        return mSpeed;
    }
    void setSpeed(int s)
    {
        mSpeed = s;
    }
    public void act(){
        setLocation(getX() - mSpeed, getY());
        if(getX() + getWidth() < 0)
        {
            setLocation(mMaxX, getY());
        }
    }
}