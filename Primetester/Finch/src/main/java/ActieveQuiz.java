import java.util.ArrayList;

public class ActieveQuiz {
    private float quizVerloopTijd;
    private int huidigescore;
    private SpelerAccount huidigeSpeler;
    private ArrayList<String> spelerAntwoorden;

    public float getQuizVerloopTijd() {
        return quizVerloopTijd;
    }

    public void setQuizVerloopTijd(float quizVerloopTijd) {
        this.quizVerloopTijd = quizVerloopTijd;
    }

    public int getHuidigescore() {
        return huidigescore;
    }

    public void setHuidigescore(int huidigescore) {
        this.huidigescore = huidigescore;
    }

    public SpelerAccount getHuidigeSpeler() {
        return huidigeSpeler;
    }

    public void setHuidigeSpeler(SpelerAccount huidigeSpeler) {
        this.huidigeSpeler = huidigeSpeler;
    }

    public ArrayList<String> getSpelerAntwoorden() {
        return spelerAntwoorden;
    }

    public void setSpelerAntwoorden(ArrayList<String> spelerAntwoorden) {
        this.spelerAntwoorden = spelerAntwoorden;
    }
}
