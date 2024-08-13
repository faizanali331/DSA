public class PowerByRecursion {
    public int findPower(int a, int n){
        if(n==1){
            return a;
        }else if(n%2==1){
            int temp =  findPower(a, (n-1)/2);
            return temp*temp*a;
        }else {
           int temp = findPower(a, n / 2);
           return temp*temp;
        }
    }
}
