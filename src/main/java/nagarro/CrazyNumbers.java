package nagarro;

import java8.DateTime;

import java.util.Date;

public class CrazyNumbers {
    /*
    Ninja loves playing with numbers. So one day, he wants to arrange a few numbers in the ‘N’ number of rows. The first row contains 1 number, the second row has two numbers, the third row has 3 digits, and so on.
    Ninja starts placing numbers in increasing order, with absolute difference 1, starting from 1 and continuing till he encounters 9, and then he again restarts from 1.
    You are given an integer ‘N’ denoting the given number of rows. Can you print the pattern that Ninja wants to create?
    Pattern for N = 4:
    1 23 456 7891
     */


    public static void main(String[] args) {
        int n=500;
        long t1=new Date().getTime();
        StringBuilder stringBuilder=new StringBuilder();
        int count=0;
        for(int i=1;i<=n;i++){
            StringBuilder tempStr= new StringBuilder();
            for(int j=0;j<i;j++){
                count++;
                tempStr.append(count);
                if(count==9)count=0;
            }
            stringBuilder.append(tempStr);
            stringBuilder.append(" ");
        }
        System.out.println(stringBuilder.toString());
        long t2=new Date().getTime();
        System.out.println(t2-t1); // 18 ms
    }
}
