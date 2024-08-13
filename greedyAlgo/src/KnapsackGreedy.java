
import java.util.HashMap;
import java.util.Map;

public class KnapsackGreedy {
    public static class WeightProfit {
        int objectName;
        int weight;
        int profit;

        public WeightProfit(int objectName, int weight, int profit) {
            this.objectName = objectName;
            this.weight = weight;
            this.profit = profit;
        }
    }

    public static void main(String[] args) {
        WeightProfit[] wp = new WeightProfit[5];
        wp[0] = new WeightProfit(1, 6, 24);
        wp[1] = new WeightProfit(2, 3, 24);
        wp[2] = new WeightProfit(3, 5, 30);
        wp[3] = new WeightProfit(4, 8, 57);
        wp[4] = new WeightProfit(5, 7, 35);

        int bag = 22;
        float totalProfit = 0;

        class WeightProfitRate {
            int weight;
            float rate;

            WeightProfitRate(int weight, float rate) {

                this.weight = weight;
                this.rate = rate;
            }
        }
        WeightProfitRate[] wpr = new WeightProfitRate[5];
        int i = 0;
        for (WeightProfit x : wp) {
            wpr[i] = new WeightProfitRate(x.weight, (float) x.profit / x.weight);
            i++;
        }
        for(int j=0; j<wpr.length-1; j++){
            for(int k=j+1; k<wpr.length; k++){
                if(wpr[k-1].rate<wpr[k].rate){
                    WeightProfitRate temp = wpr[k-1];
                    wpr[k-1]=wpr[k];
                    wpr[k]=temp;
                }
            }
        }

        for(WeightProfitRate  x: wpr){
            if(bag- x.weight<0){
                totalProfit=totalProfit+bag*x.rate;
                break;
            }else{
                bag=bag-x.weight;
                totalProfit = totalProfit+x.rate* x.weight;
            }
        }
        System.out.println(totalProfit);
    }
}

