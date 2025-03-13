public class VariableScope {
    
    // Global variable
    static int count = 100;

    // Step 2: Define the main method
    public static void main(String[] args) {
        // Print global count from main method
        System.out.println("Global Count (from main): " + count);
        
        // Call the showScope method
        showScope();
    }

    // Step 3: Define the showScope method
    public static void showScope() {
        // Local variable
        int count = 50;
        
        // Print global count (from this method, showing the same global count)
        System.out.println("Global Count (from showScope): " + VariableScope.count);
        
        // Print local count
        System.out.println("Local Count (from showScope): " + count);
    }
}
	