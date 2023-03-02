import java.util.Scanner;

class Exercise9 {
    public static void main(String[] args) {
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