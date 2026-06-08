import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    List<Kyticka> seznamKyticek = new ArrayList<>();
    int casovac = 0;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        pripravKyticky();  
        prepare();
    }
    private void pripravKyticky()
    {
        for (int i=0; i<40;i++)
        {
            seznamKyticek.add(new Kyticka());
        }
    }
    private void prepare()
    {
        StatecnySnehulak statecnySnehulak = new StatecnySnehulak();
        addObject(statecnySnehulak, getWidth()/2,300);
    }
    public void umistiKyticku()
    {
        if (!seznamKyticek.isEmpty())
        {
            Kyticka k = seznamKyticek.remove(0);
            int X = Greenfoot.getRandomNumber(getWidth());
            int Y = Greenfoot.getRandomNumber(getHeight());
            addObject(k, X, Y);
        }
    }
    public void act()
    {
        casovac++;
        if (casovac > 50)
        {
            umistiKyticku();
            casovac = 0; 
        }
    }
}
