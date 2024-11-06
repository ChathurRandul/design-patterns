package behavioral.template;

/*
Defines the skeleton of an algorithm in a method, deferring some steps to subclasses.
This allows subclasses to redefine specific steps of an algorithm without changing its structure.
*/

// Usage
public class Main {
    public static void main(String[] args) {
        Game soccerGame = new SoccerGame();
        soccerGame.play();

        System.out.println();

        Game basketballGame = new BasketballGame();
        basketballGame.play();
    }
}
