import java.util.ArrayList;

public class Vragenlijst {
    private String onderwerp;
    private double aankoopPrijs;
    private ArrayList<QuizVraag> quizVragen;

    public Vragenlijst(String onderwerp, double aankoopPrijs) {
        this.onderwerp = onderwerp;
        this.aankoopPrijs = aankoopPrijs;
        this.quizVragen = new ArrayList<>();
    }

    public void voegVraagToe(QuizVraag nieuweVraag) {
        this.quizVragen.add(nieuweVraag);
    }

    public String getOnderwerp() {
        return onderwerp;
    }

    public void setOnderwerp(String onderwerp) {
        this.onderwerp = onderwerp;
    }

    public double getAankoopPrijs() {
        return aankoopPrijs;
    }

    public void setAankoopPrijs(double aankoopPrijs) {
        this.aankoopPrijs = aankoopPrijs;
    }

    public ArrayList<QuizVraag> getQuizVragen() {
        return quizVragen;
    }

    public void setQuizVragen(ArrayList<QuizVraag> quizVragen) {
        this.quizVragen = quizVragen;
    }
}
