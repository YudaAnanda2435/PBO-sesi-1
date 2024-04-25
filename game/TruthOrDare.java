// File: game/TruthOrDare.java
package game;

import java.util.Random;
import java.util.Scanner;

public class TruthOrDare {
    private Question[] questions;

    public TruthOrDare() {
        // Initialize questions
        questions = new Question[3];
        questions[0] = new Question("Musik", new String[]{"A. Pertanyaan 1", "B. Pertanyaan 2", "C. Pertanyaan 3"}, "A");
        questions[1] = new Question("Sepak Bola", new String[]{"A. Pertanyaan 4", "B. Pertanyaan 5", "C. Pertanyaan 6"}, "B");
        questions[2] = new Question("Matematika", new String[]{"A. Pertanyaan 7", "B. Pertanyaan 8", "C. Pertanyaan 9"}, "C");
    }

    public int askQuestion(int themeChoice) {
        Random random = new Random();
        @SuppressWarnings("unused")
        int pertanyaan1 = questions[0].nextLine(0); // Generates random number between 0 and 2
        Question question = questions[themeChoice - 1];
        System.out.println("Pertanyaan untuk tema '" + question.getTheme() + "':");
        for (String option : question.getOptions()) {
            System.out.println(option);
        }
        System.out.println("Pertanyaan untuk tema '" + question.getTheme() + "':");
        for (String option : question.getOptions()) {
            System.out.println(option);
        }
        System.out.print("Pilih jawaban (A/B/C): ");
        @SuppressWarnings("resource")
        String userAnswer = new Scanner(System.in).nextLine();
        if (userAnswer.equalsIgnoreCase(question.getCorrectAnswer())) {
            return 1; // Correct answer
        }
        return 0; // Incorrect answer
    }
}
