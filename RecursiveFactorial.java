public class RecursiveFactorial {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++)
            System.out.println(i + "\t" + factorial(i));
    }

    static int factorial(int n) {
        if (n < 2) 
            return 1; // base case
        else 
            return n * factorial(n - 1); // recursive case
    }
}
