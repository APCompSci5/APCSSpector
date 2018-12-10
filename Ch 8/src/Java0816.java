// Java0816.java
// CardDeck Case Study #07
// This program adds the <shuffleCards> method, which is a <private> helper method 
// used by the <CardDeck> constructor.  This is an example of increasing reliability 
// by the automatic constructor call.


class Java0816
{
	public static void main(String args[])
	{
		System.out.println("\nCard Deck Case Study 07\n");
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

	private void shuffleCards() { System.out.println("Shuffling Cards"); }

	public CardDeck()
	{
		numDecks = 1;
		numPlayers = 1;
		cardsLeft = 52;
		shuffleCards();
	}
 
	public int getDecks() 	{ return numDecks; }
	public int getPlayers() { return numPlayers; }
	public int getCards() 	{ return cardsLeft; }

}

