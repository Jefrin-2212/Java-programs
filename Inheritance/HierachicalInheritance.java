

class Numbers{
    public void printNumber(int N){
        for(int i=1;i<=N;i++){
            System.out.print(i+" ");
        }
    }
    public void newLine(){
        System.out.println();
    }
}

class Even extends Numbers{
    public void printEvenNumbers(int N){
        for(int i=1;i<=N;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
    }
}

class Odd extends Numbers{
    public void printOddNumbers(int N){
        for(int i=1;i<=N;i++){
            if(i%2==1){
                System.out.print(i+" ");
            }
        }
    }
}


public class HierachicalInheritance {
    public static void main(String [] args){
        Odd odd = new Odd();
        Even even = new Even();


        odd.printNumber(20);
        odd.newLine();
        odd.printOddNumbers(20);
        odd.newLine();

        even.printNumber(30);
        even.newLine();
        even.printEvenNumbers(30);


    }
}
