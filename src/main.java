import java.util.Stack;

public class main {

    public static void main(String[] args) {

        graph g =new graph();

        g.addNode(new node('a'));
        g.addNode(new node('b'));
        g.addNode(new node('c'));
        g.addNode(new node('d'));
        g.addNode(new node('e'));

        g.addEdge(0,1);
        g.addEdge(0,4);
        g.addEdge(1,0);
        g.addEdge(1,4);
        g.addEdge(1,2);
        g.addEdge(2,1);
        g.addEdge(2,4);
        g.addEdge(2,3);
        g.addEdge(3,2);
        g.addEdge(4,0);
        g.addEdge(4,1);
        g.addEdge(4,2);

       //g.print();
        dfs d = new dfs(g,g.adjList.get(0).get(0));




    }
}