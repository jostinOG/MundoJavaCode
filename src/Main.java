import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int option;
        do {
            Menu.showMenu();
            option = Menu.readOption();
            Menu.runExercise(option);
        } while (option != 0);
    }

    public static void exercise15() {
        System.out.print("Hello CODELEARN");
    }

    public static void exercise16() {
        int a = 8;
        int b = 7;
        int result = a + b;
        System.out.print("The sum of " + a + " and " + b + " is " + result);
    }

    public static void exercise17() {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Please, insert first number: ");
        a = sc.nextInt();
        System.out.println("Please, insert second number: ");
        b = sc.nextInt();
        sc.close();
        System.out.println("The sum of " + a + " and " + b + " is " + (a + b));

    }

    public static void exercise18() {
        Scanner sc = new Scanner(System.in);
        int a;
        String s;
        System.out.println("Please, insert your name: ");
        s = sc.nextLine();
        System.out.println("Please, insert your age: ");
        a = sc.nextInt();
        sc.close();
        System.out.println("Hi, " + s + ". You are " + a + " years old.");

    }

    public static void exercise19() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, insert the radius of a circle: ");
        float radius = scanner.nextFloat();
        scanner.close();
        float area = Aventura2.calculateArea(radius);
        System.out.printf("The area of a circle of radius %.1f is %.2f", radius, area);
    }

    public static void exercise20() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, insert the radius of a circle: ");
        float radius = scanner.nextFloat();
        scanner.close();
        float perimeter = Aventura2.calculatePerimeter(radius);
        System.out.printf("The perimeter of a circle of radius %.1f is %.2f", radius, perimeter);


    }

    public static void exercise21() {
        float a, b;

        Scanner sc = new Scanner(System.in);

        System.out.println("Please, insert the first value ");

        a = sc.nextFloat();

        System.out.println("Please, insert the second value: ");

        b = sc.nextFloat();
        sc.close();
        if (a > b) {
            System.out.println("The first value is greater than the second");
        } else {
            System.out.println("The second value is greater or equal than the first");

        }
    }

    public static void exercise22() {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, insert the first value: ");
        a = sc.nextInt();
        System.out.println("Please, insert the second value: ");
        b = sc.nextInt();
        if (a == b) {
            System.out.println("The two values are equal");
        } else {
            System.out.println("The two values are different");

        }
    }

    public static void exercise23() {
    }

    public static void exercise24() {
    }

    public static void exercise26() {
    }

    public static void exercise27() {
    }

    public static void exercise28() {
    }

    public static void exercise29() {
    }

    public static void exercise30() {
    }
}
