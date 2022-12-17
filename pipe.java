import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pipe here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pipe extends Actor
{
    /**
     * Act - do whatever the pipe wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        setLocation(getX()-2,getY());
        
        if(getX()==0){
                getWorld().removeObject(this);
        }
    }
}
