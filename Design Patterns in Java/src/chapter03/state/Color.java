package chapter03.state;

import java.util.Set;

public abstract class Color {
	
	public void search(Node pNode, Set<Node> pNodes) {
		System.out.println("Color search() invoked");
	}
	
	public void process(Node pNode, Set<Node> pNodes) {
		System.out.println("Color process() invoked");
	}
	
}