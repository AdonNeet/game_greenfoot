import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Set up base World
 * 
 * @contributor Bara, Dizzo 
 * @version v1.1
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    static int pipe = 0;
    boolean start = false; 
    public MyWorld()
    {    
        // Membangun dunia baru ke settingan default ketika dimulai dan di reset
        super(300,500 ,1); 
        pipe = 0; 
        start = false;
        prepare();
    }
    
    /**
     * Prepare create the initial objects and add them to the world.
     */
    private void prepare()
    {
        // set speed in default (50 from range 1-100), d16m12y2022
        Greenfoot.setSpeed(50);
        // init object, d15m12y2022
        start start = new start();
        addObject(start,149,261);
        bird bird = new bird();
        addObject(bird,148,309);
        base base = new base();
        addObject(base,144,495);
    }
    
    public void act(){
        // Mendeteksi permainan jika sudah dimulai
        if(Greenfoot.isKeyDown("space")){
            start = true;   
        }
        
        // Respawn pipe otomatis
        if(pipe < 1 && start==true){  
        int gacha = Greenfoot.getRandomNumber(2);
            if(gacha == 1){
                // set koordinat spawn objek di bawah dan letak pipe
                int y = Greenfoot.getRandomNumber(150)+350;
                addObject(new longPipe(), 300,y);
                setPaintOrder(base.class, longPipe.class);
            
                // nilai oobjek pipe bertambah 1
                pipe++;
            }else{
                // set koordinat spawn objek di atas dan letak pipe
                int y = Greenfoot.getRandomNumber(190);
                addObject(new longPipeC(), 300,y);
                // nilai oobjek pipe bertambah 1
                pipe++;
            }
        } 
    }
}
