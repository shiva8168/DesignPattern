
//Singleton pattern in java is design pattern where an application wants to have one instance of a class in the whole application.
// steps to  create singleton pattern
//  1. make constructor private
//  2. create a static method to get the instance of the class
//  3. create a private static variable of the same class

// types of singleton pattern
// type 1: Eager initialization
// type 2: Lazy initialization
// type 3: Thread safe singleton  (if multiple threads are trying to access the singleton object then it will create multiple objects)
public class SingletonPattern {
    // private static SingletonPattern instance = new SingletonPattern(); // eager way of singleton initialization
    /*
     * the disadvantage of using eager way is that if that singleton object is not
     * used then it will lead loss of memory
     */

    private static SingletonPattern instance ; //lazy way of singleton
    // initialization

    private SingletonPattern() {
        System.out.println("Singleton object created");
    }

    public static SingletonPattern getSingletonPatternInstance() {
        if (instance == null) {

            synchronized (SingletonPattern.class) {// thread safe singleton for lazy initialization
                if (instance == null)
                    instance = new SingletonPattern();
            }
        }
        return instance;
    }
}
