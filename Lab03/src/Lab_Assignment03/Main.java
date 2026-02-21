package Lab_Assignment03;
import java.util.Scanner;

public class Main {

    public static int max(int[] arr) {
        int max = arr[0];
        for (int i : arr) if (i > max) max = i;
        return max;
    }

    public static int min(int[] arr) {
        int min = arr[0];
        for (int i : arr) if (i < min) min = i;
        return min;
    }


    public static int[] minMax(int[] arr) {
        return new int[]{min(arr), max(arr)};
    }

    public static String task7(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        // Part i - min/max from command line args
        int[] numbers = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            numbers[i] = Integer.parseInt(args[i]);
        }
        System.out.println("Minimum = " + min(numbers));
        System.out.println("Maximum = " + max(numbers));

        Scanner scanner = new Scanner(System.in);

        // min/max from Scanner
        System.out.print("Enter array size: ");
        int n = scanner.nextInt();
        int[] scannedNumbers = new int[n];
        for (int i = 0; i < n; i++) {
            scannedNumbers[i] = scanner.nextInt();
        }
        int[] result = minMax(scannedNumbers);
        System.out.println("Minimum = " + result[0]);
        System.out.println("Maximum = " + result[1]);

        // Task 7 - reverse a string
        scanner.nextLine(); // consume leftover newline
        System.out.print("Enter a string to reverse: ");
        String input = scanner.nextLine();
        System.out.println(task7(input));

        scanner.close();
    }
}