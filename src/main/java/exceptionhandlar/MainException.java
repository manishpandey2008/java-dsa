package exceptionhandlar;

import lombok.SneakyThrows;

import java.io.FileNotFoundException;

public class MainException {
    public static void main(String[] args) {
        MainException mainException=new MainException();
        mainException.fun1();
    }

    public void fun1(){
        fun2();
    }

    @SneakyThrows
    public void fun2(){
        throw new FileNotFoundException();
    }
}
