import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class SongSelection extends Actor
{
    public SongSelection()
    {
        
    }
    public void act()
    {
        if(Greenfoot.mousePressed(this))
        {
            MyWorld myWorld = (MyWorld) getWorld();
            myWorld.displaySongs();
            getWorld().removeObject(this);
        }
    }
}
