// Java0812.java
// CardDeck Case Study #03
// <CardDeck> variables are accessed directly by the <main> method outside the <CardDeck>
// class.  The program compiles, and executes.  This approach greatly compromises 
// program reliability and demonstrates very poor OOP program design.


public class Java0812
{
	public static void main(String args[])
	{
		System.out.println("\nCard Deck Case Study 03\n");
		CardDeck d = new CardDeck();
		d.numDecks = 4;
		d.numPlayers = 5;
		d.cardsLeft = 208;
		System.out.println(d.numDecks +   " card deck(s)");  
		System.out.println(d.numPlayers + " players");
		System.out.println(d.cardsLeft +  " cards left");
		System.out.println(); 
	}
}


class CardDeck
{
	
	int numDecks;		// number of decks in a game
	int numPlayers;		// number of players in a game
	int cardsLeft;		// number of cards left in the deck(s)
}
