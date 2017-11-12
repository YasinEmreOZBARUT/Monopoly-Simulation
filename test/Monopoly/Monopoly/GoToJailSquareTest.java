package Monopoly;

import static org.junit.Assert.*;

import org.junit.Test;

public class GoToJailSquareTest {
	GoToJailSquare goToJailSquareTest=new GoToJailSquare();
	@Test
	public void testGoToSquare() {
		assertEquals(50,goToJailSquareTest.landOn(30, 100, 3));
	}

}
