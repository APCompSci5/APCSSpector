// Java0815.java
// CardDeck Case Study #06
// The <CardDeck> class now has three accessing methods to return 
// variable values of <CardDeck> objects.


public class Java0815
{
	public static void main(String args[])
	{
		System.out.println("\nCard Deck Case Study 06\n");
		CardDeck d = new CardDeck();
		System.out.println(d.getDecks() + " card deck(s)");  
		System.out.println(d.getPlayers() + " players");
		System.out.println(d.getCards() + " cards left");
		System.out.println();
	}
}


class CardDeck
{
	
	private int numDecks;		// number of decks in a game
	private int numPlayers;		// number of players in a game
	private int cardsLeft;		// number of cards left in the deck(s)

	public CardDeck()
	{
		numDecks = 1;
		numPlayers = 1;
		cardsLeft = 52;
	}

	public int getDecks() 		{ return numDecks; }
	public int getPlayers() 	{ return numPlayers; }
	public int getCards() 		{ return cardsLeft; }

}

