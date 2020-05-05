package string_processing;

public class EmptyString {
    public static void main(String[] args) {
        StringBuilder myString=new StringBuilder();
        myString.append("today ");
        myString.append("is ");
        myString.append("sunday ");

        System.out.println(myString);
        myString.insert(9, "sunny ");
        System.out.println(myString);
        myString.replace(15, 21,"monday ");
        System.out.println(myString);
        myString.delete(0,5);
        System.out.println(myString);



    }
}
