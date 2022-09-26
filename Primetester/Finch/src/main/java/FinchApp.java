public class FinchApp {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();
        FinchSpel spel = new FinchSpel();
        Medewerker medewerker = new Medewerker();



        Speler speler1 = new Speler();
        quiz.Speel(speler1);
    }
}
