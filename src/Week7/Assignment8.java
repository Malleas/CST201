package Week7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * All work is created by Matt Sievers on 05-13-2020 for use in CST-201
 */
public class Assignment8 {

  public static class Edge {
    private int destination;
    private int distance;

    @Override
    public String toString() {
      return "Edge{" +
              "destination=" + destination +
              ", distance=" + distance +
              '}';
    }
  }

  String[] countyArray = new String[]{"Mohave", "Coconino", "Navajo", "Apache", "Greenlee", "Cochise", "Santa Cruz",
          "Pima", "Pinal", "Graham", "Gila", "Yavapai", "La Paz", "Yuma", "Maricopa"};

  private int ARR_SIZE = 15;
  private LinkedList<Edge>[] arr = new LinkedList[ARR_SIZE];

  public Assignment8() {
    for (int i = 0; i < ARR_SIZE; i++) {
      arr[i] = new LinkedList<>();
    }
  }

  private void addEdge(int source, int destination, int distance) {
    LinkedList<Edge> items = arr[source];
    Edge edge = new Edge();
    edge.destination = destination;
    edge.distance = distance;
    items.add(edge);


  }

  public void buildGraph(int[][] edges) {
    for (int i = 0; i < edges.length; i++) {
      addEdge(edges[i][0], edges[i][1], edges[i][2]);
    }
  }

  public void printGraph() {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  public int getDistance(int source, int destination) {
    int distanceTraveled = 0;
    int tempDistanceTraveled = 0;
    ArrayList<Integer> visited = new ArrayList<>();
    visited.add(source);
    for (int i = source; i < arr.length; i++) {
      for (Edge edge : arr[i]) {
        if(edge.destination == destination){
          if(edge.distance < distanceTraveled){
            distanceTraveled = edge.distance;
          }
          return distanceTraveled;
        }else {
         // visited.add(i);
          i = edge.destination;
          //tempDistanceTraveled = distanceTraveled;
          for (Edge destEdge : arr[i]){
            if(destEdge.destination == destination && !visited.contains(edge.destination)){
              visited.add(i);
              distanceTraveled += (edge.distance + destEdge.distance);
              if(tempDistanceTraveled == 0){
                tempDistanceTraveled = distanceTraveled;
              }

             if(tempDistanceTraveled < distanceTraveled){
               distanceTraveled = tempDistanceTraveled;
              }
            tempDistanceTraveled = distanceTraveled;
            }
          }
        }
      }
    }
    return distanceTraveled;
  }

  public List<String> getNeighbors(int source){
    List<String> neighborList = new ArrayList<>();
    for(Edge edge : arr[source]){
      neighborList.add(countyArray[edge.destination]);

    }
    return neighborList;
  }


}
