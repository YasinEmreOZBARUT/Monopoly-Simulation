package Monopoly;

public class WaterUtilitySquare extends Square{
	private int owner;
	private int rent=0;
	private int dieTotal;
	boolean owned=false;
	int landOn(int location,int index,int totalMoney){
		super.landOn(location);
		if(location==29){
			System.out.println("On Water Utility Square");
			if(owned==false){
				Dice die=new Dice();
				dieTotal=die.getDiceTotal();
				if(dieTotal>4){
					owned=true;
					owner=index;
					totalMoney-=150;
					System.out.println("Dice Total is "+dieTotal);
					return totalMoney;
				}
				else{
					System.out.println("Dice Total is "+dieTotal);
					return totalMoney;
				}
			}
			else{
				Dice die=new Dice();
				rent=die.getDiceTotal()*10;
				System.out.println("Rent is "+rent);
				totalMoney-=rent;
				return totalMoney;
			}
		}
		return totalMoney;
	}
	public int getRent() {
		return rent;
	}
	public boolean isOwned() {
		return owned;
	}
	public int getOwner() {
		return owner;
	}
	
}
