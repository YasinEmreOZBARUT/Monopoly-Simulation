package Monopoly;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LotsSquare extends Square{
	private int counter=0;
	private int dieTotal;
	private int owner;
	private int rent;
	private int fileRead=0;
	private int i=0;
	public String[][] fileRead() throws IOException{
			FileReader fileReader=new FileReader("Monopoly-Lots.txt");
			BufferedReader br=new BufferedReader(fileReader);
			while(br.readLine()!=null){
				counter++;
			}
			String lines;
			String[] properties=new String[3];
			String[][] values=new String[counter][3];
			while((lines=br.readLine())!=null){
				properties=lines.split(",");
				values[i][0]=properties[0];
				values[i][1]=properties[1];
				values[i][2]=properties[2];
				i++;
			}
			return values;
		
	}
	int landOn(int location,int index,int totalMoney) throws IOException{
		super.landOn(location);
		String[][] values=fileRead();
		if(Integer.parseInt(values[fileRead][0])==location){
			this.setRent(Integer.parseInt(values[fileRead][2]));
			if(this.isOwned()==false){
			Dice die=new Dice();
			dieTotal=die.getDiceTotal();
				if(dieTotal>4){
					this.setOwned(true);
					owner=index;
					totalMoney-=this.getPrice();
					System.out.println("Dice Total is "+dieTotal);
					fileRead++;
					return totalMoney;
				}
				else{
					System.out.println("Dice Total is "+dieTotal);
					fileRead++;
					return totalMoney;
				}
		    }
			else{
				System.out.println("This Square is already owned so pay its rent price");
				rent=this.getRent();
				totalMoney-=rent;
				fileRead++;
				return totalMoney;
			}
		}
		return totalMoney;
	}
	public int getOwner() {
		return owner;
	}
	public int getRent() {
		return rent;
	}
}
