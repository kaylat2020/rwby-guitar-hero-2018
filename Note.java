import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Note extends SmoothMover
{
    private GreenfootSound correct = new GreenfootSound("Correct.mp3");
    private GreenfootSound fail = new GreenfootSound("Fail.mp3");
    
    
    private double velocity=8.0;
    private int scaler=1;
    private static int color;
    private static String[] myKey={"A","S","D","F","G"};
    GreenfootImage image = getImage();
    //private String[] screams = {"1","2","3","4","5","6","7","8"};
        
    GreenfootImage green = new GreenfootImage("Green.png");
    GreenfootImage red = new GreenfootImage("Red.png");
    GreenfootImage yellow = new GreenfootImage("Yellow.png");
    GreenfootImage blue = new GreenfootImage("Blue.png");
    GreenfootImage orange = new GreenfootImage("Orange.png");

    public Note(int color)
    {        
        if(color==0)
        {
            setImage(green);
        }
        else if(color==1)
        {
            setImage(red);
        }
        else if(color==2)
        {
            setImage(yellow);
        }
        else if(color==3)
        {
            setImage(blue);
        }
        else if(color==4)
        {
            setImage(orange);
        }
        this.color=color;
        transparencies();
    } 

    public void transparencies()
    {
        getImage().setTransparency(0);
    }

    public static int getNoteColor()
    {
        return color;
    }

    public void act() 
    {
        if(getImage().getTransparency()<250)
        {
            getImage().setTransparency(getImage().getTransparency()+10);
        }
        
        if(getNoteColor()==0)
        {
            setLocation(getExactX()-3.0,getExactY()+velocity);
            velocity+=0.01;
        }
        else if(getNoteColor()==1)
        {
            setLocation(getExactX()-1.5,getExactY()+velocity);
            velocity+=0.01;
        }
        else if(getNoteColor()==2)
        {
            setLocation(getX(),getExactY()+velocity);
            velocity+=0.01;
        }
        else if(getNoteColor()==3)
        {
            setLocation(getExactX()+1.5,getExactY()+velocity);
            velocity+=0.01;
        }
        else if(getNoteColor()==4)
        {
            setLocation(getExactX()+3.0,getExactY()+velocity);
            velocity+=0.01;
        }

        if(isTouching(Button.class)==true && Greenfoot.isKeyDown(myKey[getNoteColor()]))
        {
            correct.play();
            getWorld().removeObject(this);
            MyWorld.setScore(MyWorld.getScore()+100);
        }
        else if(isTouching(Button.class)==false)
        {
            if(Greenfoot.isKeyDown("A"))
            {
                fail.play();
                getWorld().removeObject(this);
                MyWorld.setScore(MyWorld.getScore()-50);
            }
            else if(Greenfoot.isKeyDown("S"))
            {
                fail.play();
                getWorld().removeObject(this);
                MyWorld.setScore(MyWorld.getScore()-50);
            }
            else if(Greenfoot.isKeyDown("D"))
            {
                fail.play();
                getWorld().removeObject(this);
                MyWorld.setScore(MyWorld.getScore()-50);
            }
            else if(Greenfoot.isKeyDown("F"))
            {
                fail.play();
                getWorld().removeObject(this);
                MyWorld.setScore(MyWorld.getScore()-50);
            }
            else if(Greenfoot.isKeyDown("G"))
            {
                fail.play();
                getWorld().removeObject(this);
                MyWorld.setScore(MyWorld.getScore()-50);
            }
        }
        else if(isAtEdge())
        {
            getWorld().removeObject(this);
            MyWorld.setScore(MyWorld.getScore()-100);
        }
    } 
}

