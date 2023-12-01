package entities;

import interfaces.ILuminosità;

public class Immagine extends ElementoMultimediale implements ILuminosità {
    /*
    Classe concreta che servirà al main, deve essere public ed estendere la classe abstracted.
    Inoltre deve implementare l'interfaccia della luminosità.
     */


    int luminosità; //Dichiaro la luminosità che non ha valore iniziale perché lo chiederò all'utente



    /*
    Creo un costruttore della classe, a cui attribuisco due parametri necessari alla sua creazione
     */

    public Immagine(String titolo, int luminosità) {
        super(titolo); //Richiamo il costruttore di ElementoMuòtimediale.
        this.luminosità= luminosità; //Assegna un valore a luminosità.
    }

    @Override
    public int aumentaLuminosità() {
        return this.luminosità = luminosità + 1;
    }

    /*
    Le interfacce mi obbligano a sovrascriverne i metodi, assegnandogli comportamenti specifici in
    funzione di dove si trovano.
     */


    @Override
    public int diminuisciLuminosità() {
        return this.luminosità = luminosità -1;
    }

    public String show() {
        /*
        So che questo metodo deve tornarmi una stringa e lo assegno come tipo al metodo.
        StringBuilder è una classe/oggetto java che permette di apportare modifiche ad una sequenza di caratteri.
        In pratica devo immaginare di avere una striga che è vuota, e gli appendo immediatamente il titolo,con un
        ciclo for appendo tanti asterischi quanto è il valore della luminosità.
        Nel CICLO AVVIO IL CONTEGGIO DA 1, altrimenti anche per lo 0 lui appende un *.
        Essendo una classe che ha una stringa come valore di ritorno, faccio un return dell'oggetto appena
        costruito a cui aggiungo il metodo toString.
         */

        StringBuilder immagine = new StringBuilder();
        immagine.append(titolo);
        for (int i = 1 ; i <= luminosità; i++) {
            immagine.append('*');
        }
        return immagine.toString();
    }

}