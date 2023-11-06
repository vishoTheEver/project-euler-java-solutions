import java.math.BigInteger;
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

    // Problem 4: Largest Palindrome Product
    public int largestPalindromeNumber(int n){
        // finding all palindromes between 10^(n-1) and 10^n-1
        int min_num = (int) Math.pow(10,n-1);
        int max_num = (int) Math.pow(10,n) - 1;
        ArrayList<Integer> palindromes = new ArrayList<>();
        for(int num1 = min_num; num1 < max_num+1; num1++) for(int num2 = min_num; num2 < max_num+1; num2++){
                String product_str = String.valueOf(num1*num2);
                String product_str_reversed = new StringBuilder(product_str).reverse().toString();
                if(product_str.equals(product_str_reversed)) palindromes.add(Integer.parseInt(product_str));
        }
        // finding the max palindrome
        int max_palindrome = palindromes.get(0);
        for(int item: palindromes) if (max_palindrome < item) max_palindrome = item;
        return max_palindrome;
    }

    // Problem 5: Smallest Multiple
    public long smallestMultiple(int start, int end){
        long count = (end+1)-1;
        boolean found_smallest_multiple = false;
        while(!found_smallest_multiple){
            count++;
            long cases_passed = 0;
            for(int i = start; i < end+1; i++) {
                if(count % i == 0) {
                    cases_passed++;
                }
            }
            if(cases_passed == end-start+1){
                found_smallest_multiple = true;
            }
        }
        return count;
    }

    // Problem 6: Sum Square Difference
    public long sumSquareDifference(int start, int end){
        long sum_of_squares = 0;
        long sum = 0; long square_of_sum;
        for(long num = start; num < end+1; num++){
            sum_of_squares += num * num;
            sum += num;
        }
        square_of_sum = sum * sum;
        return square_of_sum-sum_of_squares;
    }

    // Problem 7: 10001st Prime
    public long prime10001st(int n){
        ArrayList<Integer> primes = new ArrayList<>();
        primes.add(2);
        long current_number = 3;
        while(primes.size()<n){
            boolean is_prime = true;
            for(int prime: primes){
                if((long) prime * prime > current_number) break; // optimization considering if a > c and b > c then ab > c
                if(current_number % prime == 0){
                    is_prime = false;
                    break;
                }
            }
            if(is_prime) primes.add((int) current_number);
            current_number++;
        }

        return primes.get(primes.size()-1);
    }

    // Problem 9: Special Pythagoras Triplet
    public int specialPythagorasTriplet(){
        int a, b, c;
        for(a = 0; a <= 1000; a++) for(b=0; b <= 1000; b++) for(c=0; c <= 1000; c++){
            if(a<b && b<c) if(a*a + b*b == c*c) if(a + b + c == 1000){
                return a*b*c;
            }
        }
        return 0;
    }

    // Problem 16: Power Digit Sum
    public int powerDigitSum(int pow){
        BigInteger base = new BigInteger("2"); // unlike in python, int doesn't suffice higher numbers for Math.pow(a,b)
        BigInteger result = base.pow(pow);
        String num = result.toString();

        int sum = 0;
        for(int i = 0; i < num.length(); i++) {
            sum += num.charAt(i) - '0';
        }
        return sum;
    }
}
