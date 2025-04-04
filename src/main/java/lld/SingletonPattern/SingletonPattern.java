package lld.SingletonPattern;

public class SingletonPattern {
    private static SingletonPattern singletonPattern=null;
    private String str;


    private SingletonPattern(String str){
        this.str=str;
    }

    public static SingletonPattern getSingletonPattern(String str){
        if(singletonPattern==null){
            singletonPattern=new SingletonPattern(str);
        }
        return singletonPattern;
    }
    public void printStr(){
        System.out.println(str);
    }
}
