public class Exercicio4 {
    public static void main(String[] args) {

        String message = "O fatorial de 0 é 1";
        System.out.println(message);
        
        for(int n = 1, fatorial = 1; n <= 10; n++) {
            fatorial *= n;
            message = "O fatorial de " + n + " é (" + (n - 1) + "!) * " + n + " = " + fatorial;
            System.out.println(message);


        }



    }
}
