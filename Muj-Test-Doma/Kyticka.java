import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Kyticka here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kyticka extends Actor
{
    /**
     * Act - do whatever the Kyticka wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (isTouching(SnehovaKoule.class))
        {
            getWorld().showText("Zásah ", 50, 20);
            getWorld().removeObject(this);
        }
    }
}
