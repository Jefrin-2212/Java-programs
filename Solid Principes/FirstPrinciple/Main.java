// Single Responsibility Principle

import java.util.Scanner;
class Main{

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\n\n\n\n");
        
        
        System.out.println("Welcome!! Have a great day\n");

        ProductsAvailable obj2 = new ProductsAvailable();
        int Num= sc.nextInt();
        double amountPay=obj2.productAvailable(Num);
        
        Discount obj = new Discount(amountPay);
        System.out.println("The total payable amount is "+obj.giveDiscount());

       PaymentMode obj3 = new PaymentMode();
       int num = sc.nextInt();
       obj3.payment(num);


       System.out.println("Thankyou!! Visit Again");
       sc.close();
    }
}