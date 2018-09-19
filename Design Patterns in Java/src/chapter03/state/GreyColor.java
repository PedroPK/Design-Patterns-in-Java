package chapter03.state;

import java.util.Iterator;
import java.util.Set;

public class GreyColor extends Color {
	
	@Override
	public void process(Node pNode, Set<Node> pNodes) {
		System.out.println("Grey Node process() invoked:" + pNode.toString());
		
		Iterator<Node> iterator = pNodes.iterator();
		while ( iterator.hasNext() ) {
			Node actualNode = iterator.next();
			actualNode.seachDeep(pNodes);
		}
		pNode.setColor(new BlackColor(), pNodes);
	}
	
	@Override
	public String toString() {
		return "Grey";
	}
	
}
