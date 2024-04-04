// File: game/Question.java
package game;

public class Question {
    private String theme;
    private String[] options;
    private String correctAnswer;

    public Question(String theme, String[] options, String correctAnswer) {
        this.theme = theme;
        this.options = options;
        this.correctAnswer = correctAnswer.toUpperCase();
    }

    public String getTheme() {
        return theme;
    }

    public String[] getOptions() {
        return options;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }
}
