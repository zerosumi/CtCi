import java.util.ArrayList;


public class Deck <T extends Card>{
	private ArrayList<T> cards;
	private int dealtIndex = 0;
	
	public void setDeckOfCards(ArrayList<T> deckOfCards) {
		cards = deckOfCards;
	}
	
	public void shuffle() {}
	public int remainCards() {
		return cards.size()-dealtIndex;
	}
	
	public T[] dealHand(int number) {}
	public T dealCard() {}
	
}
