package chapter09.flyweight;

import static org.junit.Assert.*;

import org.junit.Test;

public class FlyWeightTest {

	@Test
	public void testStaticStringSame() {
		// Arrange and Act
		String one = FlyWeight.getStaticString();
		String two = FlyWeight.getStaticString();
		
		assertSame(one, two);
	}
	
	@Test
	public void testSequenciallyConcatenatedStringsSame() {
		// Arrange and Act
		String one = FlyWeight.getSequenciallyConcatenatedString();
		String two = FlyWeight.getSequenciallyConcatenatedString();
		
		// Not the Same!
		assertNotSame(one, two);
	}
	
	@Test
	public void testNewStringsSame() {
		// Arrange and Act
		String one = FlyWeight.getNewString();
		String two = FlyWeight.getNewString();
		
		// Not the Same!
		assertNotSame(one, two);
	}
	
	@Test
	public void testStaticAndSequenciallyConcatenatedStringSame() {
		// Arrange and Act
		String one = FlyWeight.getStaticString();
		String two = FlyWeight.getSequenciallyConcatenatedString();
		
		// Not Same
		assertNotSame(one, two);
	}
	
	@Test
	public void testStaticAndConcatenatedStringSame() {
		// Arrange and Act
		String one = FlyWeight.getStaticString();
		String two = FlyWeight.getConcatenatedString();
		
		assertSame(one, two);
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
	public void testConcatenatedAndNewStringsSame() {
		// Arrange and Act
		String one = FlyWeight.getConcatenatedString();
		String two = FlyWeight.getNewString();
		
		// Not Same!
		assertNotSame(one, two);
	}
	
}
