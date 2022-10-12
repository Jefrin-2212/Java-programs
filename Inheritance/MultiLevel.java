class SquareNumber{
    public int square(int num){
        return num*num;
    }
}
class CubeNumber extends SquareNumber{
    public int cube(int num){
    return num*num*num;
    }
}

class Prime extends CubeNumber{
    public void primeNumber(int M){
        int C=0;
        for(int i=1;i<=M;i++){
            if(M%i==0){
                C+=1;
            }
        }
        if(C==2){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }
    }
}
class FactorialNumber extends Prime{
    public long fact(long M){
    long pro =1;
    for(long i=1;i<M;i++){
        pro=pro*i;
    }
    return pro;
}
}
public class MultiLevel {
    public static void main(String [] args){
        FactorialNumber obj = new FactorialNumber();
    System.out.println(obj.fact(24));
    System.out.println(obj.square(3));
    System.out.println(obj.cube(3));
    obj.primeNumber(13);
    }
}
