package Monopoly;

public class JailSquare extends Square{

	public JailSquare() {
		
	}
	int landOn(int location){
		super.landOn(location);
		if(location==10){
			System.out.println("On Jail Square");
		}
			return location;
	}
}
