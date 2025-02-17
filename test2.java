import java.util.Scanner;  // Import Scanner class for user input

public class test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.print("Enter your name: ");  
        String name = scanner.nextLine();  // Read user input
        System.out.println("Hello, " + name + "! Welcome to Java.");  // Output greeting
        scanner.close();  // Close the scanner
    }
}
