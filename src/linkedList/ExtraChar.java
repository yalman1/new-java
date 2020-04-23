package linkedList;

public class ExtraChar {
    public static void main(String[] args) {
        String str="as - 2@jfhf67kg6%";
        System.out.println("char \t digot \t upper \t lower");
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i)+"\t");
            System.out.print(Character.isDigit(str.charAt(i)));
            System.out.print(Character.isUpperCase(str.charAt(i)));
            System.out.print(Character.isLowerCase(str.charAt(i)));
            System.out.println();
        }
    }
}
