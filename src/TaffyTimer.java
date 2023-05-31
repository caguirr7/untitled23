import java.util.Scanner;

public class TaffyTimer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Starting Taffy Timer...");
        System.out.print("Enter the temperature: ");

        int temperature = scanner.nextInt();

        while (temperature < 270) {
            System.out.println("\nThe mixture isn't ready yet.");
            System.out.print("Enter the temperature: ");
            temperature = scanner.nextInt();
        }

        System.out.println("Your taffy is ready for the next step!");


    }
}
