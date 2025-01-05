package DesignPatterns;

class Singleton {
    private static Singleton INSTANCE = null;
    private String s;
    private Singleton() {
        this.s = "Hello ";
    }
    public static Singleton getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }
    public String getString() {
        return this.s;
    }
    public void setString(String str) {
        this.s = this.s +str;
    }
}
