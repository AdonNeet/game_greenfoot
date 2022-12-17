import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class longPipe here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class longPipe extends Actor
{
    /**
     * Act - do whatever the longPipe wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
         // pipa panjang bergerak ke kiri
        setLocation(getX()-1,getY());
        
        // jika pipa panjang sudah berada di pojok kiri, maka pipa akan hilang
        if(getX()==0){
            MyWorld.pipe--;
            getWorld().removeObject(this);
        }
    }
}
