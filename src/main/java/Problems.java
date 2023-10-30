public class Problems {

    // Problem 1: Multiples of 3 or 5
    public int multiplesOf3or5(int n){
        int sum = 0;
        for(int i = 0; i < n; i++) if(i%3==0 || i%5==0) sum+=i;
        return sum;
    }

    // Problem 2: Even Fibonacci Numbers
    public int evenFibonacciNumbers(int n){
        int t1 = 1, t2 = 2;
        int sum = 0;

        while(t2 <= n){
            if(t2 % 2 == 0) sum += t2;

            // t1 changes to t2 & t2 changes to t1 + t2
            int temp = t1;
            t1 = t2;
            t2 = temp + t2;
        }
        return sum;
    }
}
