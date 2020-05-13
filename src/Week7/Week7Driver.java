package Week7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * All work is created by Matt Sievers on 05-12-2020 for use in CST-201
 */
public class Week7Driver {
  public static void main(String[] args) {
    Assignment8 graph = new Assignment8();

    /**
     * 1.  Create an Array of strings for the counties
     * 2.  Create a 2d array of the edges with weight (DestinationCounty, Distance)
     * 3.  Method for getDistance that takes to counties and returns the length between them, if there is no connection,
     * method returns max value of Int.
     * 4.  Method for getNeighbors that takes a single county and returns a list of all the counties connected to it
     *
     */


    int[][] edges = new int[][]{
            {0, 1, 14}, {0, 12, 9}, {0, 11, 14},
            {1, 0, 14}, {1, 11, 9}, {1, 10, 17}, {1, 2, 9},
            {2, 1, 9}, {2, 10, 13}, {2, 9, 20}, {2, 3, 5},
            {3, 2, 5}, {3, 9, 19}, {3, 4, 17},
            {4, 3, 17}, {4, 9, 4}, {4, 5, 16},
            {5, 4, 16}, {5, 9, 12}, {5, 7, 9}, {5, 6, 8},
            {6, 5, 8}, {6, 7, 6},
            {7, 6, 6}, {7, 5, 9}, {7, 9, 12}, {7, 8, 7}, {7, 14, 18}, {7, 13, 23},
            {8, 7, 7,}, {8, 9, 13}, {8, 10, 5}, {8, 14, 6},
            {9, 7, 12}, {9, 5, 12}, {9, 4, 4}, {9, 3, 19}, {9, 2, 20}, {9, 10, 7}, {9, 8, 13},
            {10, 8, 5}, {10, 9, 7}, {10, 2, 13}, {10, 1, 17}, {10, 11, 18}, {10, 14, 8},
            {11, 14, 9}, {11, 10, 18}, {11, 1, 9}, {11, 0, 14}, {11, 12, 15},
            {12, 0, 9}, {12, 11, 15}, {12, 14, 15}, {12, 13, 11},
            {13, 12, 11}, {13, 14, 18}, {13, 7, 23},
            {14, 12, 15}, {14, 13, 8}, {14, 7, 18}, {14, 8, 6}, {14, 10, 8}, {14, 11, 9}
    };

    graph.buildGraph(edges);
    graph.printGraph();
    int foo = graph.getDistance(0,11);
    System.out.println(foo);
    System.out.println(graph.getNeighbors(0));



  }

}
