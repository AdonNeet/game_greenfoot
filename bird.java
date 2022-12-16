import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bird here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
        // Add your action code here.
        if(count == 0){
            if(Greenfoot.isKeyDown("space")){
                count++;
            }else{
                setLocation(getX(),getY());
            }
        }else{
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
    }
}
