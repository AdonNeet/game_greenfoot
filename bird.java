import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Objek utama yang dimainkan oleh pemain
 * 
 * @contributor Bara, Dizzo
 * @version v1.0
 */
public class bird extends Actor
{   
    /**
     * Act - do whatever the bird wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int count = 0;
    public void act()
    {
        // Ketika player belum memulai game, d15m12y2022
        if(count == 0){
            if(Greenfoot.isKeyDown("space")){
                count++;
            }else{
                setLocation(getX(),getY());
            }
        }else{ //Ketika player sudah memulai game, d15m12y2022
            if(Greenfoot.isKeyDown("space")){
                setLocation(getX(),getY()-4);
                setRotation(-45);
            }
            else{
                setLocation(getX(),getY()+3);
                Greenfoot.delay(1);
                setRotation(45);
            }        
        }
        
        if(isTouching(base.class)){
            getWorld().addObject(new gameOver(), getWorld().getWidth()/2, getWorld().getHeight()/2);
            Greenfoot.stop();
        }
        
        if(Greenfoot.isKeyDown("r")){
                Greenfoot.start();
        }
    }
}
