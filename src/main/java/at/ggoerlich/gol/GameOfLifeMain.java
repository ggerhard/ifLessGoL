package at.ggoerlich.gol;

/**
 * run Game of Life
 */
public class GameOfLifeMain {

    public static void main(String[] args) throws InterruptedException {
//        Game game = new RandomGame(13,100);
        Game game = new PredefinedGame();
        game.run();
    }
}
