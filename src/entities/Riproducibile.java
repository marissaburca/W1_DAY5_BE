package entities;

public abstract class Riproducibile extends ElementoMultimediale {
    int durata;
    public Riproducibile(String titolo, int durata) {
        super(titolo);
        this.durata = durata;
    }


    abstract String play();
}
