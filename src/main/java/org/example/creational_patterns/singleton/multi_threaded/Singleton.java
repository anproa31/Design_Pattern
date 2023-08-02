package org.example.creational_patterns.singleton.multi_threaded;

public class Singleton {
    private static Singleton instance;
    public String value;

    private Singleton(String value) {
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.value = value;
    }

    public static Singleton GetInstance(String value) {
        if (instance == null) {
            instance = new Singleton(value);
        }
        return instance;
    }
}