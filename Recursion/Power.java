import java.util.*;

public class Power {

    public static int powerr(int a,int b){
        if(b==0){
            return 1;
        }
        int recAns=powerr(a,b-1);
        return a*recAns;


    }

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int ans=powerr(a,b);
        System.out.println(ans);
    }
    
}
