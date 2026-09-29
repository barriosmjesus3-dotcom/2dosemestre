public class potencia {
    public static void main(String[] args) {
        int n = 5;
        int m = 4;
        int res = 1;
        for (int i = 0; i < m; i++) {
            res = res * n;
        }
        System.out.println("Resultado es " + res);
    }
}