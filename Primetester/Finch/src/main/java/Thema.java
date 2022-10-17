import java.util.ArrayList;

public class Thema {
    private String themaNaam;
    private ArrayList<Vragenlijst> vragenlijsten;

    public Thema(String themaNaam) {
        this.themaNaam = themaNaam;
        this.vragenlijsten = new ArrayList<>();
    }

    public void voegVragenlijstToe(Vragenlijst nieuweVragenlijst) {
        vragenlijsten.add(nieuweVragenlijst);
    }
}
