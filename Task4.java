import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть ваш вибір (Ok, Так, OK, Yes, Y, +, Ні, NO, N, No, -");
        String choice = scanner.next();

        switch (choice) {
            case "Ok":
            case "Так":
            case "OK":
            case "Yes":
            case "Y":
            case "+":
                System.out.println("Я погоджуюсь");
                break;
            case "Ні":
            case "NO":
            case "N":
            case "No":
            case "-":
                System.out.println("Я відмовляюсь");
                break;
            default:
                System.out.println("Невірний вибір");

        }

    }
}
