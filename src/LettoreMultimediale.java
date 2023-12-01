import entities.*;

import java.util.Scanner;

public class LettoreMultimediale {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("This is a Media player. Set up the info needed to make it work.Let's go!");

        System.out.println("This is a video, choose its name and duration (expressed in number)");
        String video1= userInput.nextLine();
        int duration1 = Integer.parseInt(userInput.nextLine());

        System.out.println("This is another video, choose its name and duration (expressed in number)");
        String video2= userInput.nextLine();
        int duration2 = Integer.parseInt(userInput.nextLine());

        System.out.println("This is another video, choose its name and duration (expressed in number)");
        String audio= userInput.nextLine();
        int durationAudio = Integer.parseInt(userInput.nextLine());

        Riproducibile[] riproducibili = {
                new Video(video1,duration1),
                new Video(video2, duration2),
                new RegistrazioniAudio(audio, durationAudio)
        };

        System.out.println("This is an image, choose its name and brightness (expressed in number)");
        String image1= userInput.nextLine();
        int brightness1 = Integer.parseInt(userInput.nextLine());

        System.out.println("This is another video, choose its name and  brightness (expressed in number)");
        String image2= userInput.nextLine();
        int brightness2 = Integer.parseInt(userInput.nextLine());

        Immagine[] immagini={
                new Immagine(image1, brightness1),
                new Immagine(image2, brightness2)
        };

        //dopo aver interagito con l'utente per la richiesta dati unico gli array e lo informo
        // di qualto sta per accadere.

        Object[] unionArrays = new Object[riproducibili.length + immagini.length];

        System.out.println("Right now, u have the possibility to see what the multimedia elements do.");
        System.out.println("Type a number from 1 to 5 to start, type 0 to exit. Enjoy");

        int choosed;
        do{
            choosed = Integer.parseInt(userInput.nextLine());
            if(choosed>0 && choosed <= unionArrays.length){
                Object choosedElement = unionArrays[choosed - 1];
                if (choosedElement instanceof Riproducibile){
                    ((Riproducibile) choosedElement).play();
                }
            }
        }



    }
}