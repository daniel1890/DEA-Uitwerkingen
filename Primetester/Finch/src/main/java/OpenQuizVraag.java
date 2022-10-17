import java.util.ArrayList;

public class OpenQuizVraag extends QuizVraag {
    ArrayList<String> correcteAntwoorden;
    public OpenQuizVraag(String vraag) {
        super(vraag);
        this.correcteAntwoorden = new ArrayList<>();
    }

    public void voegCorrectAntwoordToe(String correctAntwoord) {
        this.correcteAntwoorden.add(correctAntwoord);
    }
}
