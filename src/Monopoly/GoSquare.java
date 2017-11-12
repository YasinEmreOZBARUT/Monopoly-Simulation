package Monopoly;

public class GoSquare extends Square{
	int landOn(int location,int playerMoney){
		super.landOn(location);
		if(location==0){
		playerMoney+=200;
		System.out.println("On GoSquare");}
		return playerMoney;
	}
}
