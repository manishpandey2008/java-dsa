import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

class Test1{
    private String firstName="Manish";
    public String lastName="Pandey";
    public String getFirstNameVal(){
        return this.firstName;
    }
}

public class Test2 extends Test1 {

    public String getFirstNameVal(){
        return lastName;
    }
    public void print(){
        System.out.println(this.getFirstNameVal());
    }

    public static void main(String[] args) {
//        int[] nums=new int[]{3,30,34,5,9};
//        int l=nums.length;
//        String[] strs=new String[l];
//        for(int i=0;i<l;i++){
//            strs[i]= String.valueOf(nums[i]);
//        }
//        Arrays.sort(strs, new Comparator<String>(){
//            @Override
//            public int compare(String o1, String o2) {
//                String str1=o1+o2;
//                String str2=o2+o1;
//                return str2.compareTo(str1);
//            }
//        });
//
//        if(Objects.equals(strs[0], "0")) System.out.println("0");
//        StringBuilder stringBuilder=new StringBuilder();
//        for(String s:strs)stringBuilder.append(s);
//        System.out.println(stringBuilder.toString());

//        System.out.println(Math.ceil(10/3.0));

        var val="04";
        System.out.println(Double.parseDouble(String.valueOf(val)));
    }
}
