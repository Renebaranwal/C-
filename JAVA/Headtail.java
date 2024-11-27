
    import java.util.Scanner;

public class Headtail {
    public static void main(String[] args) {
        // Create a scanner to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Input for number of flips
        System.out.print("Enter the number of flips: ");
        int n = scanner.nextInt();
        
        // Call the flipCoin method and get the result
        String result = flipCoin(n);
        
        // Output the result
        System.out.println("After " + n + " flips, the coin is: " + result);
        
        // Close scanner
        scanner.close();
    }

    public static String flipCoin(int n) {
        // Initially, the coin is "Head"
        boolean isHead = true; 
        
        // Flip the coin n times
        for (int i = 1; i <= n; i++) {
            // Toggle the state: If it's Head, make it Tail, and vice versa
            isHead = !isHead;
        }
        
        // Return the state of the coin after n flips
        if (isHead) {
            return "Head";
        } else {
            return "Tail";
        }
    }
}

    

