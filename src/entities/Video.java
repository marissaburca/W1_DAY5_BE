package entities;

public class Video extends ElementoMultimediale implements IVolume,ILuminosità {

    int luminosità= 0;
    int volume = 0;

    public Video(String titolo) {
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
