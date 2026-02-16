public class Calculator {
    public int add(int a, int b) {
<<<<<<< HEAD
	System.out.println("Adding numbers");
=======
	if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Negative numbers not allowed");
        }
>>>>>>> master
        return a + b;
    }
}
