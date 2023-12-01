package entities;

public class Video extends ElementoMultimediale implements IVolume,ILuminosità {
    public Video(String titolo) {
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
