package edu.unca.csci333;

/**
 * CSCI 333, Homework 7: Breadth First and Depth First Search
 * This Main class is used for testing/demonstration.
 * @author Elias Landsman
 * @date March 28, 2021
 */


public class Main {

	public static void main(String[] args) {	
		System.out.println("Hello world. Welcome to my BFS/DFS demonstration.");		
		boolean[][] graph1 =  {
				{false, true, false, false, true, false}, //1,4
				{true, false, true, false, false, false},//0,2
				{false, true, false, true, false, true},//1,3,5
				{false, false, true, false, true, true},//2,4,5
				{true, false, false, true, false, false},//0,3
				{false, false, true, true, false, false} //2,3		
		};
		Graph testGraph1 = new Graph(graph1);
		System.out.println("Graph 1 after initialization:");
		System.out.println(testGraph1);
		System.out.println("Graph 1 after BFS on Node 2");
		testGraph1.breadthFirstSearch(2);
		System.out.println(testGraph1);		
		System.out.println("Graph 1 after BFS on Node 3");
		testGraph1.breadthFirstSearch(3);
		System.out.println(testGraph1);
		
		//this graph is a domino-shaped rectangle.
		boolean[][] graph2 =  {
				{false, true, false, false, false, true},
				{true, false, true, false, false, false},
				{false, true, false, true, false, true, },
				{false, false, true, false, true, false},
				{false, false, false, true, false, true},
				{true, false, true, false, true, false}				
		};
		Graph testGraph2 = new Graph(graph2);
		System.out.println("Graph 2 after initialization:");
		System.out.println(testGraph2);
		System.out.println("Graph 2 after BFS on Node 0:");
		testGraph2.breadthFirstSearch(0);
		System.out.println(testGraph2);
		System.out.println("Graph 2 after BFS on Node 2:");
		testGraph2.breadthFirstSearch(2);
		System.out.println(testGraph2);
		
		
		//this graph is a square with triangles on opposite ends.
		boolean[][] graph3 =  {
				{false, true, false, false, false, true},
				{true, false, true, false, false, true},
				{false, true, false, true, true, false},
				{false, false, true, false, true, false},
				{false, false, true, true, false, true},
				{true, true, false, false, true, false}				
		};
		Graph testGraph3 = new Graph(graph3);
		
		System.out.println("Graph 3 after initialization:");
		System.out.println(testGraph3);
		System.out.println("Graph 2 after BFS on Node 2:");
		testGraph2.breadthFirstSearch(2);
		System.out.println(testGraph2);
		System.out.println("Graph 2 after BFS on Node 4:");
		testGraph2.breadthFirstSearch(4);
		System.out.println(testGraph2);
						
		//this graph is a square with triangles on adjacent ends.
		boolean[][] graph4 =  {
				{false, true, false, false, false, true},  //1, 5
				{true, false, true, true, false, true},  //0, 2, 3, 5
				{false, true, false, true, false, false}, //1, 3
				{false, true, true, false, true, false}, //1, 2, 4
				{false, false, false, true, false, true}, //3, 4
				{true, true, false, false, true, false}, //0, 1, 4
		};
		Graph testGraph4 = new Graph(graph4);
		System.out.println("Graph 4 after initialization:");
		System.out.println(testGraph4);
		testGraph4.depthFirstSearch();
		System.out.println("Graph 4 after DFS:");
		System.out.println(testGraph4);
		
		
		boolean[][] graph5 =  {
				{false, true, false, false, false, false},  //1
				{true, false, true, true, false, false},  // 0, 2, 3
				{false, true, false, false, false, false}, // 1
				{false, true, false, false, true, true}, //1, 4, 5
				{false, false, false, true, false, true}, //3, 5
				{false, false, false, true, true, false}, //3, 4
		};
		
		Graph testGraph5 = new Graph(graph5);
		System.out.println("Graph 5 after initialization:");
		System.out.println(testGraph5);
		testGraph5.depthFirstSearch();
		System.out.println("Graph 5 after DFS:");
		System.out.println(testGraph5);
		
		boolean[][] graph6 =  {
				{false, true, true, true, false, false},  //1,2,3
				{true, false, false, false, false, false},  //0
				{true, false, false, false, false, false}, //0
				{true, false, false, false, true, true}, //0,4,5
				{false, false, false, true, false, false}, // 3
				{false, false, false, true, false, false}, //3
		};
		Graph testGraph6 = new Graph(graph6);
		System.out.println("Graph 6 after initialization:");
		System.out.println(testGraph6);
		testGraph6.depthFirstSearch();
		System.out.println("Graph 6 after DFS:");
		System.out.println(testGraph6);
		
	}
}
