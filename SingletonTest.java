import java.security.PublicKey;
import java.util.List;
import java.util.concurrent.RecursiveTask;

public class SingletonTest{
    public static void main(String args[]) {
        Singleton singleton = Singleton.getInstance();
        singleton.demoMethod();
    }
}
