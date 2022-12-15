import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

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
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(300,500 ,1); 
        prepare();
    }
    
    /**
     * Prepare create the initial objects and add them to the world.
     */
    private void prepare()
    {
        start start = new start();
        addObject(start,149,261);
        bird bird = new bird();
       addObject(bird,148,309);
        base base = new base();
        addObject(base,144,495);
    }
}
