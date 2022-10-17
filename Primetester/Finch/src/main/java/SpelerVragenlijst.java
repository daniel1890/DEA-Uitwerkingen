public class SpelerVragenlijst {
    private int lifeTimeBest;
    private String verloopDatum;
    private Vragenlijst vragenlijst;

    public SpelerVragenlijst(Vragenlijst vragenlijst) {
        this.vragenlijst = vragenlijst;
    }

    public Vragenlijst getVragenlijst() {
        return vragenlijst;
    }

    public void setVragenlijst(Vragenlijst vragenlijst) {
        this.vragenlijst = vragenlijst;
    }
}
