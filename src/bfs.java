import java.util.LinkedList;
import java.util.Queue;

public class bfs {
    Queue<node> queue = new LinkedList<>();


    public bfs(graph g, node root) {

        queue.add(root);

        while (!queue.isEmpty()) {
            node temp = queue.remove();
            temp.setVisited(true);

            System.out.print(temp.c);

            LinkedList<node> tempList = null;
            for (LinkedList<node> ll : g.adjList) {
                if (ll.get(0) == temp) {
                    tempList = ll;
                }
            }

            for (node n : tempList) {
                if (!n.getVisited() && !queue.contains(n)) {
                    queue.add(n);
                }

            }
        }
        System.out.println();


    }


}


