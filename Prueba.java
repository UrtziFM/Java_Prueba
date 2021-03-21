import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        String name;
        System.out.println("What is your name?");
        name = enter.nextLine();
        System.out.println(name);
        enter.close();
    }
}
