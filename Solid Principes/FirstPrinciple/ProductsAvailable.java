
public class ProductsAvailable {
    int amount=0;
    
    
    public ProductsAvailable(){
    System.out.println("Please a choose a number to buy a product\n");
    System.out.println("1--->Laptop(Rs 10000)\n2--->TV(Rs 5000)\n3--->Moblie(Rs 3000)\n4--->Fan(Rs 500)\n5--->Fridge(Rs 800)");
}
    public double productAvailable(int num){
    switch(num){
        case 1:
        amount+= 10000.0;
        return amount;
       
        case 2:
        amount+= 5000.0;
        return amount;
       
        case 3:
        amount+= 3000.0;
        return amount;
        
        case 4:
        amount+= 500.0;
        return amount;
        
        case 5:
        amount+= 800.0;
        return amount;

        default:
        System.out.println("Enter number between 1-5");
        return 0;
    }   


}
}
