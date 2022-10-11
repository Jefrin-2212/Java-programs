

class StaticDemo{
    int age;                                                // Instance Variable                            
    public StaticDemo(int age){                             // Constructor
        this.age=age;
        System.out.println("Constructor  executed");
    }

    static{
        System.out.println("Static block is executed");     // Static block
    }

    static String name ="jef";                              // Static Variable
    
    public static void evenOrOdd(int num){                  // Static Method
        System.out.println("Static method");
        if(num%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
    
    
    public void display(){                                 // Normal method
        if(age>60){
            System.out.println("Senior");
        }
        else{
            System.out.println("Not num senior");
        }
    }


}
public class StaticVariable {
    public static void main(String [] args){
        StaticDemo obj = new StaticDemo(55);   
        System.out.println(StaticDemo.name);
        StaticDemo.evenOrOdd(8);
        obj.display();
    }
}
