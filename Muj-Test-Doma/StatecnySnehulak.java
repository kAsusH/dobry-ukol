import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StatecnySnehulak here.
 * 
 * @author (Pavel Bočáň) 
 * @version (28.4.2026)
 */
public class StatecnySnehulak extends Actor
{
    private boolean zablokovanoHazeni = false;
    public void act()
    {
        MouseInfo mi = Greenfoot.getMouseInfo();
        if (mi != null)
        {
            int X = mi.getX();
            int Y = mi.getY();
            this.turnTowards( X, Y);        
        }
        pokusOHod(); 
    }
    public void pokusOHod()
    {
        if (Greenfoot.isKeyDown("space"))
        {
            if (!zablokovanoHazeni)
            {
                SnehovaKoule koule = new SnehovaKoule(this);
                getWorld().addObject(koule,getX(), getY());
                koule.setRotation(getRotation());
                zablokovanoHazeni = true;
            }
        }
    }
    public void odblokuj()
    {
        zablokovanoHazeni = false;
    }
}
