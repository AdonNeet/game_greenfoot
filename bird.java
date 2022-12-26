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
                setRotation(-25);
            }
            else{
                setLocation(getX(),getY()+3);  
                setRotation(25);
            }
      
        }
        
        if(isTouching(base.class) || isTouching(longPipe.class) || isTouching(longPipeC.class)){
            // Menampilkan gambar GameOver
            getWorld().addObject(new gameOver(), getWorld().getWidth()/2, getWorld().getHeight()/2);
            
            // Memainkan efek suara mati
            MyWorld.mati.play();
            // menandakan bahwa game sudah berakhir
            MyWorld.end = true;
            
            // Menghilangkan object burung
            getWorld().removeObject(this);
        }
    }
}
