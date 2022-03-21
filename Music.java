import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Music extends Actor
{
    private static String songName;
    public Music(String song)
    {
        if(song.equals("This Will Be the Day"))
        {
            setImage(song+".png");
        }
        else if(song.equals("Time to Say Goodbye"))
        {
            setImage(song+".png");
        }
        else if(song.equals("When It Falls"))
        {
            setImage(song+".png");
        }
        else if(song.equals("Lets Just Live"))
        {
            setImage(song+".png");
        }
        else if(song.equals("Red Like Roses"))
        {
            setImage(song+".png");
        }
        else if(song.equals("Mirror Mirror"))
        {
            setImage(song+".png");
        }
        else if(song.equals("From Shadows"))
        {
            setImage(song+".png");
        }
        else if(song.equals("I Burn"))
        {
            setImage(song+".png");
        }
        else if(song.equals("Bad Luck Charm"))
        {
            setImage(song+".png");
        }
        else if(song.equals("I Burn Yellow Trailer"))
        {
            setImage(song+".png");
        }
        else if(song.equals("OP1Remix"))
        {
            setImage(song+".png");
        }
        else if(song.equals("I May Fall"))
        {
            
        }
        this.songName=song;
    }
    public void act()
    {
        MyWorld myWorld = (MyWorld) getWorld();
        if(Greenfoot.mousePressed(myWorld.op1Pic))
        {
            myWorld.song1();
        }
        else if(Greenfoot.mousePressed(myWorld.op2Pic))
        {
            myWorld.song2();
        }
        else if(Greenfoot.mousePressed(myWorld.op3Pic))
        {
            myWorld.song3();
        }
        else if(Greenfoot.mousePressed(myWorld.op4Pic))
        {
            myWorld.song4();
        }
        else if(Greenfoot.mousePressed(myWorld.rubyThemePic))
        {
            myWorld.song5();
        }
        else if(Greenfoot.mousePressed(myWorld.weissThemePic))
        {
            myWorld.song6();
        }
        else if(Greenfoot.mousePressed(myWorld.blakeThemePic))
        {
            myWorld.song7();
        }
        else if(Greenfoot.mousePressed(myWorld.yangThemePic))
        {
            myWorld.song8();
        }
        else if(Greenfoot.mousePressed(myWorld.qrowThemePic))
        {
            myWorld.song9();
        }
        else if(Greenfoot.mousePressed(myWorld.clubThemePic))
        {
            myWorld.song10();
        }
        else if(Greenfoot.mousePressed(myWorld.op1RemixPic))
        {
            myWorld.song11();
        }
    }
}
