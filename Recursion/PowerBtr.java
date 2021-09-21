
import java.util.*;
public class PowerBtr {
    public static int powerr(int a,int b){
        if(b==0){
            return 1;
        }
        int recAns=powerr(a,b/2);
        if(b%2==0){
            return recAns*recAns;
        }
        else{
            return a*recAns*recAns;
        }
        


    }

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int ans=powerr(a,b);
        System.out.println(ans);
    }
    
    
}


