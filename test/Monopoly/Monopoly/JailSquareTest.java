package Monopoly;

import static org.junit.Assert.*;

import org.junit.Test;

public class JailSquareTest {
	JailSquare jailSquareTest=new JailSquare();
	@Test
	public void testJailSquare() {
		assertEquals(10,jailSquareTest.landOn(10));
	}

}
