package solid;

/*
*   Definition:
A class should not be forced to implement methods of interfaces it doesn’t use.

Why was ISP introduced?

To prevent classes from being burdened with methods that are irrelevant to them.
Encourages smaller, more focused interfaces to improve modularity and maintainability.
*
* */


interface Printable {
    void print(String content);
}

interface Scannable {
    void scan(String content);
}

interface Faxable {
    void fax(String content);
}

class BasicPrinter implements Printable {
    @Override
    public void print(String content) {
        System.out.println("Printing: " + content);
    }
}

class AdvancedPrinter implements Printable, Scannable, Faxable {
    @Override
    public void print(String content) {
        System.out.println("Printing: " + content);
    }

    @Override
    public void scan(String content) {
        System.out.println("Scanning: " + content);
    }

    @Override
    public void fax(String content) {
        System.out.println("Faxing: " + content);
    }
}


public class InterfaceSeggregationPrinciple {
}
