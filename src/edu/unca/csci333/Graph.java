package edu.unca.csci333;

import java.util.LinkedList;
import java.util.Queue;

/**
 * CSCI 333, Homework 7: Breadth First and Depth First Search
 * This class defines the Graph object and its depth-first and breadth-first methods.
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
	public void depthFirstSearch() {
		//change signature!
		
		for(Node curr : this.nodes) {
			curr.setColor(0);
			curr.setParent(Integer.MIN_VALUE);
		}
		time =0;
		for(Node u : this.nodes) {
			if(u.getColor() == 0)
				dfsVisit(u);
		}
	}
	
	private void dfsVisit(Node u) {
		//change signature!
		
		time++;
		u.setDTime(time);
		u.setColor(1);
		//for each neighbor V of U{
		for(int i=0; i<edges.length; i++)	//for each column per row 
			if(edges[u.getName()][i] == true) {   	//if it is a neighbor of U
				nodes[i].setParent(u.getName());	//node I's parent becomes U.
				dfsVisit(nodes[i]);					//recurse
		}
		u.setColor(2);
		time++;
		u.setFTime(time);	
	}
	
	public void breadthFirstSearch(int source) {
		//Change Signature?
		
		Node s = nodes[source];
		//reset all nodes that are not S
		for(int i=0; i<n; i++) {
			if(i!=source) {
				nodes[i].setColor(0);
				nodes[i].setDist(Integer.MIN_VALUE);
				nodes[i].setParent(-1);
			}
		}
		s.setColor(1);
		s.setDist(0);
		s.setParent(-1); //parent of S will remain null because it is the root.
		Queue<Node> Q = new LinkedList<Node>();
		Q.add(s);			//source is the first node added to the queue.
		while (Q.size() !=0) {
			Node U = Q.remove();
			U.setColor(2);		//set current node to black, to represent it has been processed.
			//for each vertex adjacent to U: (go through U's row of the edges array: each 'true' is a neighbor)
			for(int i=0; i<edges.length; i++)	//for each column per row
				if(edges[U.getName()][i] == true) {   	//if it is a neighbor
					Node v = nodes[i];					//assign local variable to that node
					if((v.getColor())==0) {				//if that node has not been visited
						v.setColor(1);					//make it gray (to represent it's been placed in queue, but not processed yet)
						v.setDist((U.getDist()+1));		//add 1 to current distance (V is 1 farther from S than U)
						v.setParent(U.getName());		//set parent to current
						Q.add(v);						//add it to queue of vertices to visit later
				}
			}
		}
	}
	
	public String toString() {
		String ret = ("Edges Adjacency Matrix:\n");
		for(int i=0; i < this.n; i++) {
			for(int j=0; j<edges[i].length; j++) {
				if (edges[i][j]==true)
					ret+= "1 ";
				else
					ret+= "0 ";
			}
			ret+="\n";
		}
		ret+="\nIndividual Node Details:\n";
		for(Node curr : this.nodes){
			ret+= curr.toString();
			ret+="\n";
		}
		return ret;
	}
	
}
