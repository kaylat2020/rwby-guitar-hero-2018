import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot, SmoothMover, and MouseInfo)
import java.util.List;
public class MyWorld extends World
{
    private static int score;
    private static int actCount;
    private static int seconds=0;
    private GreenfootSound op1 = new GreenfootSound("This Will Be the Day.mp3");
    private GreenfootSound op2 = new GreenfootSound("Time to Say Goodbye.mp3");
    private GreenfootSound op3 = new GreenfootSound("When it Falls.mp3");
    private GreenfootSound op4 = new GreenfootSound("Let's Just Live.mp3");
    private GreenfootSound rubyTheme = new GreenfootSound("Red Like Roses.mp3");
    private GreenfootSound weissTheme = new GreenfootSound("Mirror Mirror.mp3");
    private GreenfootSound blakeTheme = new GreenfootSound("From Shadows.mp3");
    private GreenfootSound yangTheme = new GreenfootSound("I Burn.mp3");
    private GreenfootSound qrowTheme = new GreenfootSound("Bad Luck Charm.mp3");
    private GreenfootSound clubTheme = new GreenfootSound("I Burn (Yellow Trailer).mp3");
    private GreenfootSound op1Remix = new GreenfootSound("This Will Be the Day Remix.mp3");
    private GreenfootSound iMayFall = new GreenfootSound("I May Fall.mp3");
    private static boolean started;
    private static boolean paused;
    
    SongSelection songSelection = new SongSelection();
    ExitGame exitGame = new ExitGame();
    Music op1Pic = new Music("This Will Be the Day");
    Music op2Pic = new Music("Time to Say Goodbye");
    Music op3Pic = new Music("When It Falls");
    Music op4Pic = new Music("Lets Just Live");
    Music rubyThemePic = new Music("Red Like Roses");
    Music weissThemePic = new Music("Mirror Mirror");
    Music blakeThemePic = new Music("From Shadows");
    Music yangThemePic = new Music("I Burn");
    Music qrowThemePic = new Music("Bad Luck Charm");
    Music op1RemixPic = new Music("This Will Be the Day");
    Music clubThemePic = new Music("I Burn Yellow Trailer");

    Button green = new Button(0);
    Button red = new Button(1);
    Button yellow = new Button(2);
    Button blue = new Button(3);
    Button orange = new Button(4);
    
    Difficulty easy = new Difficulty("easy");
    Difficulty easy2 = new Difficulty("easy");
    Difficulty easy3 = new Difficulty("easy");
    Difficulty hard = new Difficulty("hard");
    Difficulty hard2 = new Difficulty("hard");
    Difficulty hard3 = new Difficulty("hard");
    Difficulty ok = new Difficulty("ok");
    Difficulty ok2 = new Difficulty("ok");
    Difficulty ok3 = new Difficulty("ok");
    Difficulty ok4 = new Difficulty("ok");
    Difficulty insane = new Difficulty("insane");
    
    private SimpleTimer timer = new SimpleTimer();

    public MyWorld()
    {    
        super(600, 800, 1);    
        started=false;
        paused=false;
        setBackground("Main Menu.png");
        addObject(songSelection,540,720);
        addObject(exitGame,520,520);
    }

    public void song1()
    {
        removeObjects(getObjects(null));
        setBackground("RWBY Fret.png");
        op1.play();
        Greenfoot.setSpeed(52);
        started=true;
        timer.mark();
    }
    public void song2()
    {
        removeObjects(getObjects(null));
        setBackground("RWBY2 Fret.png");
        op2.play();
        Greenfoot.setSpeed(54);
        started=true;
        timer.mark();
    }
    public void song3()
    {
        removeObjects(getObjects(null));
        setBackground("RWBY3 Fret.png");
        op3.play();
        Greenfoot.setSpeed(54);
        started=true;
        timer.mark();
    }
    public void song4()
    {
        removeObjects(getObjects(null));
        setBackground("RWBY4 Fret.png");
        op4.play();
        Greenfoot.setSpeed(52);
        started=true;
        timer.mark();
    }
    public void song5()
    {
        removeObjects(getObjects(null));
        setBackground("Ruby Fret.png");
        rubyTheme.play();
        started=true;
        timer.mark();
    }
    public void song6()
    {
        removeObjects(getObjects(null));
        setBackground("Weiss Fret.png");
        weissTheme.play();
        Greenfoot.setSpeed(56);
        started=true;
        timer.mark();
    }
    public void song7()
    {
        removeObjects(getObjects(null));
        setBackground("Blake Fret.png");
        blakeTheme.play();
        Greenfoot.setSpeed(52);
        started=true;
        timer.mark();
    }
    public void song8()
    {
        removeObjects(getObjects(null));
        setBackground("Yang Fret.png");
        yangTheme.play();
        started=true;
        timer.mark();
    }
    public void song9()
    {
        removeObjects(getObjects(null));
        setBackground("Qrow Fret.png");
        qrowTheme.play();
        Greenfoot.setSpeed(52);
        started=true;
        timer.mark();
    }
    public void song10()
    {
        removeObjects(getObjects(null));
        setBackground("Yang Fret.png");
        clubTheme.play();
        Greenfoot.setSpeed(51);
        started=true;
        timer.mark();
    }
    public void song11()
    {
        removeObjects(getObjects(null));
        setBackground("RWBY Fret.png");
        op1Remix.play();
        Greenfoot.setSpeed(54);
        started=true;
        timer.mark();
    }
    public void song12()
    {
        removeObjects(getObjects(null));
        setBackground("Ruby Fret.png");
        iMayFall.play();
        started=true;
        timer.mark();
    }
    
    public static int getScore()
    {
        return score;
    }
    
    public static void setScore(int newScore)
    {
        score=newScore;
    }
    
    public  void displaySongs()
    {
        removeObject(exitGame);
        setBackground("Main Menu2.png");
        Greenfoot.setSpeed(50);
        setScore(0);
        
        addObject(op1Pic,350,25);
        addObject(ok,70,25);
        
        addObject(op2Pic,350,100);
        addObject(hard,70,100);
        
        addObject(op3Pic,350,175);
        addObject(hard2,70,175);
        
        addObject(op4Pic,350,250);
        addObject(ok2,70,250);
        
        addObject(rubyThemePic,350,325);
        addObject(easy,70,325);
        
        addObject(weissThemePic,350,400);
        addObject(insane,70,400);
        
        addObject(blakeThemePic,350,475);
        addObject(ok3,70,475);
        
        addObject(yangThemePic,350,550);
        addObject(easy2,70,550);
        
        addObject(qrowThemePic,350,625);
        addObject(ok4,70,625);
        
        addObject(clubThemePic,350,700);
        addObject(easy3,70,700);
        
        addObject(op1RemixPic,350,775);
        addObject(hard3,70,775);
    }

    public void started()
    {
        
    }

    public void stopped()
    {
        op1.stop();
        op2.stop();
        op3.stop();
        op4.stop();
        rubyTheme.stop();
        weissTheme.stop();
        blakeTheme.stop();
        yangTheme.stop();
        qrowTheme.stop();
        clubTheme.stop();
        op1Remix.stop();
        iMayFall.stop();
    }

    public void act()
    {
        int random = (int)(Math.random()*5);
        if(started==true)
        {
            showText("SCORE",50,650);
            showText(""+score+"",50,620);
            addObject(green,100,750);
            addObject(red,200,750);
            addObject(yellow,300,750);
            addObject(blue,400,750);
            addObject(orange,500,750);
            if(actCount%70==0)
            {
                if(random==0)
                {
                    Note greenN = new Note(0);
                    addObject(greenN,255,300);
                }
                else if(random==1)
                {
                    Note redN = new Note(1);
                    addObject(redN,280,300);
                }
                else if(random==2)
                {
                    Note yellowN = new Note(2);
                    addObject(yellowN,300,300);
                }
                else if(random==3)
                {
                    Note blueN = new Note(3);
                    addObject(blueN,320,300);
                }
                else if(random==4)
                {
                    Note orangeN = new Note(4);
                    addObject(orangeN,345,300);
                }
            }
        }
        actCount+=1;
    }
}

