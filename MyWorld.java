import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 */
public class MyWorld extends World
{

    /**

     */
    public MyWorld()
    {    
        super(900, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Player player = new Player();
        addObject(player,57,335);
        Enemy1 enemy1 = new Enemy1();
        addObject(enemy1,843,318);
        Enemy2 enemy2 = new Enemy2();
        addObject(enemy2,865,40);
        player.setLocation(69,328);
        player.setLocation(69,328);
        player.setLocation(64,328);
        player.setLocation(397,510);
        player.setLocation(397,510);
        enemy1.setLocation(867,318);
        enemy1.setLocation(845,320);
        enemy1.setLocation(239,35);
        enemy2.setLocation(503,19);
    }
}
