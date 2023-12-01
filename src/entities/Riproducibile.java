package entities;

public abstract class Riproducibile extends ElementoMultimediale {
    /*
    Questa è una classe abstract figlia di ElementoMultimediale poichè ne richiamo il costruttore. Quì viene
    dichiarato l'attributo durata senza valore iniziale, ed il metodo play(), di modo che audio e video li possano
    ereditare.
     */
    int durata;

    //Questo è il costruttore della classe Riconducibile,
    public Riproducibile(String titolo, int durata) {
        super(titolo); //Chiamo costruttore di ElementoMultimediale
        this.durata = durata;
    }


    public abstract String play();
}
