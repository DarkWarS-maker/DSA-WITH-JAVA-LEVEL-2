import java.util.*;

public class AllSubSeq {

    public static ArrayList<String> getAllSubSequance(String st){
        if(st.length()==0){
            ArrayList<String> bs=new ArrayList<>();
            bs.add("");
            return bs;
        }
        ArrayList<String> myAns=new ArrayList<>();
        char ch=st.charAt(0);
        String remStr=st.substring(1);
        ArrayList<String> ans=getAllSubSequance(remStr);
        for(String ele:ans){
            myAns.add(ch+ele);
            myAns.add(ele);
        }
        return myAns;
    }

    public static void main(String args[]){
        String st="abc";
        ArrayList<String> ans=getAllSubSequance(st);
        for(int i=0;i<ans.size();i++){
            System.out.println(ans.get(i));
        }
    }
    
}
