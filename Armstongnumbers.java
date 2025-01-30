import java.util.Scanner;
public class Armstrongnumbers {
    public static boolean isArmstrong(int number) {
        int sum = 0, originalNumber = number;
        int digits = Integer.toString(number).length();
        
        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digits);
            number /= 10;
        }
        return sum == originalNumber;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);       
        System.out.print("Enter the range (start end): ");
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        for (int i = start; i <= end; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
        scanner.close();
    }
}
