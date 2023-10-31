public class ProblemsDriver {
    public static void main(String[] args) {
        // Instantiation
        Problems problems = new Problems();

        // Problem 1: Multiples of 3 or 5
        System.out.println("Solution 1: " + problems.multiplesOf3or5(1000));

        // Problem 2: Even Fibonacci Numbers
        System.out.println("Solution 2: " + problems.evenFibonacciNumbers(4000000));

        // Problem 3: Largest Prime Factors
        System.out.println("Solution 3: " + problems.largestPrimeFactor(600851475143L));

        // Problem 4: Largest Palindrome Product
        System.out.println("Solution 4: " + problems.largestPalindromeNumber(3));

        // Problem 5: Smallest Multiple
        System.out.println("Solution 5: " + problems.smallestMultiple(1,20));
    }
}
