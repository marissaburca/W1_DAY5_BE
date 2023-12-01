package entities;

public class Immagine extends ElementoMultimediale implements ILuminosità{

    public Immagine(String titolo) {
        super(titolo);
    }

    @Override
    public int alzaLuminosità() {
        return 0;
    }

    @Override
    public int abbassaLuminosità() {
        return 0;
    }
}
