package solid;


/*
* “Derived or child classes must be substitutable for their base or parent classes“.
* This principle ensures that any class that is the child of a parent class should
* be usable in place of its parent without any unexpected behavior.
*
* */


//PaymentType pt = new OnlinePay();
//PaymentType/OnlinePay cp =   new CardPay();

// Parent obj =  new child2();
// Child1 obj1 = new Child2();

abstract class Bird {
    public abstract void eat();
}

abstract class FlyingBird extends Bird {
    public abstract void fly();
}

class Sparrow extends FlyingBird {
    @Override
    public void eat() {
        System.out.println("Sparrow eating");
    }

    @Override
    public void fly() {
        System.out.println("Sparrow flying");
    }
}

class Penguin extends Bird {
    @Override
    public void eat() {
        System.out.println("Penguin eating");
    }
}

// Another example

abstract class PaymentMethod {
    public abstract void pay(double amount);
}

class OnlinePayment extends PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Online payment of $" + amount + " processed!");
    }
}


class CreditCardPayment extends OnlinePayment {
    @Override
    public void pay(double amount) {
        System.out.println("Payment of $" + amount + " made using Credit Card!");
    }
}

class PayPalPayment extends OnlinePayment {
    @Override
    public void pay(double amount) {
        System.out.println("Payment of $" + amount + " made using PayPal!");
    }
}

class CashOnDelivery extends PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Payment of $" + amount + " will be collected on delivery!");
    }
}


public class LiskovSubstitutionPrinciple {
    public static void main(String[] args) {
        PaymentMethod paymentMethod = new CashOnDelivery();
        paymentMethod.pay(10);

        OnlinePayment online = new CreditCardPayment();
        online.pay(20);
    }
}
