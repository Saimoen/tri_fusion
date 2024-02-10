import java.util.Scanner;

public class main {

    public static void main(final String[] args)
    {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("------------- TRI FUSION -------------");
            int[] tableauExemple = {38, 27, 43, 3, 9, 82, 10};
            int[] tableauTrie = tri_fusion.Tri_Fusion(tableauExemple);
            for (int element : tableauTrie) {
                System.out.print(element + " ");
            }
            System.out.println(); // Pour ajouter une nouvelle ligne à la fin


            System.out.println("------------- TRI FUSION -------------");
            System.out.print("Veuillez saisir la taille du tableau : ");
            int taille = scanner.nextInt();

            int[] tableau = new int[taille];

            // Demander à l'utilisateur de saisir les éléments du tableau
            System.out.println("Veuillez saisir les éléments du tableau : ");
            for (int i = 0; i < taille; i++) {
                System.out.print("Élément " + (i + 1) + " : ");
                tableau[i] = scanner.nextInt();
            }

            // Appeler la méthode Tri_Fusion avec le tableau saisi
            int[] tableauTrie2 = tri_fusion.Tri_Fusion(tableau);

            // Afficher le tableau trié
            System.out.print("Tableau trié : ");
            for (int element : tableauTrie2) {
                System.out.print(element + " ");
            }
            System.out.println(); // Pour ajouter une nouvelle ligne à la fin
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
