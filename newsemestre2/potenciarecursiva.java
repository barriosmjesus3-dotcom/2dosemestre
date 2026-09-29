public class potenciarecursiva {

    // Método recursivo para calcular n^m
    public static int potencia(int n, int m) {
        if (m == 0) {
            return 1; // Caso base: cualquier número elevado a 0 es 1
        } else {
            return n * potencia(n, m - 1); // Paso recursivo: n * n^(m-1)
        }
    }

    public static void main(String[] args) {
        int n = 5;
        int m = 4;
        int res = potencia(n, m);
        System.out.println("Resultado es " + res);
    }
}
