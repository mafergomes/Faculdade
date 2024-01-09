package Grapho;

public class Program {
    public static void main(String[] args) {

        Graph<String> graph = new Graph<String>();
        graph.addVerter("a");
        graph.addVerter("b");
        graph.addVerter("c");
        graph.addVerter("d");
        graph.addVerter("e");
        graph.addVerter("j");
        graph.addVerter("k");

    
        graph.addAresta("a", "b");
        graph.addAresta("b", "c");
        graph.addAresta("c", "d");
        graph.addAresta("a", "e");
        graph.addAresta("e", "j");
        graph.addAresta("e", "k");
 
        graph.buscaEmLargura();
    }
}
