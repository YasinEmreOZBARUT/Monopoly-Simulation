package Monopoly;

public class FreeParkingSquare extends Square{

	public FreeParkingSquare() {
	}
	int landOn(int location){
		super.landOn(location);
		if(location==20){
			System.out.println("On Free Parking Square");
		}
		return location;
	}
}
