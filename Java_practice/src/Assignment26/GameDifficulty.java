package Assignment26;

enum Difficulty {
    EASY, MEDIUM, HARD
}

class Game {
    private final int bullets;

    public Game(Difficulty difficulty) {
        switch (difficulty) {
            case EASY:
                bullets = 3000;
                break;
            case MEDIUM:
                bullets = 2000;
                break;
            case HARD:
                bullets = 1000;
                break;
            default:
                bullets = 1000; // Fallback
        }
        System.out.println("Game initialized with " + bullets + " bullets for " + difficulty);
    }
}

public class GameDifficulty {
    public static void main(String[] args) {
        new Game(Difficulty.EASY);
        new Game(Difficulty.MEDIUM);
        new Game(Difficulty.HARD);
    }
}