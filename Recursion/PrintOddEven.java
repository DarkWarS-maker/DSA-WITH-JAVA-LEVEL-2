import java.util.*;

public class PrintOddEven {

    public static void PrintOddEvenn(int a,int b){

        if(a==b){
            return;
        }
        if(a%2==0){
            System.out.println(a+" "+" Even");
        }
        else{
            System.out.println(a+" "+" Odd");
        }
        PrintOddEvenn(a+1,b);
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        PrintOddEvenn(a,b);
    }
    
}
