package strategy;
public class CCStrategy implements StrategyPattern.paymentType{

    private String customerName;
    private String ccNumber;
    private String ccvNumber;
    private String expDate;

    public CCStrategy(String name, String ccNum, String ccv, String date){
        this.customerName = name;
        this.ccNumber = ccNum;
        this.ccvNumber = ccv;
        this.expDate = date;
    }


    @Override public void pay(double billAmount){
            System.out.println(billAmount+ " was payed with a credit/debit card.");
    }

}