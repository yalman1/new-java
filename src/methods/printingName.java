package methods;

public class printingName {
    public static void main(String[] args) {                    // print yor name in the main
        System.out.println("Sunday is fun day is Java");
        printMyName();
        printMyName2("it is always fun with Java");
        System.out.println(printMyName3());//returning string value
        System.out.println(printMyName4("So you are also in love with Java"));  //returning string value
    }
    public static void printMyName(){                    //void method (without parameter)
        System.out.println("Yes sure");
    }
    public static void printMyName2(String name){        //void method (with parameter)
        System.out.println(name);
    }
    public static String printMyName3 (){               //string method (without parameter)
        return "O yeah I love Java too";
    }
    public static String printMyName4 (String name){               //string method (with parameter)
        return name;
    }

}
