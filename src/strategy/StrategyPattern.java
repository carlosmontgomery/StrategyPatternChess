package strategy;

public class StrategyPattern {

    //Interface that allows client to either pay with a credit card or online payment service "Paypal"
    public interface paymentType{
        public void pay(double billAmount);
    }
}



