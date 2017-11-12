package Monopoly;

import static org.junit.Assert.*;

import org.junit.Test;

public class FreeParkingSquareTest {
	FreeParkingSquare freeParkingSquareTest=new FreeParkingSquare();
	@Test
	public void testFreeParkingSquare() {
		assertEquals(20,freeParkingSquareTest.landOn(20));
	}

}
