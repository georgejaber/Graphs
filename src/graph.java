import java.util.LinkedList;

public class graph {
    LinkedList<LinkedList<node>> adjList;
    graph()
    {
        adjList = new LinkedList<>();
    }
    public void addNode(node node)
    {
        LinkedList<node> tempList = new LinkedList<>();
        tempList.add(node);
        adjList.add(tempList);
    }

    public void addEdge(int str,int end)
    {
        node edgeNode = adjList.get(end).get(0);
        adjList.get(str).add(edgeNode);
    }

    public void print()
    {
        for (LinkedList<node> nodeLinkedList : adjList)
        {
            for (node node:nodeLinkedList)
            {
                System.out.print(node.c + (node!=nodeLinkedList.get(nodeLinkedList.size()-1)?"->":""));
            }
            System.out.println();
        }
    }

}
