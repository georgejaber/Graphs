import java.util.LinkedList;
import java.util.stream.Collector;

public class node  {
    node(){}
    Boolean visited=false;
    char c;
    public node(char c) {
        this.c = c;
    }
    public char getChar() {
        return c;
    }
    public void setChar(char c) {
        this.c = c;
    }
    public Boolean getVisited() {
        return visited;
    }
    public void setVisited(Boolean visited) {
        this.visited = visited;

    }
}
