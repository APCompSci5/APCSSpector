// Java0813.java
// Carddeck Case Study #04
// All the variables in the <CardDeck> class are declared as <private>.
// This prevents outside access to the variables.  The program will no 
// longer compile because <main> attempts to access private data.


public class Java0813
{
	public static void main(String args[])
	{
		System.out.println("\nCard Deck Case Study 04\n");
		CardDeck d = new CardDeck();
		d.numDecks = 4;
		d.numPlayers = 5;
		d.cardsLeft = 208;
		System.out.println(d.numDecks + " card deck(s)");  
		System.out.println(d.numPlayers + " players");
		System.out.println(d.cardsLeft + " cards left");
		System.out.println(); 
	}
}


class CardDeck
{
	
	private int numDecks;		// number of decks in a game
	private int numPlayers;		// number of players in a game
	private int cardsLeft;		// number of cards left in the deck(s)
}
