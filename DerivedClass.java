package advanced.accessmodifiers;

public class DerivedClass extends BaseClass {

	 // Public variable: accessible from anywhere
    public int derivedVariable = 20;
    
    // Public method overriding the protected method in BaseClass
    @Override
    public void baseMethod() {
        System.out.println("DerivedClass: derivedMethod()");
    }
	
	
	
}
