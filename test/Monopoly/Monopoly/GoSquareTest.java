package Monopoly;

import static org.junit.Assert.*;

import org.junit.Test;

public class GoSquareTest {
	GoSquare goSquareTest=new GoSquare();
	@Test
	public void testGoSquare() {
		assertEquals(300,goSquareTest.landOn(0, 100));
	}

}
