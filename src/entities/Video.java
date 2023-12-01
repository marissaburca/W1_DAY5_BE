package entities;

import interfaces.ILuminosità;
import interfaces.IVolume;

public class Video extends Riproducibile implements IVolume, ILuminosità {
    /*
    Questa classe è in realtà una classe nipote, che ha come nonno ElementoMultimediale e come
    padre Riproducibile. Quindi eredita da entrambi. Questo perchè video e Audio hanno in comune un attributo,
    che è la durata, che però non è comune a Immagine, quindi essa non poteva stare nella classe del nonno,
    ed è stata dichiarata in un'altra classe abstract, che diventa così genitore di video e Audio.
     */

    int luminosità;

    //Dichiaro gli attributi senza valore iniziale (me li fornirà l'utente)
    int volume;

    //Creo un costruttore anche quì che riceve un titolo, una durata, un volume e la luminosità sempre dall'utente!

    public Video ( String titolo, int durata, int volume, int luminosità ) {
        super(titolo, durata); //Richiamo costruttore del padre, che non è più ElementoMultimediale ma Riproducibile
        this.volume = volume;
        this.luminosità = luminosità;
    }

    /*
    Seguono una serie di override, i primi 4 sono obbligatori perchè abbiamo implementato le interfacce,
    l'ultimo invece riguarda il metodo play() fornitoci da Riproducibile poichè era comune anche ad Audio.
     */

    @Override
    public int alzaVolume () {
        return this.volume = volume + 1;
    }

    @Override
    public int abbassaVolume () {
        return this.volume = volume - 1;
    }

    @Override
    public int aumentaLuminosità () {
        return this.luminosità = luminosità + 1;
    }

    @Override
    public int diminuisciLuminosità () {
        return this.luminosità = luminosità - 1;
    }

    /*
    Questo override è simile al metodo show() di immagine, perchè fondamentalmente fanno la stessa cosa,
    l'unica differenza stà nel fatto che abbiamo un ciclo for in più che deve prendere in considerazione
    anche il volume.
     */
    @Override
    public String play () {
        StringBuilder finalVideo = new StringBuilder();
        if (durata > 0 && volume > 0 && luminosità > 0){
            for (int i = 1; i <= durata; i++) {
                StringBuilder video = new StringBuilder();
                video.append(titolo);
                for (int j = 1; j <= volume; j++) {
                    video.append('!');
                }
                for (int z = 1; z <= luminosità; z++) {
                    video.append('*');
                }
                finalVideo.append(video.toString()).append("\n");
                ;
            }
        }else{
            System.out.println("Numbers can't have negative value. Try again!");
        }
        return finalVideo.toString();
    }
}
