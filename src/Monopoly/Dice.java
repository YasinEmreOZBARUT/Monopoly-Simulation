package Monopoly;

public class Dice {
	private int DiceTotal;
	public Dice(){
	}
	public int getDiceTotal() {
		DiceTotal=0;
		for(int i=1;i<=2;i++){
			this.DiceTotal+=(int) (Math.random() *6 +1);
		}
		return DiceTotal;
	}
	
}
