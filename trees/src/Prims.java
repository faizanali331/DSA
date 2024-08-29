import java.util.*;

public class Prims {
    static class Edge implements Comparable<Edge>{
        int weight;
        int source ;
        int destination;
        Edge(int weight, int source, int destination){
            this.weight = weight;
            this.source = source;
            this.destination = destination;
        }
        @Override
        public int compareTo(Edge other){
            return Integer.compare(this.weight, other.weight);
        }
    }

    public static void main(String[] args) {

        List<Integer> visited = new ArrayList<>();
        List<List<Edge>> ll = new ArrayList<>();
        List<Edge> list0Node = new ArrayList<>();

        list0Node.add(new Edge(70, 0, 1));
        list0Node.add(new Edge(80, 0, 2));

        List<Edge> list1Node = new ArrayList<>();
        list1Node.add(new Edge(70, 1, 0));
        list1Node.add(new Edge(10, 1, 2));
        list1Node.add(new Edge(50, 1, 4));
        list1Node.add(new Edge(30, 1, 3));

        List<Edge> list2Node = new ArrayList<>();
        list2Node.add(new Edge(60, 2, 3));
        list2Node.add(new Edge(80, 2, 0));
        list2Node.add(new Edge(10, 2, 1));
        list2Node.add(new Edge(40, 2, 4));

        List<Edge> list3Node = new ArrayList<>();
        list3Node.add(new Edge(30, 3,1));
        list3Node.add(new Edge(60, 3, 2));
        list3Node.add(new Edge(20, 3, 4));

        List<Edge> list4Node = new ArrayList<>();
        list4Node.add(new Edge(50, 4, 1));
        list4Node.add(new Edge(40, 4, 2));
        list4Node.add(new Edge(20, 4, 3));

        ll.add(list0Node);
        ll.add(list1Node);
        ll.add(list2Node);
        ll.add(list3Node);
        ll.add(list4Node);

        PriorityQueue<Edge> pq = new PriorityQueue<>();

        for(Edge e:list0Node){
            pq.add(e);
        }
        visited.add(0);
        while(!pq.isEmpty()){
            Edge temp = pq.poll();
            if(!visited.contains(temp.destination)){
                visited.add(temp.destination);
                //System.out.print(temp.destination);
                for(Edge e : ll.get(temp.destination)) {
                    pq.add(e);
                }
            }
        }
        for(Integer x: visited)
            System.out.print(x+" ");
    }
}
