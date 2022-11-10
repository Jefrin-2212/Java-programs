public class Discount {
    double amount;
    Discount(double amount){
        this.amount=amount;
    }
    public double giveDiscount(){
        if (amount>=10000.0){
            double out = amount-(amount*(20.0/100.0));
            System.out.println("The discount Amount is "+amount*(20.0/100.0));
            return (out);
        }
        else if (amount>=5000.0){
            System.out.println("The discount Amount is "+amount*(10.0/100.0));
          return (amount-(amount*(10.0/100.0)));
        }
        else if (amount>=2000.0){
            System.out.println("The discount Amount is "+amount*(5.0/100.0));
          return (amount-(amount*(5.0/100.0)));
        }
        else{
            System.out.println("Rs 50 off");
            return amount-50;
        }

    }

}

