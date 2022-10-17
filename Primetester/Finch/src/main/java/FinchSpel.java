import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class FinchSpel {
    private String taal;
    private int huidigescore;
    private float quizVerloopTijd;
    private SpelerAccount huidigeSpeler;
    private ArrayList<SpelerAccount> geregistreerdeSpelers;
    private ArrayList<Thema> themas;
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<String> spelerAntwoorden;


    public FinchSpel() {
        this.geregistreerdeSpelers = new ArrayList<>();
        this.themas = new ArrayList<>();
    }
    public void registreer(String naamSpeler, String wachtwoord) {
        this.geregistreerdeSpelers.add(new SpelerAccount(naamSpeler, wachtwoord));
    }

    public void voegThemaToe(Thema nieuwThema) {
        themas.add(nieuwThema);
    }

    public SpelerAccount loginSpeler(String naamSpeler, String wachtwoord) {
        huidigeSpeler = geregistreerdeSpelers.stream().filter(spelerAccount -> Objects.equals(spelerAccount.getWachtwoord(), wachtwoord) && Objects.equals(spelerAccount.getNaam(), naamSpeler)).toList().get(0);
        return geregistreerdeSpelers.stream().filter(spelerAccount -> Objects.equals(spelerAccount.getWachtwoord(), wachtwoord) && Objects.equals(spelerAccount.getNaam(), naamSpeler)).toList().get(0);
    }

    public void toonBeschikbareVragenlijst() {
        System.out.println("Selecteer een vragenlijst die uw wilt gebruiken in de quiz, hier zijn uw beschikbare vragenlijsten...");
        int index = 0;
        for(SpelerVragenlijst svl : huidigeSpeler.getVragenlijstenInBezit()) {
            System.out.println(index + " - " + svl.getVragenlijst().getOnderwerp());
        }
    }

    public void stelQuizVragen(int quizIndex) {
        for(QuizVraag qv : huidigeSpeler.getVragenlijstenInBezit().get(quizIndex).getVragenlijst().getQuizVragen()) {
            System.out.println(qv.getVraag());
            stelQuizVraag(qv);
            ontvangQuizvraagAntwoord();
        }
    }

    public void stelQuizVraag(QuizVraag quizVraag) {
        System.out.println(quizVraag.getVraag());
    }

    public void ontvangQuizvraagAntwoord() {
        spelerAntwoorden.add(scanner.nextLine());
    }

    public String setActieveVragenlijstVoorQuiz() {
        return scanner.nextLine();
    }

    public void startQuiz() {
        spelerAntwoorden = new ArrayList<>();
        toonBeschikbareVragenlijst();
        int quizIndex = Integer.parseInt(setActieveVragenlijstVoorQuiz());
        stelQuizVragen(quizIndex);
        System.out.println(spelerAntwoorden.get(0));
    }
}
