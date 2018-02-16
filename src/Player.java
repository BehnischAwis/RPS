import java.util.List;
import java.util.Random;

public class Player {
    private List<Sign> possibilities;
    private boolean random;
    private Sign sign;

    public Player(boolean random, List<Sign> possibilities, Sign sign){
        this.random = random;
        this.possibilities = possibilities;
        this.sign = sign;
    }

    public Sign getSign(){
        if(random){
            Random random = new Random();
            int index = random.nextInt(3);
            return possibilities.get(index);
        }else{
            return sign;
        }
    }
}
