import java.util.*;


public class FIrstIndex {

    public static int firstIndex(int arr[],int i,int data){
        if(arr.length==i){
            return -1;
        }
        if(arr[i]==data){
            return i;
        }
        return firstIndex(arr,i+1,data);

    }

    public static void main(String args[]){
        int arr[]={2,4,6,7,9,2};
        int data=2;
        int ans=firstIndex(arr,0,data);
        System.out.println(ans);
    }
    
}
