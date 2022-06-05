package Patterns.Creational.Singleton;

public final class Singleton {
    private static volatile Singleton instance;

    private Singleton() {
    }


    /**
     *  Double check for Threads.
     */
    public static Singleton getInstance(){
        if (instance!=null){
            synchronized (Singleton.class) {
                if (instance!=null)
                    instance = new Singleton();
            }

        }
        return instance;
    }
}
