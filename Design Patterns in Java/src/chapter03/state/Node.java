package chapter03.state;

import java.util.HashSet;
import java.util.Set;

public class Node {
	
	private Set<Node>	adjacentNodes;
	private Color		color;
	private String		name;
	
	public Node ( String pName ) {
		this.name = pName;
		this.color = new WhiteColor();
	}
	
	public void seachDeep( Set<Node> pNodes ) {
		System.out.println("Node seachDeep() invoked: " + this.toString());
		this.color.search(this, pNodes);
	}
	
	public void seachDeep() {
		System.out.println("Node seachDeep() invoked: " + this.toString());
		this.color.search(this, this.adjacentNodes);
	}
	
	public Set<Node> getAdjacentNodes() {
		System.out.println("node getAdjacentNodes() invoked: " + this.toString());
		
		return this.adjacentNodes;
	}
	
	public void addAdjancetNode(Node pNode) {
		if ( this.adjacentNodes == null ) {
			this.adjacentNodes = new HashSet<Node>();
		}
		this.adjacentNodes.add(pNode);
	}
	
	public Color getColor() {
		return this.color;
	}
	
	public void setColor(Color pColor, Set<Node> pNodes) {
		this.color = pColor;
		pColor.process(this, pNodes);
	}
	
	@Override
	public String toString() {
		return "Node [color=" + color + ", name=" + name + "]";
	}
	
}