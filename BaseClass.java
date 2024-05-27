package advanced.accessmodifiers;

public class BaseClass {
	// Private variable: only accessible within this class
    private int baseVariable = 10;
    
    // Protected method: accessible within the same package and by subclasses
    protected void baseMethod() {
        System.out.println("BaseClass: baseMethod()");
    }
	
}
