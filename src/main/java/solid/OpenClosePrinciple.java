package solid;


// BEFORE OCP
class PaymentProcess1 {
    public void process(Object type) {
        if(type instanceof CardPayment) {
            System.out.println("Card Payment logic!");
        } else if (type instanceof UPIPayment) {
            System.out.println("UPI Payment logic!");
        }
    }
}


// functionality/ behaviour should be there in corresponding classes instead of having it in common class like above


// AFTER OCP
// Open for extension and close for modifications
// Should not change the existing behaviour of an Entity(class/interface/method)

interface PaymentType {
    void paymentCalculation();
}

class CardPayment implements PaymentType {

    @Override
    public void paymentCalculation() {
        System.out.println("Card Payment!!");
    }
}

class UPIPayment implements PaymentType {

    @Override
    public void paymentCalculation() {
        System.out.println("UPI Payment!!");
    }
}
class PaymentProcess {
    public void process(PaymentType type) {
        type.paymentCalculation();
    }
}
public class OpenClosePrinciple {
    public static void main(String[] args) {
        PaymentProcess paymentProcess = new PaymentProcess();
        paymentProcess.process(new CardPayment());
        paymentProcess.process(new UPIPayment());

        PaymentType paymentType = new UPIPayment();
        paymentType.paymentCalculation();
        PaymentType paymentType1 = new CardPayment();
        paymentType1.paymentCalculation();
    }
}
