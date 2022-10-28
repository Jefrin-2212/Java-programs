class Security{
    private static String passWord="abcdef";
    private int AmountBalance=0;
    
    
    public void setAmount(int Balance){
        AmountBalance+=Balance;
    }



    public int getAmount(String pass){
        if (pass.equals(passWord)){
            return AmountBalance;
        }
        else{
            System.out.println("Enter Valid password");
            return 0;
            
        }
    }

    
}


import java.util.Scanner;
public class Main{
        public static void main(String [] args){
            Scanner sc = new Scanner(System.in);
            Security obj = new Security();
            
            while(true){
                System.out.println("Enter the Amount");
                int N = sc.nextInt();
                obj.setAmount(N);
                System.out.println("Enter PassWord");
                String pass = sc.next();
                System.out.println("The balance amount is "+obj.getAmount(pass));
            }
        }
        
    }
    
