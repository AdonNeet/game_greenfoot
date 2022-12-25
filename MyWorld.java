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
    static Counter skore =  new Counter("");
    
    // init data dan attribut
    GreenfootSound bg = new GreenfootSound("backsoundgame.mp3");
    static GreenfootSound tambah = new GreenfootSound("menambahSkor.mp3");
    static GreenfootSound mati = new GreenfootSound("untukMati.mp3");
    static int level = 1;
    static int temp = 2;
    static int n = 1;
    static int pipe = n;
    int sign = 0;
    boolean start = false;
    static boolean end = false;
    
    public MyWorld()
    {    
        // Membangun dunia baru ke settingan default ketika dimulai dan di reset
        super(300,500 ,1); 
        pipe = 0; sign = 0;
        start = false; end = false;
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

        // nilai awal dari skore
        skore.setValue(0);
    }
    
    public void act(){
        // Mendeteksi permainan jika sudah dimulai
        if(Greenfoot.isKeyDown("space")){
            start = true;
            if(sign==0){
                // letak dari objek counter skore
                addObject(skore, 150, 40);
                bg.playLoop();
                sign++;
            }
        }
        
        // Respawn pipe otomatis
        if(pipe < n && start==true){  
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
                int y = Greenfoot.getRandomNumber(160);
                addObject(new longPipeC(), 300,y);
                setPaintOrder(Counter.class, longPipeC.class);
                // nilai oobjek pipe bertambah 1
                pipe++;
            }
        } 
    }
}
