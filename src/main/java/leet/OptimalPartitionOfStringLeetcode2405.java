package leet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OptimalPartitionOfStringLeetcode2405 {
    public static void main(String[] args) {
        String str=new String("abacaba");
        boolean[] checked=new boolean[26];
        Arrays.fill(checked,false);
        List<String> res=new ArrayList<>();
        String tempStr="";
        for (char c : str.toCharArray()){
            if(checked[c-'a']){
                res.add(tempStr);
                Arrays.fill(checked,false);
                tempStr="";
            }
            tempStr+=c;
            checked[c-'a']=true;
        }
        if(tempStr.length()>0)res.add(tempStr);
        res.forEach(System.out::println);
    }
}
