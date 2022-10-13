public class factOfNumberResu {
    public static long fact(long N){
        if(N==0){
            return 1;
        }
        else{
            return N*fact(N-1);
        }
    }
    public static void main(String [] args){
        int N =20;
        System.out.println(fact(N));
    }
}
