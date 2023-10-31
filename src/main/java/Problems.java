import java.util.ArrayList;

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

    // Problem 3: Largest Prime Factor
    public long largestPrimeFactor(long n){
        // factors of n
        ArrayList<Long> factors = new ArrayList<>();
        for(long i = 2; i < Math.sqrt(n); i++) if(n % i == 0) factors.add(i);

        // prime factors of n
        ArrayList<Long> prime_factors = new ArrayList<>();
        for(long factor: factors) {
            boolean is_prime = true;
            for(long i = 2; i < factor; i++) if(factor % i == 0){
                is_prime = false; // proven non-prime
                break; // stops further
            }
            if(is_prime) prime_factors.add(factor);
        }

        // largest prime factor in n
        return prime_factors.get(prime_factors.size()-1); // last value is largest
    }
}
