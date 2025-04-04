package lld.SingletonPattern;


public class SingletonPatternThreadSafe {
    private static SingletonPatternThreadSafe singletonPatternThreadSafe;
    private String str;

    private SingletonPatternThreadSafe(String str){
        this.str=str;
    }

    public static SingletonPatternThreadSafe getSingletonPatternThreadSafe(String str) {
        if(singletonPatternThreadSafe==null){
            synchronized (SingletonPattern.class){
                if(singletonPatternThreadSafe==null){
                    singletonPatternThreadSafe=new SingletonPatternThreadSafe(str);
                }
            }
        }
        return singletonPatternThreadSafe;
    }

    public void printStr(){
        System.out.println(str);
    }
}
