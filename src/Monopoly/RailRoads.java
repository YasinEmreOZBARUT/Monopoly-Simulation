package Monopoly;

public class RailRoads extends Square{
	private int[] owner=new int[4];
	private int rent=0;
	private int dieTotal;
	private boolean[] owned=new boolean[4];
	
	public RailRoads(){
		owned[0]=false;
		owned[1]=false;
		owned[2]=false;
		owned[3]=false;
	}
	int landOn(int location,int index,int totalMoney) {
    	super.landOn(location);
    	if(location==6){
    		this.setName("Railroad 1");System.out.println("On Railroad 1");
    		if(owned[0]==false){
				Dice die=new Dice();
				dieTotal=die.getDiceTotal();
				if(dieTotal>4){
					owned[0]=true;
					owner[0]=index;
					totalMoney-=200;
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
				rent=((die.getDiceTotal()*5)+25);
				System.out.println("Rent is "+rent);
				totalMoney-=rent;
				return totalMoney;
			}
		}    	
    	else if(location==16){
    		this.setName("Railroad 2");System.out.println("On Railroad 2");
    		if(owned[1]==false){
				Dice die=new Dice();
				dieTotal=die.getDiceTotal();
				if(dieTotal>4){
					owned[1]=true;
					owner[1]=index;
					totalMoney-=200;
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
				rent=((die.getDiceTotal()*5)+25);
				System.out.println("Rent is "+rent);
				totalMoney-=rent;
				return totalMoney;
			}
		}
    	
    	else if(location==26){
    		this.setName("Railroad 3");System.out.println("On Railroad 3");
    		if(owned[2]==false){
				Dice die=new Dice();
				dieTotal=die.getDiceTotal();
				if(dieTotal>4){
					owned[2]=true;
					owner[2]=index;
					totalMoney-=200;
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
				rent=((die.getDiceTotal()*5)+25);
				System.out.println("Rent is "+rent);
				totalMoney-=rent;
				return totalMoney;
			}
		}
    	
    	else if(location==36){
    		this.setName("Railroad 4");System.out.println("On Railroad 4");
    		if(owned[3]==false){
				Dice die=new Dice();
				dieTotal=die.getDiceTotal();
				if(dieTotal>4){
					owned[3]=true;
					owner[3]=index;
					totalMoney-=200;
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
				rent=((die.getDiceTotal()*5)+25);
				System.out.println("Rent is "+rent);
				totalMoney-=rent;
				return totalMoney;
			}
		}
    	return totalMoney;
    	}
	public int getOwner(int i) {
		return owner[i];
	}
	public int getRent() {
		return rent;
	}
	public boolean getOwned(int i) {
		return owned[i];
	}
}

