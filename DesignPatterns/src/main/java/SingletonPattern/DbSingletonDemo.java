package SingletonPattern;

public class DbSingletonDemo {

    public static void main(String[] args) {
        DbSingleton instance = DbSingleton.getInstance();
        System.out.println(instance);
        DbSingleton _appsInstance = DbSingleton.getInstance();
        System.out.println(_appsInstance);
    }
}
