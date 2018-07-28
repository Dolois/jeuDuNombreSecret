import java.util.Scanner;

public class Application {
	
	/* Jeu du Nombre Secret
	 * 
	 * Au début, l'ordinateur propose un numéro entre 1 et 1000.
	 * Le choix est fait au hazard (random). Ensuite, le programme
	 * demande à l'utilisateur de choisir et de taper un numéro entre
	 * 1 et 1000. L'utilisateur (nous) essaie de le deviner. la limite
	 * des tentatives est de 10 éssais.   
	 * A chaque tentative, l'ordinateur nous répond si le numéro saisie
	 * est plus petit ou plus grand que notre numéro mystère.
	 * Le jeu continue, jusqu'a ce que l'utilisateur trouve le numéro mystère
	 * en moins de 10 tentatives.
	 * 
	 * Hints :
	 * #1. Dans le cas de l'ordinateur, le numéro propose :
	 * numSecret = (int) (Math.random() * N + 1); <== N: à voir la valeur pour votre cas
	 * 
	 * Le jeu doit ressembler à cela :
	 * 
	 * Enter a guess (1-1000) : 900
	 * Your guess is greater than the secret number.
	 * Enter a guess (1-1000) : 500
	 * Your guess is greater than the secret number.
	 * Enter a guess (1-1000) : 160
	 * Your guess is greater than the secret number.
	 * Enter a guess (1-1000) : 155
	 * Your guess is greater than the secret number.
	 * Enter a guess (1-1000) : 152
	 * Your guess is smaller than the secret number.
	 * Enter a guess (1-1000) : 153
	 * Your guess is smaller than the secret number.
	 * Enter a guess (1-1000) : 154
	 * Your guess is correct. Congratulations !
	 */

	public static void main(String[] args) 
	{
		// Créer une instance nommée sc de la classe Scanner
		Scanner sc = new Scanner(System.in);
		
		// Créer une instance nommée ga de la classe Game
		Game ga = new Game();
		
		System.out.print("Limite du jeu de 1 à (100/1000/10000/100000) : ");
		int limite = sc.nextInt();
		boolean result = ga.partie(limite);
		if (result)
			System.out.println("Your guess is correct. Congratulations !");
		else
			System.out.println("After ten attempts to search for the secret number, you lost");
	}
}
