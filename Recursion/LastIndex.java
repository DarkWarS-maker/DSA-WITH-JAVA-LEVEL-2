import java.util.*;

public class LastIndex {
    public static int firstIndex(int arr[],int i,int data){
        if(arr.length==i){
            return -1;
        }
        
         int recAns=firstIndex(arr,i+1,data);
         if(recAns==-1){
             if(arr[i]==data){
                 return i;
             }
             else{
                 return -1;
             }
         }
         else{
             return recAns;
         }

    }

    public static void main(String args[]){
        int arr[]={2,4,6,7,9,2};
        int data=2;
        int ans=firstIndex(arr,0,data);
        System.out.println(ans);
    }
    
}
