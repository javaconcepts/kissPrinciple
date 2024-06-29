package kissPrinciple;

public class Math {
    // Complex approach
    public int calculateFactorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }

    // Simple approach
    public int calculateFactorialSimple(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

}
