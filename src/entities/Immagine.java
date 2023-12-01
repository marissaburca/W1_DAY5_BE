package entities;

import interfaces.ILuminosità;

public class Immagine extends ElementoMultimediale implements ILuminosità {

    int luminosità = 0;
    public Immagine(String titolo) {
        super(titolo);
    }

    @Override
    public int aumentaLuminosità() {
        return this.luminosità = luminosità +1;
    }

    @Override
    public int diminuisciLuminosità() {
        return this.luminosità = luminosità -1;
    }

    public String show() {
        //non avevo idea di come stampare tutto su una riga, così sapendo che show doveva
        //tornare una stringa ho cercato un metodo per manipolare le stringhe. Non sto facendo
        //ancora nulla nella classe main, vedrò dopo se ho ottenutio il risultato desiderato
        StringBuilder immagine = new StringBuilder();
        immagine.append(titolo);
        for (int i = 0; i <= luminosità; i++) {
            immagine.append('*');
        }
        return immagine.toString();
    }
}