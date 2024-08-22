import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GraphCycle {
    public static void main(String[] args) {
        int[][] gr = new int[5][5];
        gr[0][1] = 1;
        gr[0][2] = 1;
        gr[0][3] = 1;
        gr[1][2] = 1;
        gr[1][3] = 1;
        gr[2][4] = 1;
        gr[3][2] = 1;
        gr[3][4] = 1;

        boolean found = detectCycle(gr);
        System.out.println(found);
    }
    public static boolean detectCycle(int[][] gr){
        for(int i=0; i<gr.length; i++){
            if(bfs(gr, i)){
                return true;
            }
        }
        return false;
    }

    public static boolean bfs(int[][]gr, int start){
        Queue<Integer> toVisit = new LinkedList<>();
        List<Integer> visited = new ArrayList<>();

        toVisit.add(start);
        while(!toVisit.isEmpty()){
            int node = toVisit.poll();
            if(visited.contains(node)){
                return true;
            }
            visited.add(node);
            for(int j=0; j<gr.length; j++){
                if(gr[node][j] == 1 && !toVisit.contains(j)){
                    toVisit.add(j);
                }
            }
        }
        return false;
    }
}
