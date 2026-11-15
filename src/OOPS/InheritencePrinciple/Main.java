package OOPS.InheritencePrinciple;

public class Main {
    static void main() {
        PaymentType paymentType=new CreditCard();
        paymentType.pay();
    }
}
class PaymentType {
    public void pay(){
        System.out.println("Pay via cash");
    }
}

class CreditCard extends PaymentType{
    @Override
    public void pay() {
        System.out.println("Credit card pay");
    }
}

class NetBanking extends PaymentType{
    @Override
    public void pay() {
        System.out.println("Net banking pay");
    }
}