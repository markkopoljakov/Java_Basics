import java.util.Random;

public class Dice {
    private Random rand;
    private int sides;

    public Dice(int sides){
        this.sides = sides;
        rand = new Random();
    }
    public int roll() {
       return this.rand.nextInt(this.sides)+ 1;
    }
}
