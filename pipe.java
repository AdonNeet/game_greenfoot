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
        // pipa bergerak ke kiri
        setLocation(getX()-1,getY());
        
        // jika pipa sudah berada di pojok kiri, maka pipa akan hilang
        if(getX()==0){
            MyWorld.pipe--;
            getWorld().removeObject(this);
        }
    }
}
