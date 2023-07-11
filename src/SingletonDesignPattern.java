
public class SingletonDesignPattern {
    public static void main(String[] args) {

        Kitchen kitchen1 = Kitchen.getInstance();
        Kitchen kitchen2 = Kitchen.getInstance();
        Kitchen kitchen3 = Kitchen.getInstance();

        System.out.println("kitchen1 : "+kitchen1.hashCode());
        System.out.println("kitchen2 : "+kitchen2.hashCode());
        System.out.println("kitchen3 : "+kitchen3.hashCode());

    }
}
//understand by me
//This code starts with a SingletonDesignPattern class, which contains the main method.
// In the main method, three instances of the Kitchen class are created and assigned to kitchen1, kitchen2, and kitchen3 variables.
// Then, the hash codes of these instances are printed.

//....................................
//Design pattern is not "Algorithm or Business logic"
//it is a way of achieving a solution in a particular manner


//batting is a business logic - to score runs

// Pattern of behaviour of batting of Saurav Ganguly


class Kitchen
{
    static Kitchen kitchenRef;// = new Kitchen() ; //single copy - created once

    private Kitchen() {
        System.out.println("Kitchen ctor().....");
    }

    public static Kitchen getInstance() {
        if(kitchenRef == null)
            kitchenRef = new Kitchen(); //can it access private ctor

        return kitchenRef;
    }
}
/*

The Kitchen class is a singleton class, which means it allows only one instance of itself to be created. Here's how it works:

static Kitchen kitchenRef;: This is a static variable that holds the reference to the single instance of the Kitchen class.
private Kitchen(): This is the private constructor of the Kitchen class. It prevents the direct instantiation of the class from outside.
public static Kitchen getInstance(): This is a static method that provides access to the single instance of the Kitchen class. It checks if kitchenRef is null (indicating no instance has been created yet), and if so, it creates a new instance using the private constructor. Finally, it returns the instance.
When the code runs, the following happens:

The main method is executed.
kitchen1, kitchen2, and kitchen3 are assigned the same instance of the Kitchen class obtained by calling getInstance(). Since the Kitchen class is a singleton, all these variables refer to the same instance.
The hash codes of kitchen1, kitchen2, and kitchen3 are printed, which should be the same since they refer to the same object.
In summary, the code demonstrates the Singleton design pattern, ensuring that only one instance of the Kitchen class is created and shared among multiple calls to getInstance().









 */