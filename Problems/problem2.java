//Given a array. If number of odd number equal to the number of even number,then place all odd number in odd position and even number in even position

import java.util.Scanner;
public class problem2 {
    public static void main(String [] args){
        int even=0;
        int odd=0;

        int evenCount=0;
        int oddCount=1;
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        int arr1[] = new int[N];
        for(int i=0;i<N;i++){
            int a=sc.nextInt(); 
            arr[i]=a;
            if(a%2==0){
                even+=1;
            }
            else{
                odd+=1;
            }
        }    
        sc.close();
        if(even==odd){
            System.out.println("Yes");
            for(int j=0;j<N;j++){
                if (arr[j]%2==0){
                    arr1[evenCount]=arr[j];
                }
                else{
                    arr[oddCount]=arr[j];
                }
            }
            for(int k =0;k<N;k++){
                System.out.print(arr1[k]+" ");
            }
        }
        else{
            System.out.println("No");
        }   
     
}
}
   
