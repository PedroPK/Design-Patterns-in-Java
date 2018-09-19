package chapter04.composite;

import org.junit.Test;

public class SubClassOverhidderTest {
	
	@Test
	public void testPrivateAttributeOverhiding() {
		SubClassOverhidder sc = new SubClassOverhidder();
		
		// This do not Compile
		// System.out.println(sc.attribute);
	}
	
}