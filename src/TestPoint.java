import java.util.Scanner;
class TestPoint{
    public static void main (String args [] ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir x :");
        int x = sc.nextInt();
        System.out.println("Veuillez saisir y :");
        int y = sc.nextInt();
        sc.close();
        Point p = new Point(x,y);
        p.deplacer(5,3);
        p.afficher();
    }
}
//new Scanner(System.in) : Vous créez une nouvelle instance de Scanner qui prend System.in comme source d'entrée. System.in est un flux d'entrée standard qui lit les données du clavier.
//Paramètre System.in :
//
//System.in : C'est un flux d'entrée standard utilisé pour lire les données d'entrée fournies par l'utilisateur via le clavier. C'est un objet de type InputStream.
//

//Explication des méthodes de Scanner
//next() : Lit le prochain mot (jusqu'à un espace, une tabulation ou une nouvelle ligne).
//        nextLine() : Lit la ligne entière (jusqu'à une nouvelle ligne).
//        nextInt() : Lit le prochain entier. Vous devez gérer les exceptions si l'entrée n'est pas valide.
//nextDouble() : Lit le prochain nombre à virgule flottante.
//nextLong() : Lit le prochain long.
//nextFloat() : Lit le prochain float.
//nextBoolean() : Lit le prochain booléen.
//hasNextInt() : Vérifie si la prochaine entrée est un entier.
//hasNextDouble() : Vérifie si la prochaine entrée est un nombre à virgule flottante.
//hasNextLong() : Vérifie si la prochaine entrée est un long.
//hasNextFloat() : Vérifie si la prochaine entrée est un float.
//hasNextBoolean() : Vérifie si la prochaine entrée est un booléen.
//nextLine() : Utilisée après next() pour consommer la ligne restante.