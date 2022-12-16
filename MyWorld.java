import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Set up base World
 * 
 * @contributor Bara, Dizzo 
 * @version v1.1
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 300x500 cells with a cell size of 1x1 pixels.
        super(300,500 ,1); 
        prepare();
    }
    
    /**
     * Prepare create the initial objects and add them to the world.
     */
    private void prepare()
    {
        // set speed in default (50 from range 1-100), d16m12y2022
        Greenfoot.setSpeed(50);
        // init object, d15m12y2022
        start start = new start();
        addObject(start,149,261);
        bird bird = new bird();
        addObject(bird,148,309);
        base base = new base();
        addObject(base,144,495);
    }
}
