import java.util.*;

public class NokiaKeyPad {

    public static String arr[]={ ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static ArrayList<String> getAllkeyPad(String st){
        if(st.length()==0){
            ArrayList<String> ans=new ArrayList<>();
            ans.add("");
            return ans;
        }
       char ch=st.charAt(0);
       int idx=ch-'0';
       String str=arr[idx];
       ArrayList<String> anss=getAllkeyPad(st.substring(1));
       ArrayList<String> myAns=new ArrayList<>();
        for(int i=0;i<str.length();i++){
            char chh=str.charAt(i);
            for(String ss:anss){
                myAns.add(ss+chh);

            }

        }
        return myAns;



    }

    public static void main(String args[]){
        String num="7";
        ArrayList<String> ans=getAllkeyPad(num);
        for(int i=0;i<ans.size();i++){
            System.out.println(ans.get(i));
        }

    }
    
}
