import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SnehovaKoule here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SnehovaKoule extends Actor
{
    private StatecnySnehulak snehulak;
    public void act()
    {
        move(5);
        if (isAtEdge())
        {
            snehulak.odblokuj();
            getWorld().removeObject(this);
        }
    }
    public SnehovaKoule(StatecnySnehulak s)
    {
        this.snehulak = s;
    }
}