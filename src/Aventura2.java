public class Aventura2 {
    public static float calculateArea(float radius) {
        final float PI = 3.1416f;
        return PI * radius * radius;
    }

    public static float calculatePerimeter(float radius) {
        final float PI = 3.1416f;
        return 2 * PI * radius;
    }

    public static void isEven(int number) {
        if (number % 2 == 0) {
            System.out.println("The given number is even.");
        } else {
            System.out.println("The given number is odd.");
        }
    }
    public static boolean isEven2(int number) {
        return number % 2 == 0;

    }
}
