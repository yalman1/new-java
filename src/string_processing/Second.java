package string_processing;

public class Second {
    public static void main(String[] args) {
        StringBuilder myStr= new StringBuilder("Rumeysa");

        StringBuilder myReverse= new StringBuilder( myStr.reverse().toString());
        System.out.println(myReverse);

        if(myStr.equals(myReverse)){
            System.out.println("they are same");
        }
        else {
            System.out.println("not same");
        }

        System.out.println(myStr.capacity());
        myStr.append(" Yalman This is new String just added");
        System.out.println(myStr);

        System.out.println(myStr.capacity());
        myStr.append(" This is another String just added");
        System.out.println(myStr);

    }
}
