public abstract class QuizVraag {
    private String vraag;

    public QuizVraag(String vraag) {
        this.vraag = vraag;
    }
    public String getVraag() {
        return vraag;
    }

    public void setVraag(String vraag) {
        this.vraag = vraag;
    }
}
