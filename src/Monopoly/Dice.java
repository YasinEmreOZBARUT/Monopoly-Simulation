package Monopoly;

public class Dice {
	private int DiceTotal;
	private int faceValue1,faceValue2;
	public Dice(){
	}
	public int getDiceTotal() {
		DiceTotal=0;
		DiceTotal=this.getFaceValue1()+this.getFaceValue2();
		return DiceTotal;
	}
	public int getFaceValue1() {
		this.faceValue1=0;
		this.faceValue1 =(int) (Math.random() *6 +1);
		return faceValue1;
	}
	
	public int getFaceValue2() {
		this.faceValue2=0;
		this.faceValue2=(int) (Math.random() *6 +1);
		return faceValue2;
	}
	
}
