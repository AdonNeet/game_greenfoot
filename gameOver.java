import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gameOver extends Actor
{
    /**
     * Act - do whatever the gameOver wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Ketika mereset game ingame 
        if(Greenfoot.isKeyDown("r")){
                Greenfoot.setWorld(new MyWorld());
                // Mematikan suara latar belakang
                MyWorld.bg.stop();
        }
        
        // Agar tampilan game over di depan pipa
        getWorld().setPaintOrder(gameOver.class, base.class);
    }
}
