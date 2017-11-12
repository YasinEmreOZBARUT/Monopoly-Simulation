package Monopoly;

import static org.junit.Assert.*;

import org.junit.Test;

public class SquareTest {
	Square testSquare=new Square("Yasin",1);
	@Test
	public void testSquaregetName() {
		assertEquals("Yasin", testSquare.getName());
	}
	@Test
	public void testSquaresetIndex(){
		testSquare.setIndex(10);
		assertEquals(10,testSquare.getIndex());
	}
	@Test
	public void testSquaregetIndex(){
		testSquare.setIndex(10);
		assertEquals(10,testSquare.getIndex());
	}
}
