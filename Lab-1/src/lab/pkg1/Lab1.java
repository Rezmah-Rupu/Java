package lab.pkg1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

class ArrayListExample {

    ArrayList<Integer> vertices = new ArrayList<Integer>();
    //int v[] = new int[10];

    public void setArrayList(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            vertices.add(arr[i]);
        }
    }

    public void display() {
        for (int i = 0; i < vertices.size(); i++) {
            System.out.println(" " + vertices.get(i));
        }
    }

}

class QueueExample {

    LinkedList<Integer> queue = new LinkedList<>();

    void setQueue(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                queue.offer(matrix[i][j]);
            }
        }
    }

    void show() {
        while (queue.size() > 0) {
            int value = queue.poll();
            System.out.println(" " + value);
        }
    }
}

class Graph {

    public int n;
    public int adj[][] = new int[10][10];

    public Graph(int n) {
        adj = new int[n][n];
        this.n = n;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                adj[i][j] = 0;
            }
        }
    }

    public Graph(int adj[][]) {
        this.adj = adj;
    }

    void addEdge(int u, int v) {
        adj[u][v] = 1;
        adj[v][u] = 1;
    }

    void printGraph() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" " + adj[i][j]);
            }
            System.out.println();
        }
    }

    boolean isConnected(int u, int v) {
        if (adj[u][v] == 1) {
            return true;
        } else {
            return false;
        }
    }

    int countInOrOutDegree(int u) {
        int c = 0;
        for (int i = u; i <= u; i++) {
            for (int j = 0; j < adj[i].length; j++) {
                if (adj[i][j] == 1) {
                    c++;
                }
            }
        }
        System.out.println(u + " InOrOutDegre is  = " + c);
        return 0;
    }

    int countNeighbours(int u) {

        int c = 0;
        for (int i = u; i <= u; i++) {
            for (int j = 0; j < adj[i].length; j++) {
                if (adj[i][j] == 1) {
                    c++;
                }
            }
        }
        System.out.println("Number " + u + " total neighbour is = " + c);

        return 0;
    }

    boolean isDirected() {
        //Graph  dir = new Graph();
        // if(adj[u][v]  == adj[v][u])
        int count = 0;
        for (int i = 0; i < adj.length; i++) {
            for (int j = 0; j < adj[i].length; j++) {
                if (adj[i][j] == adj[j][i]) {
                    count++;
                }
            }
        }
        if (count == adj.length) {
            return true;
        } else {
            return false;
        }
    }
    // return false;   
}

public class Lab1 {

    public static void main(String[] args) {
        int a[] = {4, 5, 6, 8, 10};
        int matrix[][] = {{1, 2, 3},
        {4, 5, 6}};

        ArrayListExample arraylistexample = new ArrayListExample();
        arraylistexample.setArrayList(a);
        arraylistexample.display();
        QueueExample queueexample = new QueueExample();
        queueexample.setQueue(matrix);
        queueexample.show();

        Graph graph = new Graph(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.printGraph();
        int adj[][] = {{1, 0, 1, 1, 1},
        {0, 1, 0, 1, 0},
        {0, 1, 1, 0, 1},
        {1, 1, 0, 1, 0}};

        Graph graph1 = new Graph(adj);
        graph1.printGraph();
        boolean isDirected = graph.isDirected();
        if (isDirected == false) {
            System.out.println("This graph is not directed");
        } else {
            System.out.println("This graph is directed");
        }

        boolean isConnected = graph.isConnected(1, 1);
        if (isConnected == false) {
            System.out.println("\n The graph is Not connected.");
        } else {
            System.out.println("\n The graph is Connected");
        }

        Scanner input1 = new Scanner(System.in);
        System.out.println("The Vertix Number is 0, 1, 2, 3, 4");
        System.out.print("Enter the InDegre or Outdegre number :");
        int deg = input1.nextInt();
        int countInOrOutDegree = graph.countInOrOutDegree(deg);

        Scanner input = new Scanner(System.in);
        System.out.println("\nThe Vertix Number is 0, 1, 2, 3, 4");
        System.out.print("Enter the Neighbors number :");
        int num = input.nextInt();
        int countNeighbours = graph.countNeighbours(num);

    }

}
