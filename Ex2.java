import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String verbe = "";
        String[] pronoms = {"je","tu","il","nous","vous","ils"};
        String[] terminaisons = {"e","es","e","ons","ez","ent"};

        // Reading Verbe
        do{
            System.out.print("Entrer un verbe du premier groupe : ");
            verbe = input.nextLine();
            if(verbe.isEmpty()) System.out.println("chaîne vide!");
            else if(!verbe.endsWith("er")) System.out.println("verbe invalide!");
        }while (verbe.isEmpty() || !verbe.endsWith("er"));

        // display Conjugaison
        System.out.println("\n[La Conjugaison au présent de '"+verbe+"']\n");
        for (int i = 0; i < 6; i++) {
            System.out.println(pronoms[i]+"  "+verbe.substring(0,verbe.length()-2)+terminaisons[i]);
        }
    }
}
