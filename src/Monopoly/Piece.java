package Monopoly;
import java.lang.String;

public class Piece {
	private String[] pieces=new String[8];
	public Piece(){
		pieces[0]="Horse";
		pieces[1]="Plane";
		pieces[2]="Cat";
		pieces[3]="Car";
		pieces[4]="Dog";
		pieces[5]="Ship";
		pieces[6]="Phone";
		pieces[7]="Candy";
	}
	public String getPieces(int i) {
		return pieces[i];
	}
	public String[] getAllPieces() {
		return pieces;
	}
}
