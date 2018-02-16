import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        List<Sign> possibilities = new ArrayList<>();
        possibilities.add(new Rock());
        possibilities.add(new Scissor());
        possibilities.add(new Paper());
        Player randomPlayer = new Player(true, possibilities, null);
        Player rockPlayer = new Player(false, possibilities, new Rock());
        Game game = new Game(randomPlayer, rockPlayer);

        for(int i = 0; i<100; i++){
            game.play();
        }
        game.printScore();
    }
}
