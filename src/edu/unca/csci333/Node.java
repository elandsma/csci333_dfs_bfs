package edu.unca.csci333;

/**
 * CSCI 333, Homework 7: Breadth First and Depth First Search
 * This class defines the Nodes of our graphs.
 * @author Elias Landsman
 * @date March 28, 2021
 */


public class Node {
	//instance variables
	private int name;
	private int parent;
	private int dTime;
	private int fTime;
	private int dist;
	private int color;
	
	//constructor
	public Node(int name) {
		this.name = name;
		this.parent = -1;
		this.dist = Integer.MIN_VALUE;
		this.dTime = 0;
		this.fTime= 0;
		this.color = 0;
	}
	
	//Methods
	
	@Override
	public String toString() {
		String ret = ("{\nName: "+this.name+"\n");
		ret += ("Parent: "+this.parent+"\n");
		ret += ("dTime: "+this.dTime+"\n");
		ret += ("fTime: "+this.fTime+"\n");
		ret += ("Dist: "+this.dist+"\n");
		ret += ("Color: "+this.color+"\n}");
		return ret;
		// return a String with nicely labeled, concatenated data fields
	}
	//getters
	//setters   (no setter for name)
	
}
