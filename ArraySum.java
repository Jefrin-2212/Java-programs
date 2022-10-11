import   java.util.Scanner;
public class ArraySum {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arr [] = new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        int sum = arr[0];
        for(int i=1;i<num;i++){
            if (arr[i]%2 == 0){
                sum+=arr[i];
            }
            else if(arr[i]%2!=0){
                if(arr[i-1]%2==1){
                    sum+=arr[i];
                }
            }
        }
        System.out.println("Output is "+sum);   

    }
}