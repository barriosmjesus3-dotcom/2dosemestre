public class Fibonacci {

    // Método estático para poder llamarlo directamente desde main
    public static int fibo(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            // Corrección: Debe llamarse a fibo(n - 1), no a fibo(n + 1)
            return fibo(n - 1) + fibo(n - 2);
        }
    }

    public static void main(String[] args) {
        int n = 5;
        int res = fibo(n); // En Java solo pasas el valor o variable
        System.out.println("fibonacci = " + res); // Falta el punto en System.out.println
    }
}