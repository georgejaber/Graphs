import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

public class dfs {

    Stack<node> stack = new Stack<>();

    public dfs(graph g,node root)
    {
        stack.removeAllElements();

        stack.push(root);

        while (!stack.isEmpty())
        {
            node temp = stack.pop();
            temp.setVisited(true);

            System.out.print(temp.c);
            
            LinkedList<node> tempList = null;
            for (LinkedList<node> ll : g.adjList)
            {
                if(ll.get(0)==temp)
                {
                    tempList =ll;
                    break;
                }
            }

            for (node n:tempList)
            {
                if(!n.getVisited()&&!stack.contains(n))
                {
                    stack.push(n);
                }

            }
        }
        System.out.println();


    }




}
