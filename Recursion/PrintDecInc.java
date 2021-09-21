import java.util.*;

public class PrintDecInc {

    public static void printDecIncc(int a,int b){
       if(a==b){
           return;
       }
       System.out.println(a);
       printDecIncc(a-1, b);
       System.out.println(a);
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        printDecIncc(a,b);
    }
    
}
