package entities;

import interfaces.ILuminosità;
import interfaces.IVolume;

public class Video extends Riproducibile  implements IVolume, ILuminosità{

    int luminosità= 0;
    int volume = 0;

    public Video(String titolo, int durata) {
        super(titolo, durata);
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
    @Override
    public String play() {
        StringBuilder finalVideo = new StringBuilder();
        for (int i = 0; i <= durata; i++) {
            StringBuilder video = new StringBuilder();
            video.append(titolo);
            for (int j = 0; j <= volume; j++) {
                video.append('!');
                for(int z = 0; z<= luminosità; z++){
                    video.append('*');
                }
            }
            finalVideo.append(video.toString()).append("\n");;
        }
        return finalVideo.toString();
    }
}
