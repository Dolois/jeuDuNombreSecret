import java.util.Scanner;

public class Game {
	
	/*
	 * @param int 
	 * 
	 * Cette méthode génère un nombre aléatoire
	 * a partir de l'argument quelle reçoit un
	 * qui est un entier qui peut être (100/1000/10000/100000)
	 * 
	 * return int
	 * 
	 */
	public static int nombreSecret(int limite)
	{
		int nombreSecret;
		nombreSecret = (int) (Math.random() * limite + 1);
		System.out.println(nombreSecret);
		for (int i = 0; i < 10; i++)
		{
			System.out.println();
		}
		return nombreSecret;
	}
	
	/*
	 * @param int
	 * 
	 * Cette méthode récupère le nombre secret
	 * et le compare le nombre saisit par l'utilisateur
	 * L'utilisateur a droit a dix essais pour trouver
	 * le nombre secret. La méthode aide l'utilisateur
	 * en lui indiquant si le nombre saisit est plus petit
	 * ou plus grand que le nombre secret.
	 * 
	 * return boolean
	 * 
	 */
	public static boolean partie(int limite)
	{
		Scanner sc = new Scanner(System.in);
		
		int nombreSecret = nombreSecret(limite);
		
		int essais = 10;
		boolean trouve = false;
		while (essais > 0)
		{
			System.out.print("Enter guess (1-" + limite + ") : ");
			int nombreATrouve = sc.nextInt();
			if (nombreATrouve == nombreSecret)
			{
				trouve = true;
				essais = 0;
			}
			else if (nombreATrouve > nombreSecret)
			{
				essais--;
				System.out.println("Your guess is greater than the secret number.");
			}
				else
				{
					essais--;
					System.out.println("Your guess is smaller than the secret number.");
				}
		}
		return trouve;
	}
}
