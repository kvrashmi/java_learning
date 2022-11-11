package abstraction;
/*
 * In Java, we can have an abstract class without any abstract method. This allows us to create classes that cannot be 
 * instantiated but can only be inherited. 
 */
public abstract class AbstractClass3 {
    void fun()
    {
        System.out.println("Non abstract method from Abstract class3...");
    }
    
    //abstract void notFun();
}
