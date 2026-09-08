import java.util.*;

public class Main{

    private final static String WELCOME_MESSAGE = "Olá, informe o seu nome";

    public static void main(String[] args) {
        /* My comment here */
        var scanner = new Scanner(System.in);
        System.out.println(WELCOME_MESSAGE);
        String name = scanner.next();

        System.out.println("Olá, informe a sua idade");
        int age = scanner.nextInt();

        System.out.printf("Olá, %s! Sua idade é %s", name, age);
    }

}