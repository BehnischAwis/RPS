public class Game {
    private Player player1;
    private Player player2;
    private int countWinPlayer1;
    private int countWinPlayer2;

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        countWinPlayer1 = 0;
        countWinPlayer2 = 0;
    }

    public void play(){
        Sign signPlayer1 = player1.getSign();
        Sign signPlayer2 = player2.getSign();

        if(signPlayer1.equals(signPlayer2)){
            return;
        }

        if(signPlayer1.wins(signPlayer2)){
            countWinPlayer1++;
        }else{
            countWinPlayer2++;
        }
    }

    public void printScore(){
        System.out.println("Player1 has "+countWinPlayer1+" wins.");
        System.out.println("Player2 has "+countWinPlayer2+" wins.");
    }
}
