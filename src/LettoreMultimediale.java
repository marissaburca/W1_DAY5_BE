import entities.*;

import java.util.Arrays;
import java.util.Scanner;

public class LettoreMultimediale {
    public static void main(String[] args) {

        /*
        Qusta classe da inizio all'esecuzione del programma. Il metodo main è il primo ad essere chiamato
        quando si avvia un'applicazione JAVA

        Quello che farò adesso sara avviare uno scanner per pemettere allo user di fornirmi i dati utili
        all'esecuzione.

        Dato che ho bisogno di più dati guido l'utente durante l'inserimento con dei print
         */

        Scanner userInput = new Scanner(System.in);
        System.out.println("This is a Media player. Set up the info needed to make it work.Let's go!");

        System.out.println("This is a video, choose its name, duration, volume and brightness (last 3 expressed in number)");
        String video1= userInput.nextLine();
        int duration1 = Integer.parseInt(userInput.nextLine());
        int volum1 = Integer.parseInt(userInput.nextLine());
        int brightness1 = Integer.parseInt(userInput.nextLine());

        System.out.println("This is another video, choose its name, duration, volume and brightness (last 3 expressed in number)");
        String video2= userInput.nextLine();
        int duration2 = Integer.parseInt(userInput.nextLine());
        int volum2 = Integer.parseInt(userInput.nextLine());
        int brightness2 = Integer.parseInt(userInput.nextLine());

        System.out.println("This is an audio choose its name, duration and volume (last 2expressed in number)");
        String audio= userInput.nextLine();
        int durationAudio = Integer.parseInt(userInput.nextLine());
        int volum3 = Integer.parseInt(userInput.nextLine());

        Riproducibile[] riproducibili = {
                new Video(video1,duration1, volum1,brightness1),
                new Video(video2, duration2, volum2, brightness2),
                new RegistrazioniAudio(audio, durationAudio, volum3)
        };

        /*
        Ho prelevato di dati, tenendoli stringa dove mi servivano e convertendoli col parseInt qualora
        dovessi ricevere numeri. In seguito ho crato un array di oggetti 'riproducibili', istanziati
        con i dati ricevuti.
         */

        System.out.println("This is an image, choose its name and brightness (expressed in number)");
        String image1= userInput.nextLine();
        int brightness3 = Integer.parseInt(userInput.nextLine());

        System.out.println("This is another video, choose its name and  brightness (expressed in number)");
        String image2= userInput.nextLine();
        int brightness4 = Integer.parseInt(userInput.nextLine());

        Immagine[] immagini={
                new Immagine(image1, brightness3),
                new Immagine(image2, brightness4)
        };

        /*
        Ho ripetuto il processo precedente per istanziare anche le immagini. Dopo aver interagito con l'utente
        per la richiesta dati, unisco gli array e lo informo di qualto sta per accadere.
         */

        //sommo le lunghezze degli array
        int totalLength =riproducibili.length + immagini.length;

        //unisco gli array in un array di oggetti

        Object[] unionArrays = new Object[totalLength];

        //i parametri sono gli array da copiare, quello di destinazione, la nuova lunghezza e il punto di partenza

        System.arraycopy(riproducibili,0,unionArrays,0,riproducibili.length);
        System.arraycopy(immagini,0,unionArrays,riproducibili.length, immagini.length);

        System.out.println("Right now, u have the possibility to see what the multimedia elements do.");
        System.out.println("Type a number from 1 to 5 to start, type 0 to exit. Enjoy");

        /*
        Ora dichiaro una costante senza valore, perchè l'utente ancora non l'ha inserito e faccio un ciclo do/while.
        Nel do comincio a fare il parseInt del numero digitato, poi verifico che esso sia maggiore di zero e al contempo
        minore o uguale alla lughezza del mio array. Dato che gli array hanno indici che partono da 0, prima di passare
        l'array all'if passo come indice il valore digitato da utente - 1.
         */

        int choosed;
        do{
            choosed = Integer.parseInt(userInput.nextLine());
            if(choosed>0 && choosed <= unionArrays.length){
                Object selected = unionArrays[choosed-1];
                if (selected instanceof Riproducibile){
                    System.out.println(((Riproducibile) selected).play()); //eseguo cast
                }else if( selected instanceof Immagine){
                    System.out.println(((Immagine) selected).show()); //eseguo cast
                }
            } else if( choosed == 0){
                System.out.println("U're now out. Thanks for participation");
            } else {
                System.out.println("Choose an acceptable value!");
            }
        } while ( choosed != 0);

        /*
        Il casting era necessariio perchè quando ho unito gli array ho dato a tutti i riproducibili e immagine
        un tipo diverso, che era object.
         */

    }
}