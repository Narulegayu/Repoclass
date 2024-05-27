package org.advanced;

import advanced.accessmodifiers.DerivedClass;

public class OutsideClass {
    public static void main(String[] args) {
        DerivedClass derivedObj = new DerivedClass();
        
        // Attempt to access baseMethod (public in DerivedClass)
        derivedObj.baseMethod(); // This should work because baseMethod is overridden as public in DerivedClass

        // Attempt to access derivedVariable (public variable in DerivedClass)
        System.out.println("Derived Variable: " + derivedObj.derivedVariable); // This should work because derivedVariable is public
        
        // Attempt to access baseVariable (private in BaseClass)
        // This will cause a compilation error because baseVariable is private
        // System.out.println("Base Variable: " + derivedObj.baseVariable);

        // Attempt to access baseMethod of BaseClass directly (protected)
        // This will cause a compilation error because baseMethod in BaseClass is protected and we are outside the package and not a subclass
        // BaseClass baseObj = new BaseClass();
        // baseObj.baseMethod(); 
    }
}
