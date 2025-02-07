import java.util.*;

class palindrome {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int temp = x;
        int rx = 0;

        while (temp > 0) {
            int ld = temp % 10;
            rx = rx * 10 + ld;
            temp /= 10;
        }

        return rx == x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int x = sc.nextInt();
        
        // Create an object of Solution class
        palindrome p = new palindrome();
        
        // Call the instance method
        boolean result = p.isPalindrome(x);

        // Print result
        System.out.println("Is Palindrome:: " + result);

        sc.close(); // Close the scanner to prevent resource leak
    }
}
