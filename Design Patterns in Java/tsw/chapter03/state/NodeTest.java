package chapter03.state;

import java.util.Set;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


public class NodeTest {
	
	@Test
	public void testTwoNodes_OnlyOneWay() {
		Node a = new Node("A");
		Node b = new Node("B");
		
		a.addAdjancetNode(b);
		
		//Set<Node> nodesSet = a.getAdjacentNodes();
		a.seachDeep(/*nodesSet*/);
		
		
		Assert.assertTrue(a.getColor() instanceof BlackColor);
		Assert.assertTrue(b.getColor() instanceof BlackColor);
	}
	
	@Test
	public void testThreeNodes_ExternalAdjacentObtaintion() {
		Node a = new Node("A");
		Node b = new Node("B");
		Node c = new Node("C");
		
		a.addAdjancetNode(b);
		b.addAdjancetNode(c);
		
		Set<Node> nodesSet = a.getAdjacentNodes();
		a.seachDeep(nodesSet);
		
		Assert.assertTrue(a.getColor() instanceof BlackColor);
		Assert.assertTrue(b.getColor() instanceof BlackColor);
		Assert.assertTrue(c.getColor() instanceof BlackColor);
	}
	
	@Test
	public void testThreeNodes_OnlyOneWay() {
		Node a = new Node("A");
		Node b = new Node("B");
		Node c = new Node("C");
		
		a.addAdjancetNode(b);
		b.addAdjancetNode(c);
		
		a.seachDeep();
		
		Assert.assertTrue(a.getColor() instanceof BlackColor);
		Assert.assertTrue(b.getColor() instanceof BlackColor);
		Assert.assertTrue(c.getColor() instanceof BlackColor);
	}
	
}