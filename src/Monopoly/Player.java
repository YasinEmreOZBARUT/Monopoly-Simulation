package Monopoly;
public class Player {
	private int Location;
	private String name;
	private String piece;
	private boolean turn;
	private int money=200;	
	public Player(){
		
	}
	
	public String getPiece() {
		return piece;
	}
	public void setPiece(String piece) {
		this.piece = piece;
	}	
	
	public Player(String name){
		this.name=name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public int getLocation() {
		if(this.Location>=40){
			this.Location%=40;
		}
		return Location;
	}
	public void setLocation(int DiceTotal) {
		this.Location += DiceTotal;
	}
	
	public int getMoney() {
		return money;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
	
	public boolean isTurn() {
		return turn;
	}
	public void setTurn(boolean turn) {
		this.turn = turn;
	}
	
}	