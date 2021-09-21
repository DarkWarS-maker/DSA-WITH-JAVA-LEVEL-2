import java.util.*;
public class PrintInc{


    public static void printIncreasing(int a,int b){

        if(a==b){
            System.out.println(a);
            return;
        }
        System.out.println(a);
        printIncreasing(a+1, b);
    }

    public static void main(String args[]){

            Scanner sc=new Scanner(System.in);

        int st=sc.nextInt();
        int ed=sc.nextInt();
        printIncreasing(st,ed);



    }



}