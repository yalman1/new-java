package exceptions;

import org.w3c.dom.ls.LSOutput;

public class Intro {
    public static void main(String[] args) {
        int x=10;
        int y =0;
        try{
            System.out.println(x/y);
        }
        catch (Exception e){       //(ArithmeticException e){
            System.out.println("division by zero exception");
        }
        System.out.println("can you see me?");
    }
}
class introString {
    public static void main(String[] args) {
        String s=null;
        try {
            System.out.println(s.length());
        }
        catch (Exception e){
            System.out.println("ooops");
        }
    }
}
class introWrapper {
    public static void main(String[] args) {
        String a="a";
        try {
            int number =Integer.parseInt(a);
        }
        catch (Exception e){
            System.out.println("Sorry I could not convert");
        }
    }
}

class introo {
    public static void main(String[] args) {
        int numbers []={1,2,3,4,5};
        try {
            System.out.println(numbers[77]);
        }
        catch (Exception e){
            System.out.println("we do not have that index");
        }
    }
}

