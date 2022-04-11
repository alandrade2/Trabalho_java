public class Exercicio6 {

    static long fib(int n) {
        if (n < 2 ) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }


    public static void main(String[] args) {
        long x = 0;

        for (int i = 0; i <= 15; i++) {
            x = fib(i);
            if(x >= 150) {
                System.out.print(".");
            } else {
                System.out.print(x + ", ");
            }
        }
    }
}
