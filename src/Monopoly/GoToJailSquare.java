package Monopoly;

public class GoToJailSquare extends Square{
	Dice die=new Dice();
	public GoToJailSquare() {
	}
	int landOn(int location,int totalMoney,int index){
		super.landOn(location);
		int temp=1;
		if(location==30){
			System.out.println("On Go to Jail Square");
			if(die.getFaceValue1()==die.getFaceValue2()){
				return totalMoney;
			}
			else if((int) (Math.random() *2 +1)==1){
				totalMoney-=50;
				return totalMoney;
			}
			temp++;
			if(temp==3){
				return index;
			}
			index++;
			return index;
		}
		return index;
	}
}
