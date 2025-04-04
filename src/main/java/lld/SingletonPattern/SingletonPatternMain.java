package lld.SingletonPattern;

public class SingletonPatternMain {
    public static void main(String[] args) {
        for (int i=0;i<5;i++){
            SingletonPattern singletonPattern=SingletonPattern.getSingletonPattern("Print : "+i);
            singletonPattern.printStr();
        }

        for (int i=0;i<5;i++){
            SingletonPatternThreadSafe singletonPattern=SingletonPatternThreadSafe.getSingletonPatternThreadSafe("Print thread safe : "+i);
            singletonPattern.printStr();
        }

        Thread thread1= new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                SingletonPattern singletonPattern=SingletonPattern.getSingletonPattern("Print : "+i);
                singletonPattern.printStr();

            }
        });

        Thread thread2= new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                SingletonPatternThreadSafe singletonPattern=SingletonPatternThreadSafe.getSingletonPatternThreadSafe("Print thread safe : "+i);
                singletonPattern.printStr();
            }
        });

        thread1.run();

    }
}
