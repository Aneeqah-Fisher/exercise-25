import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the input size
        System.out.print("Enter the input size: ");
        int size = input.nextInt();
        int[] values = new int[size];

        // Prompt the user to enter the series of integers
        System.out.print("Enter the series of integers: ");
        for (int i = 0; i < size; i++) {
            values[i] = input.nextInt();
        }

        // Check if the series contains four consecutive numbers with the same value
        boolean result = isConsecutiveFour(values);

        // Display the result
        if (result) {
            System.out.println("The series contains four consecutive numbers with the same value.");
        } else {
            System.out.println("The series does not contain four consecutive numbers with the same value.");
        }

        input.close();
    }

    public static boolean isConsecutiveFour(int[] values) {
        for (int i = 0; i < values.length - 3; i++) {
            if (values[i] == values[i + 1] && values[i] == values[i + 2] && values[i] == values[i + 3]) {
                return true;
            }
        }
        return false;
    }
}
