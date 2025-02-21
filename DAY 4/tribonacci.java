public class tribonacci {
    
    class Solution {  
        public int tribonacci(int n) {  
            if (n == 0) {  
                return 0;  
            }  
            if (n == 1 || n == 2) {  
                return 1;  
            }  
            // Variables to hold the last three Tribonacci numbers  
            int a = 0; // T(0)  
            int b = 1; // T(1)  
            int c = 1; // T(2)  
        
            int ft = 0; // This will hold T(n)  
        
            // Start calculating from T(3) to T(n)  
            for (int i = 3; i <= n; i++) {  
                ft = a + b + c;  // T(n) = T(n-1) + T(n-2) + T(n-3)  
                a = b;           // Move to the next number  
                b = c;           // Move to the next number  
                c = ft;          // Update the most recent number  
            }  
        
            return ft;  // Return the nth tribonacci number  
        }  
    }

    public static void main(String[] args) {
        // Create an instance of the Tribonacci class to access the Solution class
        tribonacci tribonacciInstance = new tribonacci();
        
        // Create an instance of Solution class
        Solution solution = tribonacciInstance.new Solution();
        
        // Call tribonacci method and print the result for a given n (e.g., n = 5)
        int result = solution.tribonacci(5);  
        System.out.println("The 5th Tribonacci number is: " + result);  // Should print 7
    }
}
