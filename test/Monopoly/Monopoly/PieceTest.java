package Monopoly;

import static org.junit.Assert.*;

import org.junit.Test;

public class PieceTest {
	private String[] test_pieces=new String[8];
	Piece testPiece=new Piece();
	public PieceTest(){
	test_pieces[0]="Horse";
	test_pieces[1]="Plane";
	test_pieces[2]="Cat";
	test_pieces[3]="Car";
	test_pieces[4]="Dog";
	test_pieces[5]="Ship";
	test_pieces[6]="Phone";
	test_pieces[7]="Candy";
	}
	
	@Test
	public void testPieces1() {
		assertEquals(test_pieces[0], testPiece.getPieces(0));
	}
	@Test
	public void testPieces2() {
		assertEquals(test_pieces[1], testPiece.getPieces(1));
	}
	@Test
	public void testPieces3() {
		assertEquals(test_pieces[2], testPiece.getPieces(2));
	}
	@SuppressWarnings("deprecation")
	@Test
	public void testPieces() {
		assertEquals(test_pieces, testPiece.getAllPieces());
	}

}
