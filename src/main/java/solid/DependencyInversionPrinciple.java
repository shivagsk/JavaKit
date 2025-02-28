package solid;

interface PaymentGateway {
    void processPayment(double amount);
}

class PayPalPayment1 implements PaymentGateway {
    @Override
    public void processPayment(double amount) {
        System.out.println("Payment of $" + amount + " processed using PayPal.");
    }
}

class StripePayment implements PaymentGateway {
    @Override
    public void processPayment(double amount) {
        System.out.println("Payment of $" + amount + " processed using Stripe.");
    }
}

class OrderProcessor {
    private PaymentGateway paymentGateway;

    // Dependency Injection via Constructor
    public OrderProcessor(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public void processOrder(double amount) {
        System.out.println("Order processed.");
        paymentGateway.processPayment(amount);
    }
}





public class DependencyInversionPrinciple {

    public static void main(String[] args) {
        // Inject PayPalPayment
        OrderProcessor paypalProcessor = new OrderProcessor(new PayPalPayment1());
        paypalProcessor.processOrder(500);

        // Inject StripePayment
        OrderProcessor stripeProcessor = new OrderProcessor(new StripePayment());
        stripeProcessor.processOrder(750);
    }
}
