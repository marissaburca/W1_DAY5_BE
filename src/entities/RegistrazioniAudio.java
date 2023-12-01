package entities;

import interfaces.ILuminosità;
import interfaces.IVolume;

public class RegistrazioniAudio extends Riproducibile  implements IVolume{
    int volume = 5;
    public RegistrazioniAudio(String titolo, int durata) {
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
    public String play() {
        StringBuilder finalAudio = new StringBuilder();
        for (int i = 0; i <= durata; i++) {
            StringBuilder audio = new StringBuilder();
            audio.append(titolo);
            for (int j = 0; j <= volume; j++) {
                audio.append('!');
            }
            finalAudio.append(audio.toString()).append("\n");;
        }
        return finalAudio.toString();
    }
}
