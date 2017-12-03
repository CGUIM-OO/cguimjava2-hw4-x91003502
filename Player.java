import java.util.ArrayList;




public class Player {
	private String name;
	private int chips;
	private int bet;
	private ArrayList<Card> oneRoundCard;
	public Player(String name, int chips) {
		
		this.name=name;
		this.chips=chips;
	}
	

	public String getName() {
		
		return name;
	}
	
	public int makeBet() {
		
		bet=1;
		return bet;
	}
	
	public void setOneRoundCard(ArrayList<Card> cards) {
		oneRoundCard = new ArrayList<Card>();
		oneRoundCard.addAll(cards);
		
		for(int i=0;i<oneRoundCard.size();i++) {
			Card card=new Card(oneRoundCard.get(i).getSuit(),oneRoundCard.get(i).getRank());
			
			card.printCard(card.getSuit(), card.getRank());
			
		}
		System.out.println("............................. ");
	}
	
	
	public boolean hitMe() {
		int sum=0;
		for(int i=0;i<oneRoundCard.size();i++) {
			Card card=new Card(oneRoundCard.get(i).getSuit(),oneRoundCard.get(i).getRank());
			if(card.getRank()==13||card.getRank()==12||card.getRank()==11){
				sum=sum+10;
			}
			else {
				sum=sum+card.getRank();
			}
		}
		
		
		if(sum<=16) {
			return true;
		}
		else {
			return false;
		}
	}
	public int getTotalValue() {
		int sum=0;
		for(int i=0;i<oneRoundCard.size();i++) {
			Card card=new Card(oneRoundCard.get(i).getSuit(),oneRoundCard.get(i).getRank());
			if(card.getRank()==13||card.getRank()==12||card.getRank()==11){
				sum=sum+10;
			}
			else {
				sum=sum+card.getRank();
			}
		}
		return sum;
		
		
	}
	
	public int getCurrentChips() {
		return chips;
		
	}
	
	public void increaseChips(int diff) {
		this.chips=this.chips+diff;
		
	}
	
	public void sayHello() {
		
		System.out.println("Hello, I am "+name);
		System.out.println("I have "+chips+"chips");
	}
}


