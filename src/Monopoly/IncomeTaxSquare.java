package Monopoly;

public class IncomeTaxSquare extends Square{

	public IncomeTaxSquare() {		
	}
	int landOn(int location,int totalMoney){
		super.landOn(location);
		if(location==4){
			System.out.println("On Income Tax Square");
			int incomeOff;
			incomeOff=(totalMoney*10)/100;
			totalMoney-=incomeOff;
		}
		return totalMoney;
	}

}
