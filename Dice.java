import java.util.Random;

public class Dice 
{
    private static final int SIDES = 6;
    private Random rand = new Random();

    public int roll() 
    {
        return rand.nextInt(SIDES) + 1;
    }
}
