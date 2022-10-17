import java.util.ArrayList;

public class SpelerAccount {
    private int muntenSaldo;
    private String naam;
    private String wachtwoord;
    private ArrayList<SpelerVragenlijst> vragenlijstenInBezit;

    public SpelerAccount(String spelerNaam, String wachtwoord) {
        this.naam = spelerNaam;
        this.wachtwoord = wachtwoord;
        this.vragenlijstenInBezit = new ArrayList<>();
    }

    public void voegSpelerVragenlijstToe(SpelerVragenlijst nieuweVragenlijst) {
        vragenlijstenInBezit.add(nieuweVragenlijst);
    }

    public int getMuntenSaldo() {
        return muntenSaldo;
    }

    public void setMuntenSaldo(int muntenSaldo) {
        this.muntenSaldo = muntenSaldo;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getWachtwoord() {
        return wachtwoord;
    }

    public void setWachtwoord(String wachtwoord) {
        this.wachtwoord = wachtwoord;
    }

    public ArrayList<SpelerVragenlijst> getVragenlijstenInBezit() {
        return vragenlijstenInBezit;
    }

    public void setVragenlijstenInBezit(ArrayList<SpelerVragenlijst> vragenlijstenInBezit) {
        this.vragenlijstenInBezit = vragenlijstenInBezit;
    }
}
