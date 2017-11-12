package Monopoly;

import static org.junit.Assert.*;

import org.junit.Test;

public class LuxuryTaxSquareTest {
	LuxuryTaxSquare luxuryTaxSquareTest=new LuxuryTaxSquare();
	@Test
	public void testLuxuryTaxSquare() {
		assertEquals(25,luxuryTaxSquareTest.landOn(38, 100));
	}

}
