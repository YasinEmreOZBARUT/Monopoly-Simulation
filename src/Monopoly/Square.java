package Monopoly;

public class Square{
	private int price;
	private int rent;
	private boolean owned=false;
	private String name;
	private Square nextSquare;
	private int index;
	private int playerLocation;
	public Square(){
		
	}
	public Square(String name,int pieceLocation){
		this.name = name;
		this.setIndex(pieceLocation);
	}
    int landOn(int location) {
    	playerLocation=location;
    	return playerLocation;
	}
	
	public Square getNextSquare() {
		return nextSquare;
	}
	public void setNextSquare(Square nextSquare) {
		this.nextSquare = nextSquare;
	}	

	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getRent() {
		return rent;
	}
	public void setRent(int rent) {
		this.rent = rent;
	}
	public boolean isOwned() {
		return owned;
	}
	public void setOwned(boolean owned) {
		this.owned = owned;
	}
}
	

