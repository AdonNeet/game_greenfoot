import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class longPipeC here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class longPipeC extends Actor
{
    /**
     * Act - do whatever the longPipeC wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // pipa panjang bergerak ke kiri dan berada di atas
        setRotation(180);
        setLocation(getX()-2,getY());
        
         // sistem penambah skore
        if((getX()==(getWorld().getWidth()/2+1)) && (MyWorld.end==false)){
            MyWorld.skore.add(1);
            // Memainkan efek suara skor bertamba
            MyWorld.tambah.play();
        }
        
        // jika pipa panjang sudah berada di pojok kiri, maka pipa akan hilang
        if(getX()==0){
            MyWorld.pipe--;
            getWorld().removeObject(this);
        }
    }
}
