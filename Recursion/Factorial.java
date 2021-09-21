import java.util.*;

public class Factorial {

    public static int printFact(int a){
        if(a==0){
            return 1;
        }
        int recAns=printFact(a-1);
        return a* recAns;
    }


    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();

        System.out.println(printFact(a));
    }
    
}
