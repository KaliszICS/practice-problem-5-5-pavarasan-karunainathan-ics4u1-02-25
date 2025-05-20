public class Card implements Comparable<Card>{
    private String name;
    private String suit;

    public Card(String name, String suit){
	this.name = name;
	this.suit = suit;
    }

    public String getName(){return this.name;}
    public String getSuit(){return this.suit;}

    public void setName(String name){this.name = name;}
    public void setSuit(String suit){this.suit = suit;}

    public int getValue(){
	String[] suits = {"Hearts", "Clubs", "Diamonds", "Spades"};
	String[] names = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
	int value = 0;
	for(int i = 0; i < suits.length; i++){
	    if(this.suit == suits[i]){
		value += i*13;
		break;
	    }
	}

	for(int i = 0; i < names.length; i++){
	    if(this.name == names[i]){
		value += i;
		break;
	    }
	}
	
	return value;
    }
    
    @Override
    public String toString(){
	return name + " of " + suit;
    }

    @Override
    public int compareTo(Card other){
	return getValue() - other.getValue();
    }
}
