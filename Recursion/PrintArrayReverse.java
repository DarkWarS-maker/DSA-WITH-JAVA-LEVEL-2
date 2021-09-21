import java.util.*;

public class PrintArrayReverse {
    public static void printArr(int arr[],int i){
        if(i==arr.length){
            return;
        }
        
        printArr(arr,i+1);
        System.out.println(arr[i]);
    }

    public static void main(String args[]){
        int arr[]={10,20,30,60};
        printArr(arr,0);
    }
    
}
