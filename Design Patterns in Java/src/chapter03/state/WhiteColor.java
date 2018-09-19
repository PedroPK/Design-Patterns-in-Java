package chapter03.state;

import java.util.Set;

public class WhiteColor extends Color {
	
	@Override
	public void search(Node pNode, Set<Node> pNodes) {
		System.out.println("White Node Search() invoked:" + pNode.toString());
		pNode.setColor(new GreyColor(), pNodes);
	}
	
	@Override
	public String toString() {
		return "White";
	}
	
}