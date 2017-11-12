package Monopoly;

import static org.junit.Assert.*;

import org.junit.Test;

public class IncomeTaxSquareTest {
IncomeTaxSquare incomeTaxSquareTest=new IncomeTaxSquare();
	@Test
	public void testIncomeTaxSquare() {
		assertEquals(180,incomeTaxSquareTest.landOn(4, 200));
		
	}

}
