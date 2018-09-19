package chapter03.state;

import java.util.Set;

public class BlackColor extends Color {
	
	@Override
	public void process(Node pNode, Set<Node> pNodes) {
		System.out.println("White Node process() invoked:" + pNode.toString());
		
		pNodes.add(pNode);
	}
	
	@Override
	public String toString() {
		return "Black";
	}
	
}
