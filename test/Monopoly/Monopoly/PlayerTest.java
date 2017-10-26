package Monopoly;

import static org.junit.Assert.*;

import org.junit.Test;

public class PlayerTest {
	Player testPlayer=new Player();
	public PlayerTest(){
		testPlayer.setName("Caner");
		testPlayer.setPiece("Horse");
		testPlayer.setLocation(13);
		testPlayer.setMoney(150);
		testPlayer.setTurn(true);
	}
	@Test
	public void testNameOfPlayer() {
		assertEquals("Caner",testPlayer.getName());
	}
	@Test
	public void testPieceOfPlayer(){
		assertEquals("Horse",testPlayer.getPiece());
	}
	@Test
	public void testLocationOfPlayer(){
		assertEquals(13,testPlayer.getLocation());
	}
	@Test
	public void testMoneyOfPlayer(){
		assertEquals(150,testPlayer.getMoney());
	}
	@Test
	public void testTurnOfPlayer(){
		assertEquals(true,testPlayer.isTurn());
	}
}
