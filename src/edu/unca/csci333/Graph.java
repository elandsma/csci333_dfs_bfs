package edu.unca.csci333;

/**
 * CSCI 333, Homework 7: Breadth First and Depth First Search
 * This class defines the Graph object.
 * @author Elias Landsman
 * @date March 28, 2021
 */

public class Graph {
	//instance vars
	private int n;
	private int time;
	private boolean[][] edges;;
	private Node[] nodes;
	
	//constructor
	public Graph(boolean[][] edges) {
		this.edges = edges;
		this.n = edges.length;
		this.nodes = new Node[n];
		for(int i=0; i<n; i++) {
			nodes[i] = new Node(i);
		}
		this.time=0;
	}
	
	//methods
	public _ depthFirstSearch() {
		
	}
	
	private _ dfsVisit(Node u) {
		
	}
	
	public _ breadthFirstSearch(int source) {
		
	}
	
	public String toString() {
		return "0";
	}
	
	
}
