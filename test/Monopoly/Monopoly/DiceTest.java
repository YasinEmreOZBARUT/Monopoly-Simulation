package Monopoly;

import org.junit.Test;

public class DiceTest {
	Dice diceTotalTest=new Dice();
	@Test
	public void testgetDiceTotal() {
		int diceTotal=diceTotalTest.getDiceTotal();
		boolean diceTotalBoolean=false;
		if(diceTotal<=12 || diceTotal>0){
			diceTotalBoolean=true;
		}
		assert(diceTotalBoolean);
	}

}
