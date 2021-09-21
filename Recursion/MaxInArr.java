import java.util.*;
public class MaxInArr {

    public static int printMax(int arr[],int i){
        if(arr.length-1==i){
            return arr[i];
        }
        int recAnsMax=printMax(arr,i+1);
        if(recAnsMax>arr[i]){
            return recAnsMax;
        }
        else{
            return arr[i];
        }
    }
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       int arr[]={10,50,40,60};
       System.out.println(printMax(arr,0));
    }
    
}
