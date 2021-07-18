public class Main {

    public static void main(String[] args) {
        Graph graph = new Graph(10);

        graph.addEdge(0,9);
        graph.addEdge(1,2);
        graph.addEdge(2,3);
        graph.addEdge(3,4);
        graph.addEdge(4,7);
        graph.addEdge(7,6);
        graph.addEdge(6,5);
        graph.addEdge(5,8);
        graph.addEdge(5,9);
        graph.addEdge(1,7);
        graph.addEdge(8,4);

        BreadthFirstPath bfp = new BreadthFirstPath(graph,0);

        System.out.println(bfp.pathTo(3));
    }
}
