// Java0817.java
// CardDeck Case Study #08
// This program adds a second, overloaded constructor with parameters.  It is now
// possible to instantiate a new <CardDeck> object with specified data values.


public class Java0817
{
   public static void main(String args[])
   {
      System.out.println("\nCard Deck Case Study 07\n");
      CardDeck d1 = new CardDeck();
      System.out.println(d1.getDecks() + " card deck(s)");  
      System.out.println(d1.getPlayers() + " players");
      System.out.println(d1.getCards() + " cards left");
      System.out.println();
     
      CardDeck d2 = new CardDeck(4,5);
      System.out.println(d2.getDecks() + " card deck(s)");  
      System.out.println(d2.getPlayers() + " players");
      System.out.println(d2.getCards() + " cards left");
      System.out.println();
   }

}


class CardDeck
{
   private int numDecks;		// number of decks in a game
   private int numPlayers;		// number of players in a game
   private int cardsLeft;	// number of cards left in the deck(s)

   private void shuffleCards() { System.out.println("Shuffle Cards"); }

   public CardDeck()
   {
      System.out.println("Constructing a default CardDeck object");
      numDecks = 1;
      numPlayers = 1;
      cardsLeft = 52;
      shuffleCards();
   }

   public CardDeck(int d, int p)
   {
      System.out.println("Constructing a CardDeck object with parameters");
      numDecks = d;
      numPlayers = p;
      cardsLeft = d * 52;
      shuffleCards();
   }

   public int getDecks() 	{ return numDecks; }
   public int getPlayers() 	{ return numPlayers; }
   public int getCards() 	{ return cardsLeft; }

}
