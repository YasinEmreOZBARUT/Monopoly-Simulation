package Monopoly;

public class LuxuryTaxSquare extends Square{

	public LuxuryTaxSquare() {
	}
	int landOn(int location,int totalMoney){
		super.landOn(location);
		if(location==38){
			System.out.println("On Luxury Tax Square");
			totalMoney-=75;
		}
		return totalMoney;
	}
}
