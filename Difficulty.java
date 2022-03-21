import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Difficulty extends Actor
{
    public Difficulty(String d) 
    {
        if(d.equals("easy"))
        {
            setImage("Easy.png");
        }
        else if(d.equals("ok"))
        {
            setImage("OK.png");
        }
        else if(d.equals("hard"))
        {
            setImage("Hard.png");
        }
        else if(d.equals("insane"))
        {
            setImage("Insane.png");
        }
    }    
}
