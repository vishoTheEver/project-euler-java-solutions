public class Problems {

    // Problem 1: Multiples of 3 or 5
    public int multiplesOf3or5(int n){
        int sum = 0;
        for(int i = 0; i < n; i++) if(i%3==0 || i%5==0) sum+=i;
        return sum;
    }
}
