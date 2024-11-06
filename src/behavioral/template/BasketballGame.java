package behavioral.template;

// Concrete class for a basketball game
public class BasketballGame extends Game {
    @Override
    protected void initialize() {
        System.out.println("Basketball game initialized. Ready to play!");
    }

    @Override
    protected void startPlay() {
        System.out.println("Basketball game started. Enjoy the game!");
    }

    @Override
    protected void endPlay() {
        System.out.println("Basketball game finished.");
    }
}
