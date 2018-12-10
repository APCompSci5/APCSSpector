// Java0814.java
// CardDeck Case Study #05
// The <CardDeck> class now has a constructor to initialize variables
// during the instantiation of a new <CardDeck> object.


public class Java0814
{
	public static void main(String args[])
	{
		System.out.println("\nCard Deck Case Study 05\n");
		CardDeck d = new CardDeck();
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

}

