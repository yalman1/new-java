package string_processing;

public class CharValues {
    public static void main(String[] args) {
        findTotalCahrValues("ABC");
        String str="Java";

        str +=" is fun";
        System.out.println(str);
    }
    public static void findTotalCahrValues (String str){
        int total=0;
        for (int i = 0; i < str.length(); i++) {
            total+=str.charAt(i);

        }
        System.out.println(total);
    }
}
