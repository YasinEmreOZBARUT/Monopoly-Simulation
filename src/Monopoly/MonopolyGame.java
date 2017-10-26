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
		
		Player[] Players=new Player[PlayerNumber];
		Dice diceTotal=new Dice();
		int[] dieTotal = new int[PlayerNumber];
		
		Piece playersPiece=new Piece();
		
		if(PlayerNumber>8){
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
		while(i<=PlayerNumber-1){
			System.out.println(Players[i].getPiece()+" Old Location:"+Players[i].getLocation());
			
			dieTotal[i]=diceTotal.getDiceTotal();
			System.out.println(Players[i].getPiece()+" toss the dice:"+dieTotal[i]);
			
			Players[i].setLocation(dieTotal[i]);
			System.out.println(Players[i].getPiece()+" New Location:"+(Players[i].getLocation()));
			System.out.println(buildBoard.getSquare(Players[i].getLocation()).getName());
			System.out.println();
			
			i++;
			Thread.sleep(1000);
			}}
		
	input.close();
	turn.close();
	}
	
}
