import java.util.Arrays;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String string;
        int[] nb_occurrences = new int[26];

        // Reading String
        do{
            System.out.print("Entrer une chaîne : ");
            string = input.nextLine();
            if(string.isEmpty()) System.out.println("chaîne vide!");
        }while (string.isEmpty());

        // Store and Count occurrences
        for (int i = 0; i < string.length(); i++) {
            int index = ((int)string.charAt(i)-65)%32;
            if (index>26||index<0)
                continue;
            nb_occurrences[index]++;
        }

        // Display occurrences
        System.out.println("La chaîne \""+string+"\" contient :");
        for (int i = 0; i < nb_occurrences.length; i++) {
            char character = (char) ((char)i+65);
            if(nb_occurrences[i]!=0)
                System.out.println(nb_occurrences[i]+" fois la lettre '"+character+"'");
        }

    }
}
