package entities;

import interfaces.ILuminosità;
import interfaces.IVolume;

public class RegistrazioniAudio extends Riproducibile  implements IVolume{

    /*
    Questa classe è quasi identica a quella del Video, la sola differenza sta nei parametri che il costruttore riceve.
    Qui ce n'è uno in meno. Ha ElementoMultimediale come nonno e Riproducibile come padre.
     */
    int volume;
    public RegistrazioniAudio(String titolo, int durata, int volume) {
        super(titolo, durata);
        this.volume= volume;
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
        for (int i = 1; i <= durata; i++) {
            StringBuilder audio = new StringBuilder();
            audio.append(titolo);
            for (int j = 1; j <= volume; j++) {
                audio.append('!');
            }
            finalAudio.append(audio.toString()).append("\n");;
        }
        return finalAudio.toString();
    }
}
