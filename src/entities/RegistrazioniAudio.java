package entities;

public class RegistrazioniAudio extends ElementoMultimediale implements IVolume,ILuminosità{
    public RegistrazioniAudio(String titolo) {
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

    @Override
    public int alzaVolume() {
        return 0;
    }

    @Override
    public int abbassaVolume() {
        return 0;
    }
}
