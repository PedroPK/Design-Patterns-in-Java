package chapter09.flyweight;

import static org.junit.Assert.*;

import org.junit.Test;

public class FlyWeightTest {

	@Test
	public void testStaticStringEquals() {
		// Arrange and Act
		String one = FlyWeight.getStaticString();
		String two = FlyWeight.getStaticString();
		
		assertEquals(one, two);
	}
	
	@Test
	public void testStaticStringSame() {
		// Arrange and Act
		String one = FlyWeight.getStaticString();
		String two = FlyWeight.getStaticString();
		
		assertSame(one, two);
	}
	
	@Test
	public void testStaticAndConcatenatedStringEquals() {
		// Arrange and Act
		String one = FlyWeight.getStaticString();
		String two = FlyWeight.getConcatenatedString();
		
		assertEquals(one, two);
	}
	
	@Test
	public void testStaticAndConcatenatedStringSame() {
		// Arrange and Act
		String one = FlyWeight.getStaticString();
		String two = FlyWeight.getConcatenatedString();
		
		assertSame(one, two);
	}
	
	@Test
	public void testStaticAndNewStringsEquals() {
		// Arrange and Act
		String one = FlyWeight.getStaticString();
		String two = FlyWeight.getNewString();
		
		assertEquals(one, two);
	}
	
	@Test
	public void testStaticAndNewStringsSame() {
		// Arrange and Act
		String one = FlyWeight.getStaticString();
		String two = FlyWeight.getNewString();
		
		// Not Same!
		assertNotSame(one, two);
	}
	
	@Test
	public void testConcatenatedAndNewStringsEquals() {
		// Arrange and Act
		String one = FlyWeight.getConcatenatedString();
		String two = FlyWeight.getNewString();
		
		assertEquals(one, two);
	}
	
	@Test
	public void testConcatenatedAndNewStringsSame() {
		// Arrange and Act
		String one = FlyWeight.getConcatenatedString();
		String two = FlyWeight.getNewString();
		
		// Not Same!
		assertNotSame(one, two);
	}
	
}
