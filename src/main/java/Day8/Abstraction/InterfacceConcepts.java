package Day8.Abstraction;

//Abstraction can be achieved with the help of Abstract class or interface

public interface InterfacceConcepts {
    void add();//default it is considered as abstract method
    void disp();
}

//we are keeping the methods information without its body : so from here we are able to recall that some where in our project we will have its implementation
interface Payment{
    void payViaUPI();
    void payViaCreditCard();
    void payViaDebitCard();
}




abstract class UPIPayment implements Payment{

    @Override
    public void payViaUPI() {

    }

}





abstract class CreditCardPayment implements Payment{

    @Override
    public void payViaCreditCard() {

    }
}





abstract class DebitCardPayment implements Payment{

    @Override
    public void payViaDebitCard() {

    }
}