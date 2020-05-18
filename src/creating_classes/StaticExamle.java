package creating_classes;

import inheritance.StaticExample;

public class StaticExamle {
    static int a=10;

    public static void main(String[] args) {
        Stt.method();
        method1();
        method2();
    }
    static void method1 (){
        System.out.println("This is method 1");
    }
    static void method2 (){
        System.out.println("This is method 2 ");
    }
}
class Stt{
    static void method (){
        System.out.println(StaticExamle.a);
    }
}

