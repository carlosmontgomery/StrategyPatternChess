package strategy;
public class PayPalStrategy implements StrategyPattern.paymentType{
        private String customerEmail;
        private String password;

        public PayPalStrategy(String email, String psswd){
            this.customerEmail = email;
            this.password = psswd;
        }

        @Override
        public void pay(double amount) {
            System.out.println(amount + " was paid using PayPal.");
        }
}
