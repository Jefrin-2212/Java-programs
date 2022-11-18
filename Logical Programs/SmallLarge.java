import java.util.Scanner;
public class SmallLarge {

    public static int findMin(int[] arr){
        int min=Integer.MAX_VALUE;
        int secMin=Integer.MAX_VALUE;
        
        
        for(int i=0;i<arr.length;i++){
            if (arr[i]<min){
                secMin=min;
                min=arr[i];
            }
            if(arr[i]>min && arr[i]<secMin){
                secMin=arr[i];
            }
        }
        return secMin;
    }

    public static int findMax(int[] arr){
        int max=Integer.MIN_VALUE;
        int secMax=Integer.MIN_VALUE;
        
        
        for(int i=0;i<arr.length;i++){
            if (arr[i]>max){
                secMax=max;
                max=arr[i];
            }
            if(arr[i]<max && arr[i]>secMax){
                secMax=arr[i];
            }
        }
        return secMax;
    }

  

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int arr[]={10,7,-8,5,0,6};
    
    int SecMin=findMin(arr);
    int SecMax=findMax(arr);
    System.out.println(SecMin);
    System.out.println(SecMax);
    



    sc.close();  
}
}


    // int N = sc.nextInt();
    
    // int [] arr = new int[N];
    // for(int i=0;i<N;i++){
    //     int num=sc.nextInt();
    //     arr[i]=num;
    // }