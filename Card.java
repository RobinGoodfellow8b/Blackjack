
public class Card {




	public int value;
	public String suit; 
	public String name;
	
	public static Card[] setDeck() {
		String[] suits = {"C", "D", "H", "S"};
		String[] names = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
		
		Card[] deck = new Card[52];
		int tmp= 0;
		for(int i= 1; i < 5; i++) {
			for(int j= 1; j < 14; j++) {
				Card c = new Card();
				c.suit = suits[i];
				c.name = names[j];
				
				if(j >= 9) {
					c.value = 10;
				}else {
					c.value = j;
				}
				deck[tmp] = c;
				tmp++;	
			}
		}
		return deck;
		
		
		
	}
	
	
	
}
