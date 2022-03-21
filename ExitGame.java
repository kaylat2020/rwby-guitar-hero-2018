import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class ExitGame extends Actor
{
    public ExitGame() 
    {
        
    }
    public void act()
    {
        if(Greenfoot.mousePressed(this))
        {
            MyWorld myWorld = (MyWorld) getWorld();
            System.exit(0);
        }
    }
}
