// Single Responsibility Principle

import java.util.Scanner;
class Main{

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        
        Welcome obj1 = new Welcome();
        obj1.dispWelcomeMessage();

        ProductsAvailable obj2 = new ProductsAvailable();
        int Num= sc.nextInt();
        double amountPay=obj2.productAvailable(Num);
        
        Discount obj = new Discount(amountPay);
       System.out.println("The total payable amount is "+obj.giveDiscount());


       Thankyou obj3 = new Thankyou();
       obj3.dispThankyouMessage();
       sc.close();
    }
}