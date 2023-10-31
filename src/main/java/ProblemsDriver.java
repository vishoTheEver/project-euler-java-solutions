public class ProblemsDriver {
    public static void main(String[] args) {
        // Instantiation
        Problems problems = new Problems();

        // Problem 1: Multiples of 3 or 5
        System.out.println("Solution 1: " + problems.multiplesOf3or5(1000));

        // Problem 2: Even Fibonacci Numbers
        System.out.println("Solution 2: " + problems.evenFibonacciNumbers(4000000));

        // Problem 3: Largest Prime Factors
        System.out.println("Solution3: " + problems.largestPrimeFactor(600851475143L));
    }
}
