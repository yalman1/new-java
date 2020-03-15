package creating_classes;

public class first {
    public static void main(String[] args) {
        printString();
        printString("java");
       printString("java", 20);
    }
    public static void printString(){

        for (int i=0; i<=100; i++);
        System.out.println("hello");
    }
   public static void printString (String sen){
        for (int i=0; i<=100; i++){
            System.out.println(sen);
        }
   }
    public static void printString (String word, int number){
        for (int i=0; i<number; i++ ){
            System.out.println(word);
        }
    }
    }


