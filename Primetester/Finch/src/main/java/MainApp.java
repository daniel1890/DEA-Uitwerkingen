public class MainApp {
    public static void main(String[] args) {
        FinchSpel spel = new FinchSpel();
        Thema gaming = new Thema("Gaming");
        Vragenlijst lol = new Vragenlijst("League of Legends", 50.00);
        OpenQuizVraag vraag1 = new OpenQuizVraag("Wie is de populairste champ in league of legends?");

        vraag1.voegCorrectAntwoordToe("Yasuo");
        lol.voegVraagToe(vraag1);
        gaming.voegVragenlijstToe(lol);
        spel.voegThemaToe(gaming);

        spel.registreer("daniel", "password");
        SpelerAccount speler = spel.loginSpeler("daniel", "password");
        speler.voegSpelerVragenlijstToe(new SpelerVragenlijst(lol));

        spel.startQuiz();
    }
}
