package DesignPatterns.factory;

public class OperatingSysImpl {
    private OperatingSys operatingSys;

    public OperatingSys getInstance(String type) {
        switch(type) {
            case "Windows" :
                return new Windows();
            case "Android" :
                return new Android();
            case "AppleIOS" :
                return new AppleIos();
            default :
                throw new IllegalArgumentException("NO such OS type present!");
        }
    }
}
