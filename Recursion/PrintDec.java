package Recursion;
import java.util.*;
public class PrintDec {
    
    public static void printDec(int a,int b){
        if(a==b){
            System.out.println(a);
            return;
        }
        System.out.println(a
        printDec(a-1, b);
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        printDec(a,b);
        
    }
    
}
