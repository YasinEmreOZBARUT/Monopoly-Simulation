package Monopoly;

public class Square{
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
}
	

