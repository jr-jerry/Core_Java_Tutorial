package OOPS.PolyMorphism;

public class ProjectImplMethodOverriding {
    static void main(String[] args) {
        PaymentMethod paymentMethod = new NetBankPaymentMethod();
        paymentMethod.pay();
    }
}
class PaymentMethod{
    public void pay(){
        System.out.println("Pay via cash ! ");
    }
}
class CreditCardPaymentMethod extends PaymentMethod{
    @Override
    public void pay() {
        System.out.println("Pay via credit card ! ");
    }
}
class NetBankPaymentMethod extends PaymentMethod{
    @Override
    public void pay() {
        System.out.println("Pay via net bank ! ");
    }
}
