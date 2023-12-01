import entities.*;

import java.util.Arrays;
import java.util.Scanner;

public class LettoreMultimediale {
    public static void main(String[] args) {

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

        //dopo aver interagito con l'utente per la richiesta dati unico gli array e lo informo
        // di qualto sta per accadere.

        int totalLength =riproducibili.length + immagini.length;

        Object[] unionArrays = new Object[totalLength];
        System.arraycopy(riproducibili,0,unionArrays,0,riproducibili.length);
        System.arraycopy(immagini,0,unionArrays,riproducibili.length, immagini.length);

        System.out.println("Right now, u have the possibility to see what the multimedia elements do.");
        System.out.println("Type a number from 1 to 5 to start, type 0 to exit. Enjoy");

        int choosed;
        do{
            choosed = Integer.parseInt(userInput.nextLine());
            if(choosed>0 && choosed <= unionArrays.length){
                Object selected = unionArrays[choosed-1];
                if (selected instanceof Riproducibile){
                    System.out.println(((Riproducibile) selected).play());
                }else if( selected instanceof Immagine){
                    System.out.println(((Immagine) selected).show());
                }
            } else if( choosed == 0){
                System.out.println("U're now out. Thanks for participation");
            } else {
                System.out.println("Choose an accepted value!");
            }
        } while ( choosed != 0);



    }
}