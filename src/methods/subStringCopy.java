package methods;

public class subStringCopy {
    public static void printInterval (String text,int start, int end){
        for (int i=start; i<=end; i++){
            System.out.print(text.charAt(i));
        }
    }

    public static void main(String[] args) {
        subStringCopy.printInterval("We love java", 3, 6);
        System.out.println();
        System.out.println("Hello".substring(1,4));
    }
}
