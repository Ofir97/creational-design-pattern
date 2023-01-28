public class Singleton {

    private static Singleton instance = null;

    private int x = (int) (Math.random() * 101);

    private Singleton() {
        System.out.println("CTOR IN ACTION: " + this.getClass().getName());
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null)
                    instance = new Singleton();
            }
        }
        return instance;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "Singleton{" +
                "x=" + x +
                '}';
    }
}
