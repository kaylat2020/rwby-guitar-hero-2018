import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Button extends Actor
{
    private String[] color={"green","red","yellow","blue","orange"};
    private int actualColor;
    public Button(int color)
    {
        if(color==0)
        {
            setImage("ButtonG.png");
        }
        else if(color==1)
        {
            setImage("ButtonR.png");
        }
        else if(color==2)
        {
            setImage("ButtonY.png");
        }
        else if(color==3)
        {
            setImage("ButtonB.png");
        }
        else if(color==4)
        {
            setImage("ButtonO.png");
        }
        this.actualColor=color;
    }

    public void act()
    {
        if(actualColor==0)
        {
            setImage("ButtonG.png");
        }
        else if(actualColor==1)
        {
            setImage("ButtonR.png");
        }
        else if(actualColor==2)
        {
            setImage("ButtonY.png");
        }
        else if(actualColor==3)
        {
            setImage("ButtonB.png");
        }
        else if(actualColor==4)
        {
            setImage("ButtonO.png");
        }
        MyWorld myWorld = (MyWorld) getWorld();
        if(Greenfoot.isKeyDown("A"))
        {
            myWorld.green.setImage("ButtonGPress.png");
        }
        if(Greenfoot.isKeyDown("S"))
        {
            myWorld.red.setImage("ButtonRPress.png");
        }
        if(Greenfoot.isKeyDown("D"))
        {
            myWorld.yellow.setImage("ButtonYPress.png");
        }
        if(Greenfoot.isKeyDown("F"))
        {
            myWorld.blue.setImage("ButtonBPress.png");
        }
        if(Greenfoot.isKeyDown("G"))
        {
            myWorld.orange.setImage("ButtonOPress.png");
        }
    }
}
