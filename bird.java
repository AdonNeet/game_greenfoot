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
        
        if(isTouching(base.class) || isTouching(longPipe.class) || isTouching(longPipeC.class)){
            // Menampilkan gambar GameOver dan memposisikan letaknya
            getWorld().addObject(new gameOver(), getWorld().getWidth()/2, getWorld().getHeight()/2);
            getWorld().setPaintOrder(gameOver.class, base.class);
            
            // menandakan bahwa game sudah berakhir
            MyWorld.end = true;
            
            // Menghilangkan object burung
            getWorld().removeObject(this);
        }
    }
}
