package entities;

abstract class ElementoMultimediale {
    /*
    Ogni elemento (immagine, video, audio) è anche un elemento multimediale, di conseguenza,
    hanno una classe abstract comune, che non può essere istanziata direttamente, ma può fare da base
    facendo ereditare alle sue sottoclassi attributi e metodi.
     */

    protected String titolo; //Dichiaro un titolo senza valore iniziale.

    public ElementoMultimediale ( String titolo ) { //Dichiaro un costruttore che prende come parametro il titolo
        this.titolo = titolo;
    }
}
