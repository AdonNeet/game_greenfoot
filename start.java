import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Objek yang menampilkan tampilan awal permainan
 * 
 * @contributor Bara, Dizzo
 * @version v1.0
 */
public class start extends Actor
{
    /**
     * Act - do whatever the start wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    
    public void act()
    {
        // Ketika player sudah memulai permainan akan menghilangkan objek start, d15m12y2022
        if(Greenfoot.isKeyDown("space")){
            getWorld().removeObject(this);
        }
    }
}
