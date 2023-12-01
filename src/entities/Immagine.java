package entities;

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

    public void show(){

    }
}