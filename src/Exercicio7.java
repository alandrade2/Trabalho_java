public class Exercicio7 {
    public static void main(String[] args) {
        int x = 180;
        int y = 0;
        boolean stop = true;
        while(stop) {
            if(x % 2 == 0) {
                y = x / 2;      
            } else {
                y = 3 * x + 1;
            }
            x = y;
            if (y <= 1) { 
                stop = false;
            }

            // Para não imprimir o ultimo "->"
            if (y <= 1) { 
                System.out.print(y);
            } else {
                System.out.print(y + " -> ");
            }


        };
    }
}
