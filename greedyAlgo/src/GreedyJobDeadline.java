import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GreedyJobDeadline {
    public static class Jobs{
        int deadLine;
        int profit;
        String nameOfJob;

        public Jobs(int deadLine, int profit, String nameOfJob){
            this.deadLine = deadLine;
            this.profit = profit;
            this.nameOfJob = nameOfJob;
        }
    }
    public static void main(String[] args) {
        Jobs[] job = new Jobs[5];

        job[0] = new Jobs(3, 85, "j1");
        job[1] = new Jobs(1, 90, "j2");
        job[2] = new Jobs(4, 130, "j3");
        job[3] = new Jobs(2, 95, "j4");
        job[4] = new Jobs(3, 100, "j5");

        for(int i=0; i<job.length-1; i++){
            int max=i;
            for(int j=i+1; j<job.length; j++){
                if(job[max].profit<job[j].profit){
                    max=j;
                }
            }
            if(max!=i){
                Jobs temp=job[i];
                job[i]=job[max];
                job[max]=temp;
            }
        }
        List<String> l = new ArrayList<>();

        for(int i=4; i>0; i--){
            for(int j=0; j<job.length; j++){
                if(job[j].deadLine>=i&&!l.contains(job[j].nameOfJob)){
                    l.add(job[j].nameOfJob);
                    break;
                }
            }
        }
        for(String x: l)
            System.out.print(x+" ");
    }
}
