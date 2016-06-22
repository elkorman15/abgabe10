package at.fhj.itm;

import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;


public class JTest {

	private Point2d p1;
	private Point2d p2;
	@Before
	public void setUp() throws Exception {
		p1 = new Point2d(3,5);
		p2 = new Point2d(4,3);
	}

	@Test
	public void testDistanceFrom(){
		double d = p1.distanceFrom(p2);
		assertEquals(d, Math.sqrt(5.0),0.00000001);

	}
	@Test
	public void testDistancwFromOrigin(){
		double d = p1.distanceFromOrigin();
		assertEquals(d, Math.sqrt(34),0.00001);

	}

}
