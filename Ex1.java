import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int size;
        float[] notes;
        float targetNote;
        float sum = 0;
        int count = 0;

        // reading size
        do {
            System.out.print("Entrez la taille : ");
            size = input.nextInt();
            if (size <= 0)
                System.out.println("taille invalide!");
        } while (size <= 0);
        notes = new float[size];

        // reading notes
        for (int i = 0; i < size; i++) {
            float note;
            do {
                System.out.print("Saisir la note de l'étudiant " + (i + 1) + " : ");
                note = input.nextFloat();
                if (note < 0 || note > 20)
                    System.out.println("note invalide!");
            } while (note < 0 || note > 20);
            notes[i] = note;
        }

        // sort & display
        Arrays.sort(notes);
        System.out.println("\n[Note des étudiants triée]");
        for (float note : notes) {
            System.out.println(note);
        }

        // average
        for (float note : notes)
            sum += note;
        System.out.println("\n[Moyenne des étudiants]\n" + sum / size);

        // max note
        System.out.println("\n[Note maximale des étudiants]\n" + notes[size - 1]);

        // min note
        System.out.println("\n[Note minimale des étudiants]\n" + notes[0]);

        // occurrences of a note
        do {
            System.out.print("\nEntrez la note ciblée : ");
            targetNote = input.nextFloat();
            if (targetNote < 0 || targetNote > 20)
                System.out.println("note invalide!");
        } while (targetNote < 0 || targetNote > 20);
        for (float note : notes) {
            if (note == targetNote)
                count++;
        }
        System.out.println("\n[Nombre d'étudiants ayant la note '" + targetNote + "'] " + count);

        // Close the scanner
        input.close();
    }
}