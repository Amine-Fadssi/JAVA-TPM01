import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StringBuilder string = new StringBuilder();
        byte operator;

        do {
            System.out.println("""
                 -------------------------
                          MENU          \s
                 -------------------------
                | REF    | OPERATOR       |
                 -------------------------
                | 1      | saisir         |
                | 2      | afficher       |
                | 3      | inverser       |
                | 4      | Nombre de mots |
                 -------------------------
                 """);
            // Reading Operator
            do{
                System.out.print("choose l'opération à effectuer : ");
                operator =  Byte.parseByte(input.nextLine());
                if(operator!=1 && operator!=2 && operator!=3 && operator!=4)
                    System.out.println("opération invalide!");
            }while (operator!=1 && operator!=2 && operator!=3 && operator!=4);

            // Choose Operator
            switch (operator){
                case 1:
                    do{
                        System.out.print("Entrer un chaîne : ");
                        string.append(input.nextLine());
                        if(string.isEmpty())
                            System.out.println("chaîne vide!");
                    }while (string.isEmpty());
                    break;
                case 2:
                    while (string.isEmpty()){
                        System.out.print("Entrer un chaîne d'abord: ");
                        string.append(input.nextLine());
                        if(string.isEmpty())
                            System.out.println("chaîne vide!");
                    }
                    System.out.println("chaîne : "+string);
                    break;
                case 3:
                    while (string.isEmpty()){
                        System.out.print("Entrer un chaîne d'abord: ");
                        string.append(input.nextLine());
                        if(string.isEmpty())
                            System.out.println("chaîne vide!");
                    }
                    System.out.println("chaîne inversée : "+string.reverse());
                    break;
                case 4:
                    while (string.isEmpty()){
                        System.out.print("Entrer un chaîne d'abord: ");
                        string.append(input.nextLine());
                        if(string.isEmpty())
                            System.out.println("chaîne vide!");
                    }
                    String str = string.toString();
                    String[] words = str.split(" ");
                    System.out.println("nombre de mots : "+words.length);
                    break;
            }
            System.out.println("Frappez une touche pour revenir au menu ");
            input.nextLine();
        }while (true);



    }
}
