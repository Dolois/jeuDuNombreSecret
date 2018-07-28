import java.util.Scanner;

public class Application {
	
	/* Jeu du Nombre Secret
	 * 
	 * Au d�but, l'ordinateur propose un num�ro entre 1 et 1000.
	 * Le choix est fait au hazard (random). Ensuite, le programme
	 * demande � l'utilisateur de choisir et de taper un num�ro entre
	 * 1 et 1000. L'utilisateur (nous) essaie de le deviner. la limite
	 * des tentatives est de 10 �ssais.   
	 * A chaque tentative, l'ordinateur nous r�pond si le num�ro saisie
	 * est plus petit ou plus grand que notre num�ro myst�re.
	 * Le jeu continue, jusqu'a ce que l'utilisateur trouve le num�ro myst�re
	 * en moins de 10 tentatives.
	 * 
	 * Hints :
	 * #1. Dans le cas de l'ordinateur, le num�ro propose :
	 * numSecret = (int) (Math.random() * N + 1); <== N: � voir la valeur pour votre cas
	 * 
	 * Le jeu doit ressembler � cela :
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
		// Cr�er une instance nomm�e sc de la classe Scanner
		Scanner sc = new Scanner(System.in);
		
		// Cr�er une instance nomm�e ga de la classe Game
		Game ga = new Game();
		
		System.out.print("Limite du jeu de 1 � (100/1000/10000/100000) : ");
		int limite = sc.nextInt();
		boolean result = ga.partie(limite);
		if (result)
			System.out.println("Your guess is correct. Congratulations !");
		else
			System.out.println("After ten attempts to search for the secret number, you lost");
	}
}
