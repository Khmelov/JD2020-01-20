package by.it.zhuravaskarabahataya.jd01_01;


import com.sun.org.apache.xpath.internal.Arg;

public class Main {

    public static void main(String[] args) {

        Hello hello = new Hello();
        hello.printSlogan();
        hello.setSlogan("Дратути");
        hello.printSlogan();

        Args argObj = new Args(args);
        argObj.printArgs();
    }
}
