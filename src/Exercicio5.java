public class Exercicio5 {
    public static void main(String[] args) {

        String message = "O fatorial de 0 é 1";


        // fatorial de 20
        System.out.println(message);        
        for(long n = 1, fatorial = 1; n <= 20; n++) {
            fatorial *= n;
            message = "O fatorial de " + n + " é (" + (n - 1) + "!) * " + n + " = " + fatorial;
            System.out.println(message);
        }

        System.out.println("------------------------------------------------------------------");

        // fatorial de 30
        message = "O fatorial de 0 é 1";
        System.out.println(message);        
        for(long n = 1, fatorial = 1; n <= 30; n++) {
            fatorial *= n;
            message = "O fatorial de " + n + " é (" + (n - 1) + "!) * " + n + " = " + fatorial;
            System.out.println(message);
        }        
        System.out.println("------------------------------------------------------------------");

        // fatorial de 40
        message = "O fatorial de 0 é 1";
        System.out.println(message);        
        for(long n = 1, fatorial = 1; n <= 40; n++) {
            fatorial *= n;
            message = "O fatorial de " + n + " é (" + (n - 1) + "!) * " + n + " = " + fatorial;
            System.out.println(message);
        }        

    }
}
