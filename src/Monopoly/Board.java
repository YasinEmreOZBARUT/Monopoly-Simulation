package Monopoly;


public class Board {
	private int TotalSquares=40;
	private Square[] square=new Square[TotalSquares];
	private void build(){
		for (int i=0;i<TotalSquares;i++){
			square[i]=new Square("Square "+i,i);
			//square[i].setIndex(i);
		}
	}
	private void linkSquares(){
		for(int i=0;i< (TotalSquares -1);i++){
			linkingSquares(i);
		}
		Square startingSquare=(Square) square[0];
		Square finishingSquare=(Square) square[TotalSquares-1];
		finishingSquare.setNextSquare(startingSquare);
	}
	
	private void linkingSquares(int i){
		Square on=(Square) square[i];
		Square nextSquare=(Square) square[i+1];
		on.setNextSquare(nextSquare);
	}
	
	public Square getSquare(int j) {
		if(j>=TotalSquares){
			j=j%TotalSquares;
		}
		
		return square[j];
	}
	public Board(){
		build();
		linkSquares();
	}
	public int getTotalSquares() {
		return TotalSquares;
	}	
}
