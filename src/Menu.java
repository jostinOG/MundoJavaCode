import java.util.Scanner;

public class Menu {
    public static void showMenu() {
        System.out.println(Colors.GREEN + "=== Menu ===" + Colors.RESET);
        System.out.println(Colors.PURPLE + "1. Exercice 15" + Colors.RESET);
        System.out.println(Colors.PURPLE + "2. Exercice 16" + Colors.RESET);
        System.out.println(Colors.PURPLE + "3. Exercice 17" + Colors.RESET);
        System.out.println(Colors.PURPLE + "4. Exercice 18" + Colors.RESET);
        System.out.println(Colors.PURPLE + "5. Exercice 19" + Colors.RESET);
        System.out.println(Colors.PURPLE + "6. Exercice 20" + Colors.RESET);
        System.out.println(Colors.PURPLE + "7. Exercice 21" + Colors.RESET);
        System.out.println(Colors.PURPLE + "8. Exercice 22" + Colors.RESET);
        System.out.println(Colors.PURPLE + "9. Exercice 23" + Colors.RESET);
        System.out.println(Colors.PURPLE + "10. Exercice 24" + Colors.RESET);
        System.out.println(Colors.PURPLE + "11. Exercice 25" + Colors.RESET);
        System.out.println(Colors.PURPLE + "12. Exercice 26" + Colors.RESET);
        System.out.println(Colors.PURPLE + "13. Exercice 27" + Colors.RESET);
        System.out.println(Colors.PURPLE + "14. Exercice 28" + Colors.RESET);
        System.out.println(Colors.PURPLE + "15. Exercice 29" + Colors.RESET);
        System.out.println(Colors.PURPLE + "16. Exercice 30" + Colors.RESET);
        System.out.println(Colors.RED + "0. Quitter" + Colors.RESET);

    }

    public static int readOption() {
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        scanner.close(); // Close the scanner to avoid memory leaks
        return option;
    }

    public static void runExercise(int option) {
        switch (option) {
            case 1 -> Main.exercise15();
            case 2 -> Main.exercise16();
            case 3 -> Main.exercise17();
            case 4 -> Main.exercise18();
            case 5 -> Main.exercise19();
            case 6 -> Main.exercise20();
            case 7 -> Main.exercise21();
            case 8 -> Main.exercise22();
            case 9 -> Main.exercise23();
            case 10 -> Main.exercise24();
            case 11 -> Main.exercise25();
            case 12 -> Main.exercise26();
            case 13 -> Main.exercise27();
            case 14 -> Main.exercise28();
            case 15 -> Main.exercise29();
            case 16 -> Main.exercise30();
            case 17 -> Main.exercise31();
            case 0 -> System.out.println("Bye!");
            default -> System.out.println("Invalid option");
        }

    }


}
