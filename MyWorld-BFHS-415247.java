import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
//import java.awt.Color; //RED, BLUE, GREEN, MAGENTA, CYAN, BLACK, WHITE
import java.awt.Graphics2D;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        super(752, 470, 1);
    }

    //Due 2/9/17

    void fillSolidRandom()
    {
        Color random = new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256));
        GreenfootImage bg =  getBackground();
        for(int x=0; x<bg.getWidth(); x++)
        {
            for(int y=0; y<bg.getHeight(); y++)
            {
                bg.setColorAt(x,y,random);
            }
        }
    }

    void fillRandom()
    {
        GreenfootImage bg =  getBackground();
        for(int x=0; x<bg.getWidth(); x++)
        {
            for(int y=0; y<bg.getHeight(); y++)
            {
                Color random = new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256));

                bg.setColorAt(x,y,random);
            }
        }
    }

    void redScale()
    {
        GreenfootImage bg =  getBackground();
        for(int x=0; x<bg.getWidth(); x++)
        {
            for(int y=0; y<bg.getHeight(); y++)
            {
                Color notRed = bg.getColorAt(x,y);
                notRed = new Color(notRed.getRed(),0,0);

                bg.setColorAt(x,y,notRed);
            }
        }
    }

    void greenScale()
    {
        GreenfootImage bg =  getBackground();
        for(int x=0; x<bg.getWidth(); x++)
        {
            for(int y=0; y<bg.getHeight(); y++)
            {
                Color notGreen = bg.getColorAt(x,y);
                notGreen = new Color(0,notGreen.getGreen(),0);

                bg.setColorAt(x,y,notGreen);
            }
        }
    }

    void blueScale()
    {
        GreenfootImage bg =  getBackground();
        for(int x=0; x<bg.getWidth(); x++)
        {
            for(int y=0; y<bg.getHeight(); y++)
            {
                Color notBlue = bg.getColorAt(x,y);
                notBlue = new Color(0,0,notBlue.getBlue());

                bg.setColorAt(x,y,notBlue);
            }
        }
    }

    //Due 2/15/17

    void darken()
    {
        GreenfootImage bg =  getBackground();
        for(int x=0; x<bg.getWidth(); x++)
        {
            for(int y=0; y<bg.getHeight(); y++)
            {
                Color c = bg.getColorAt(x,y);
                c = c.darker();

                bg.setColorAt(x,y,c);
            }
        }
    }

    void brighten()
    {
        GreenfootImage bg = getBackground();
        for(int x=0; x<bg.getWidth(); x++)
        {
            for(int y=0; y<bg.getHeight(); y++)
            {
                Color c = bg.getColorAt(x,y);
                c = c.brighter();

                bg.setColorAt(x,y,c);
            }
        }
    }

    void grayScale()
    {
        GreenfootImage bg = getBackground();
        for(int x=0; x<bg.getWidth(); x++)
        {
            for(int y=0; y<bg.getHeight(); y++)
            {
                Color c = bg.getColorAt(x,y);
                int thisGray = ((c.getRed() + c.getGreen() + c.getBlue())/3);
                c = new Color(thisGray, thisGray, thisGray);

                bg.setColorAt(x,y,c);
            }
        }
    }

    //Due 2/22/17
    void invert()
    {
        GreenfootImage bg = getBackground();
        for(int x=0; x<bg.getWidth(); x++)
        {
            for(int y=0; y<bg.getHeight(); y++)
            {
                Color i = bg.getColorAt(x,y);
                Color b = new Color(255-i.getRed(),255-i.getGreen(),255-i.getBlue());

                bg.setColorAt(x,y,b);
            }
        }
    }

    void mirrorLeftToRight()
    {
        GreenfootImage bg = getBackground();
        for(int x=0; x<bg.getWidth()/2; x++)
        {
            for(int y=0; y<bg.getHeight(); y++)
            {
                Color c = bg.getColorAt(x,y);
                bg.setColorAt(751-x,(y),c);
            }
        }
    }

    void mirrorRightToLeft()
    {
        GreenfootImage bg = getBackground();
        for(int x=0; x<bg.getWidth()/2; x++)
        {
            for(int y=0; y<bg.getHeight(); y++)
            {
                Color c = bg.getColorAt(751-x,y);
                bg.setColorAt(x,y,c);
            }
        }
    }

    void mirrorTopToBottom()
    {
        GreenfootImage bg = getBackground();
        for(int x=0; x<bg.getWidth(); x++)
        {
            for(int y=0; y<bg.getHeight()/2; y++)
            {
                Color c = bg.getColorAt(x,y);
                bg.setColorAt((x),469-y,c);
            }
        }
    }

    void mirrorBottomToTop()
    {
        GreenfootImage bg = getBackground();
        for(int x=0; x<bg.getWidth(); x++)
        {
            for(int y=0; y<bg.getHeight()/2; y++)
            {
                Color c = bg.getColorAt(x,469-y);
                bg.setColorAt(x,y,c);
            }
        }
    }

    //Due 2/28/17
    void flipHorizontal()
    {
        GreenfootImage bg = getBackground();
        for(int x=0; x<bg.getWidth()/2; x++)
        {
            for(int y=0; y<bg.getHeight(); y++)
            {
                Color c = bg.getColorAt(x,y);
                Color wtf = bg.getColorAt(bg.getWidth()-x-1,y);
                bg.setColorAt(x,y,wtf);
                bg.setColorAt(bg.getWidth()-x-1,y,c);
            }
        }
    }

    void flipVertical()
    {
        GreenfootImage bg = getBackground();
        for(int x=0; x<bg.getWidth(); x++)
        {
            for(int y=0; y<bg.getHeight()/2; y++)
            {
                Color c = bg.getColorAt(x,y);
                Color wtf = bg.getColorAt(x,bg.getHeight()-y-1);
                bg.setColorAt(x,y,wtf);
                bg.setColorAt(x,bg.getHeight()-y-1,c);
            }
        }
    }

    public void act()
    {
        if(Greenfoot.isKeyDown("1"))
        {
            fillSolidRandom();
        }
        if(Greenfoot.isKeyDown("2"))
        {
            fillRandom();
        }
        if(Greenfoot.isKeyDown("R"))
        {
            redScale();
        }
        if(Greenfoot.isKeyDown("B"))
        {
            blueScale();
        }
        if(Greenfoot.isKeyDown("G"))
        {
            greenScale();
        }
        if(Greenfoot.isKeyDown("3"))
        {
            darken();
        }
        if(Greenfoot.isKeyDown("4"))
        {
            brighten();
        }
        if(Greenfoot.isKeyDown("O"))
        {
            grayScale();
        }
        if(Greenfoot.isKeyDown("I"))
        {
            invert();
        }
        if(Greenfoot.isKeyDown("5"))
        {
            mirrorLeftToRight();
        }
        if(Greenfoot.isKeyDown("6"))
        {
            mirrorRightToLeft();
        }
        if(Greenfoot.isKeyDown("7"))
        {
            mirrorTopToBottom();
        }
        if(Greenfoot.isKeyDown("8"))
        {
            mirrorBottomToTop();
        }
        if(Greenfoot.isKeyDown("9"))
        {
            flipHorizontal();
        }
        if(Greenfoot.isKeyDown("0"))
        {
            flipVertical();
        }
        if(Greenfoot.isKeyDown("S"))
        {
            shrink();
        }
        if(Greenfoot.isKeyDown("P"))
        {
            pixelate();
        }
    }

    //CHALLENGE METHODS

    void pixelate()
    {
        GreenfootImage bg =  getBackground();
        for(int x=0; x<bg.getWidth(); x+=10)
        {
            for(int y=0; y<bg.getHeight(); y+=10)
            {
                Color c = bg.getColorAt(x,y);
                for(int x2= x-5; x2<= x+5; x2++)
                {
                    for(int y2 = y-5; y2<= y+5 ;y2++)
                    {
                        if( x2<752 && x2>0 )
                        {
                            if( y2<470 && y2>0 )
                            {
                                bg.setColorAt(x2,y2,c);
                            }
                        }
                    }
                }
            }
        }
    }

    void shrink()
    {
        GreenfootImage bg =  getBackground();
        for(int x=0; x<bg.getWidth(); x++)
        {
            for(int y=0; y<bg.getHeight(); y++)
            {
                Color c = bg.getColorAt(x,y);
                bg.setColorAt(x/2,y/2,c);
            }
        }
    }
    
    void multiscale()
    {
        GreenfootImage bg =  getBackground();
        for(int x=0; x<bg.getWidth()/2; x--)
        {
            for(int y=0; y<bg.getHeight()/2; y--)
            {
                Color notRed = bg.getColorAt(x,y);
                notRed = new Color(notRed.getRed(),0,0);

                bg.setColorAt(x,y,notRed);
            }
        }
        
        for(int x=0; (x<bg.getWidth()/2)*2; x--)
        {
            for(int y=0; y<bg.getHeight()/2; y--)
            {
                Color notGreen = bg.getColorAt(x,y);
                notGreen = new Color(0,notGreen.getGreen(),0);

                bg.setColorAt(x,y,notGreen);
            }
        }
        
        for(int x=0; (x<bg.getWidth()/2); x--)
        {
            for(int y=0; (y<bg.getHeight()/2)*2; y--)
            {
                Color notBlue = bg.getColorAt(x,y);
                notBlue = new Color(0,0,notBlue.getBlue());

                bg.setColorAt(x,y,notBlue);
            }
        }
        
        for(int x=0; (x<bg.getWidth()/2)*2; x--)
        {
            for(int y=0; (y<bg.getHeight()/2)*2; y--)
            {
                Color c = bg.getColorAt(x,y);
                int thisGray = ((c.getRed() + c.getGreen() + c.getBlue())/3);
                c = new Color(thisGray, thisGray, thisGray);

                bg.setColorAt(x,y,c);
            }
        }
    }
}
