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
        int n1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, insert an integer number: ");
        n1 = sc.nextInt();
        sc.close();
        if (n1 > 0) {
            System.out.println("The given value is positive.");
        } else if (n1 == 0) {
            System.out.println("The given value is zero.");
        } else {
            System.out.println("The given value is negative.");

        }
    }

    public static void exercise24() {
        int n1, n2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, insert the first value: ");
        n1 = sc.nextInt();
        System.out.println("Please, insert the second value: ");
        n2 = sc.nextInt();
        sc.close();
        if (n1 % n2 == 0) {
            System.out.println(n1 + " is multiple of " + n2);
        } else {
            System.out.println(n1 + " is not multiple of " + n2);

        }
    }

    public static void exercise25() {
        int n1, n2, n3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, insert the first value: ");
        n1 = sc.nextInt();
        System.out.println("Please, insert the second value: ");
        n2 = sc.nextInt();
        System.out.println("Please, insert the third value: ");
        n3 = sc.nextInt();
        sc.close();
        int max = Math.max(n1, Math.max(n2, n3));
        int min = Math.min(n1, Math.min(n2, n3));
        int mid = n1 + n2 + n3 - max - min;
        System.out.println("The ordered numbers are: " + max + " > " + mid + " > " + min);
    }

    public static void exercise26() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, insert a numeric value: ");
        float number = scanner.nextFloat();
        scanner.close();
        System.out.println("Your corresponding academic grading is: ");
        if (number >= 9 && number <= 10) {
            System.out.println("A");
        } else if (number >= 8 && number <= 8.9) {
            System.out.println("B");
        } else if (number >= 7 && number <= 7.9) {
            System.out.println("C");
        } else if (number >= 6 && number <= 6.9) {
            System.out.println("D");

        } else if (number >= 5 && number <= 5.9) {
            System.out.println("E");
        } else if (number >= 0 && number <= 4.9) {
            System.out.println("F");
        } else {
            System.out.println("Invalid value");

        }
    }

    public static void exercise27() {
        int day, month, year;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert day: ");
        day = sc.nextInt();
        System.out.println("Insert month: ");
        month = sc.nextInt();
        System.out.println("Insert year: ");
        year = sc.nextInt();
        sc.close();

        if (day >= 1 && day <= 30) {
            if (month >= 1 && month <= 12) {
                if (year >= 1) {
                    System.out.println("The given date is " + day + "/" + month + "/" + year);
                } else {
                    System.out.println("Wrong year value.");
                }
            } else {
                System.out.println("Wrong month value.");
            }
        } else {
            System.out.println("Wrong day value.");
        }
    }

    public static void exercise28() {
        Scanner scanner = new Scanner(System.in);
        int number;
        int square;
        String message = "The square value of the given number is: ";
        System.out.print(message);
        number = scanner.nextInt();
        while (number >= 0) {
            square = number * number;
            System.out.println("The square value of the given number is " + square);
            System.out.print(message);
            number = scanner.nextInt();

        }
        scanner.close();
    }

    public static void exercise29() {
        Scanner sc = new Scanner(System.in);
        int number;
        String message = "Insert an integer number: ";
        System.out.print(message);
        number = sc.nextInt();
        while (number != 0) {
            Aventura2.isEven(number);
            System.out.print(message);
            number = sc.nextInt();

        }
        sc.close();

    }

    public static void exercise30() {
        Scanner sc = new Scanner(System.in);
        int number, count = 0;
        String message = "Insert an integer number: ";
        System.out.print(message);
        number = sc.nextInt();
        while (number != 0) {
            count++;
            System.out.print(message);
            number = sc.nextInt();

        }
        System.out.println("The total numbers read is " + count);
        sc.close();

    }

    public static void exercise31() {
        Scanner sc = new Scanner(System.in);
        int number, even = 0, odd = 0;
        String message = "Insert an integer number: ";
        System.out.print(message);
        number = sc.nextInt();
        while (number != 0) {
            if (Aventura2.isEven2(number)) {
                even++;
            } else {
                odd++;
            }
            System.out.print(message);
            number = sc.nextInt();

        }
        System.out.println("The total of even numbers read is " + even);
        System.out.println("The total of odd numbers read is " + odd);
        sc.close();

    }
}
