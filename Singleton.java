import java.security.PublicKey;
import java.util.List;
import java.util.concurrent.RecursiveTask;

public class Singleton {
    //Intsnace type variable which should be private static so that we can restrict access
    private static Singleton instance = null;

    //Private constructor
    private Singleton() {
    }

    //Public static method which is accessible from outside by using the classname
    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    //all other methods in singleton class should be protected
    protected void demoMethod() {
        System.out.println("Demo methood for Singleton!!");
    }
}
