package behavioral.template;

// Concrete class for a soccer game
public class SoccerGame extends Game {
    @Override
    protected void initialize() {
        System.out.println("Soccer game initialized. Ready to play!");
    }

    @Override
    protected void startPlay() {
        System.out.println("Soccer game started. Enjoy the game!");
    }

    @Override
    protected void endPlay() {
        System.out.println("Soccer game finished.");
    }
}
