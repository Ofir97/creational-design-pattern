public class Test {

    public static void main(String[] args) {

        new Thread(Singleton::getInstance).start();
        new Thread(Singleton::getInstance).start();


    }
}
