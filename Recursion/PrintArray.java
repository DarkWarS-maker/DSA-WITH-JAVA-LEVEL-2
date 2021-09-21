import java.util.*;

public class PrintArray {

    public static void printArr(int arr[],int i){
        if(i==arr.length){
            return;
        }
        System.out.println(arr[i]);
        printArr(arr,i+1);
    }

    public static void main(String args[]){
        int arr[]={10,20,30,60};
        printArr(arr,0);
    }
    
}
