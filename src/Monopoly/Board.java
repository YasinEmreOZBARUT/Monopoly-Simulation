package Monopoly;


public class Board {
	private int TotalSquares=40;
	private Square[] square=new Square[TotalSquares];
	private void build(){
		for (int i=0;i<TotalSquares;i++){
			square[i]=new Square("Square "+i);
			square[i].setIndex(i);
		}
	}
	public Square getSquare(int j) {
		return square[j];
	}
	public Board(){
		build();
	}
	public int getTotalSquares() {
		return TotalSquares;
	}	
}
