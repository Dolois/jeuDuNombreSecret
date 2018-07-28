Jeu du Nombre a deviner
	  
Au début, l'ordinateur propose un numéro entre 1 et 1000.

Le choix du nombre secret est aléatoire (random).

Ensuite, le programme demande à l'utilisateur de choisir et 
de taper un numéro entre 1 et 1000.

L'utilisateur (nous) essaie de le deviner. 

La limite des tentatives est de 10 éssais.
   
A chaque tentative, l'ordinateur nous répond si le nombre saisie 
est plus petit ou plus grand que notre nombre secret.

Le jeu continue, jusqu'a ce que l'utilisateur trouve le nombre secret
en moins de 10 tentatives.
	  
Hints :
#1. Dans le cas de l'ordinateur, pour générer un nombre aléatoire :
nombreSecret = (int) (Math.random()  N + 1); <== N: à voir la valeur pour votre cas
	  
Le jeu doit ressembler à cela :
	  
Enter a guess (1-1000) : 900
Your guess is greater than the secret number.
Enter a guess (1-1000) : 500
Your guess is greater than the secret number.
Enter a guess (1-1000) : 160
Your guess is greater than the secret number.
Enter a guess (1-1000) : 155
Your guess is greater than the secret number.
Enter a guess (1-1000) : 152
Your guess is smaller than the secret number.
Enter a guess (1-1000) : 153
Your guess is smaller than the secret number.
Enter a guess (1-1000) : 154
Your guess is correct. Congratulations !
