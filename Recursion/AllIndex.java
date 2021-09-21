import java.util.*;

public class AllIndex {


    public static int[] findAllIndex(int arr[],int data,int i,int count){
        if(i>=arr.length){
            return new int[count];
        }
        int ans[];
        if(arr[i]==data){
           ans= findAllIndex(arr,data,i+1,count+1);
           ans[count]=i;
        }
        else{
            ans=findAllIndex(arr,data,i+1,count);
        }
        return ans;
    }

    public static void main(String args[]){
        int arr[]={1,2,1,1,4,6,1};
        int data=1;
        int ans[]=findAllIndex(arr,data,0,0);
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }

    }
    
}
