package Monopoly;

public class ElectricUtilitySquare extends Square{
	private int owner;
	private int rent;
	boolean owned=false;
	int landOn(int location,int index,int totalMoney){
		super.landOn(location);
		if(location==13){
			System.out.println("On Electric Utility Square");
			if(owned==false){
				Dice die=new Dice();
				if(die.getDiceTotal()>4){
					owned=true;
					owner=index;
					totalMoney-=150;
					return totalMoney;
				}
				else{
					return totalMoney;
				}
			}
			else{
				Dice die=new Dice();
				rent=die.getDiceTotal()*10;
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
