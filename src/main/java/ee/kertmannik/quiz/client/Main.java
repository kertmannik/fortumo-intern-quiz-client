package ee.kertmannik.quiz.client;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        PlayerGreeting PlayerGreeting = new PlayerGreeting();

        String username = PlayerGreeting.getPlayerName();
        PlayerGreeting.greetPlayer(username);

        try {
            QuizController quizController = new QuizController(username);
            quizController.startTheGame();
        } catch (QuizException exception) {
            System.out.println("\n" + exception.getMessage());
        }
    }
}
