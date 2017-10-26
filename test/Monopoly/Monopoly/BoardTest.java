package Monopoly;

import static org.junit.Assert.*;

import org.junit.Test;

public class BoardTest {
	Board BoardTest=new Board();
	@Test
	public void testTotalSquares() {
		assertEquals(40,BoardTest.getTotalSquares());
	}
	@Test
	public void testBoard(){
		BoardTest=new Board();
		assertEquals("Square 0",BoardTest.getSquare(0));
	}

}
