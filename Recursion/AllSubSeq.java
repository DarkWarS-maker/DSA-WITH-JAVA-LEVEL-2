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

    public static int getAllSubSequance2(String st,String asf,ArrayList<String> ans){
        if(st.length()==0){
            System.out.println(asf);
            ans.add(asf);
            return 1;
        }
        char ch=st.charAt(0);

       int lf= getAllSubSequance2(st.substring(1),asf+ch, ans);
       int rf= getAllSubSequance2(st.substring(1), asf, ans);
       return lf+rf;

    }

    public static void main(String args[]){
        String st="abc";
        // ArrayList<String> ans=getAllSubSequance(st);
        ArrayList<String> ans=new ArrayList<>();
        int anss=getAllSubSequance2(st,"",ans);
        System.out.println(anss);
        for(int i=0;i<ans.size();i++){
            System.out.println(ans.get(i));
        }
    }
    
}
