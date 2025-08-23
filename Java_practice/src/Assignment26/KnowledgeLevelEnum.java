package Assignment26;

enum KnowledgeLevel {
    BEGINNER, ADVANCED, PROFESSIONAL, MASTER;

    public static KnowledgeLevel fromScore(int score) {
        if (score < 0) throw new IllegalArgumentException("Score cannot be negative");
        if (score <= 3) return BEGINNER;
        else if (score <= 6) return ADVANCED;
        else if (score <= 9) return PROFESSIONAL;
        else return MASTER;
    }
}

public class KnowledgeLevelEnum {
    public static void main(String[] args) {
        // Test boundary conditions
        int[] scores = {0, 3, 4, 6, 7, 9, 10};
        for (int score : scores) {
            try {
                KnowledgeLevel level = KnowledgeLevel.fromScore(score);
                System.out.println("Score " + score + ": " + level);
            } catch (IllegalArgumentException e) {
                System.out.println("Error for score " + score + ": " + e.getMessage());
            }
        }
    }
}