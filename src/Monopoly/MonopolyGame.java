package Monopoly;

import java.util.Scanner;

public class MonopolyGame {
	public static void main(String[] args) throws InterruptedException{
		System.out.println("How many player do you want? :");
		Scanner input=new Scanner(System.in);		
		int PlayerNumber=input.nextInt();
		
		System.out.println("How many turns do you want? :");
		Scanner turn=new Scanner(System.in);
		int Turn=turn.nextInt();
		
		Board buildBoard=new Board();
		buildBoard=new Board();
		GoSquare goSquare=new GoSquare();
		FreeParkingSquare freeParkingSquare=new FreeParkingSquare();
		IncomeTaxSquare incomeTaxSquare=new IncomeTaxSquare();
		LuxuryTaxSquare luxuryTaxSquare=new LuxuryTaxSquare();
		JailSquare jailSquare=new JailSquare();
		GoToJailSquare goToJailSquare=new GoToJailSquare();
		ElectricUtilitySquare electricUtilitySquare=new ElectricUtilitySquare();
		WaterUtilitySquare waterUtilitySquare=new WaterUtilitySquare();
		RailRoads railRoad=new RailRoads();
		
		Player[] Players=new Player[PlayerNumber];
		Dice diceTotal=new Dice();
		int[] dieTotal = new int[PlayerNumber];
		
		Piece playersPiece=new Piece();
		
		if(PlayerNumber>8 || PlayerNumber<2){
			System.out.println("Monopoly is a game which is playing with at most 8 players!!!");
			System.exit(0);
		}
		
		
		
		for(int i=0;i<=PlayerNumber-1;i++){
			Players[i]=new Player("Player"+(i+1));
			Players[i].setPiece(playersPiece.getPieces(i));
			System.out.println(Players[i].getPiece()+" piece owned by "+Players[i].getName());
			System.out.println();
		}
			
		for(int z=1;z<=Turn;z++){
			int i=0;
			int temp=0;
		while(i<=PlayerNumber-1){
			if(Players[i].getMoney()<=0){
				System.out.println(Players[i].getName()+" bankrupted...");
				System.out.println();
				i++;
			}
			else if(Players[i].isTurn()==true){
				if(Players[i].getMoney()<=0){
					Players[i].setTurn(false);
					i++;
					if(i>PlayerNumber){
						break;
					}
				}
			
			temp=0;
			int faceValue1,faceValue2;
			System.out.println(Players[i].getPiece()+" Old Location:"+Players[i].getLocation());
			faceValue1=diceTotal.getFaceValue1();
			faceValue2=diceTotal.getFaceValue2();
			System.out.println("Face Value1 = "+faceValue1+" "+"Face Value2 = "+faceValue2);
			dieTotal[i]=faceValue1+faceValue2;
			System.out.println(Players[i].getPiece()+" toss the dice:"+dieTotal[i]);
			
			Players[i].setLocation(dieTotal[i]);
			
			System.out.println(Players[i].getPiece()+" New Location:"+(Players[i].getLocation()));
			buildBoard.getSquare(Players[i].getLocation()).landOn(Players[i].getLocation());
			Players[i].setMoney(goSquare.landOn(Players[i].getLocation(), Players[i].getMoney()));
			freeParkingSquare.landOn(Players[i].getLocation());
			Players[i].setMoney(incomeTaxSquare.landOn(Players[i].getLocation(), Players[i].getMoney()));
			Players[i].setMoney(luxuryTaxSquare.landOn(Players[i].getLocation(), Players[i].getMoney()));
			jailSquare.landOn(Players[i].getLocation());
			if(electricUtilitySquare.getRent()>0){
				Players[electricUtilitySquare.getOwner()].setMoney(Players[electricUtilitySquare.getOwner()].getMoney()+electricUtilitySquare.getRent());
			}
			else{
			Players[i].setMoney(electricUtilitySquare.landOn(Players[i].getLocation(), i, Players[i].getMoney()));
			}
			
			if(waterUtilitySquare.getRent()>0){
				Players[waterUtilitySquare.getOwner()].setMoney(Players[waterUtilitySquare.getOwner()].getMoney()+waterUtilitySquare.getRent());
			}
			else{
			Players[i].setMoney(waterUtilitySquare.landOn(Players[i].getLocation(), i, Players[i].getMoney()));
			}
			
			if(railRoad.getRent()>0){
				if(Players[i].getLocation()==6){
					Players[railRoad.getOwner(0)].setMoney(Players[railRoad.getOwner(0)].getMoney()+railRoad.getRent());
				}
				else if(Players[i].getLocation()==16){
					Players[railRoad.getOwner(1)].setMoney(Players[railRoad.getOwner(1)].getMoney()+railRoad.getRent());
				}
				else if(Players[i].getLocation()==26){
					Players[railRoad.getOwner(2)].setMoney(Players[railRoad.getOwner(2)].getMoney()+railRoad.getRent());
				}
				else if(Players[i].getLocation()==36){
					Players[railRoad.getOwner(3)].setMoney(Players[railRoad.getOwner(3)].getMoney()+railRoad.getRent());
				}
			}
			else{
				Players[i].setMoney(railRoad.landOn(Players[i].getLocation(), i, Players[i].getMoney()));
			}
			
			System.out.println(Players[i].getPiece()+" has "+Players[i].getMoney());
			System.out.println(buildBoard.getSquare(Players[i].getLocation()).getName());
			temp=goToJailSquare.landOn(Players[i].getLocation(), Players[i].getMoney(),i);
			if(temp<=PlayerNumber){
				i=temp;
			}
			else if(temp>PlayerNumber){
				Players[i].setMoney(temp);
			}
			System.out.println();
			
			i++;}
			Thread.sleep(100);
			}}
		
	input.close();
	turn.close();
	}
	
}
