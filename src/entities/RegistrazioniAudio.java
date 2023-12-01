package entities;

public class RegistrazioniAudio extends ElementoMultimediale implements IVolume,ILuminosità{
    int volume = 0;
    int luminosità = 0;
    public RegistrazioniAudio(String titolo) {
        super(titolo);
    }


    @Override
    public int alzaVolume() {
        return this.volume = volume +1;
    }

    @Override
    public int abbassaVolume() {
        return this.volume = volume -1;
    }

    @Override
    public int aumentaLuminosità() {
        return this.luminosità= luminosità + 1;
    }

    @Override
    public int diminuisciLuminosità() {
        return this.luminosità = luminosità - 1;
    }


}
