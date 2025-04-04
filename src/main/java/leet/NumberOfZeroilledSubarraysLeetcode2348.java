package leet;

public class NumberOfZeroilledSubarraysLeetcode2348 {
    public static void main(String[] args) {
        int[] arr=new int[]{1,3,0,0,2,0,0,4};
        int zeroCount=0;
        int res=0;
//        for (int i: arr){
//            if(i!=0){
//                res+=(zeroCount*(zeroCount+1))/2;
//                zeroCount=0;
//            }else{
//                zeroCount++;
//            }
//        }

        for(int i : arr){
            if(i==0){
                zeroCount+=1;
            }else{
                zeroCount=0;
            }
            res+=zeroCount;
        }


        System.out.println(res);
    }
}
