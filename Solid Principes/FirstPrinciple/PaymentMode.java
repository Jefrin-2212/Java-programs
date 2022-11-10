import java.util.Scanner;
public class PaymentMode {
    Scanner sc = new Scanner(System.in);
    PaymentMode(){
        System.out.println("Payment Mode\n");
        System.out.println("1--> UPI Payment\n2---> Card Payment\n");

    }
   

    public void payment(int num){
        switch(num){
            case(1):
            System.out.println("The the UPI ID\n");
            String s = sc.next();
            System.out.println("Your payment has processed\n");
            break;
            

            case(2):
            System.out.println("Enter the Card Number\n");
            String card = sc.next();
            System.out.println("Enter the OTP\n");
            String otp = sc.next();
            System.out.println("Your Payment has processed\n");
            break;   
        }
    }
}
