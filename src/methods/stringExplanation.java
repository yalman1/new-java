package methods;

public class stringExplanation {
    public static void main(String[] args) {
        // String literal
        String name1="john";
        // String object
        String name2 = new String("john");

        boolean isEqual =name1==name2;
        System.out.println(isEqual);

        boolean isEqualInside =name1.equals(name2);
        System.out.println(isEqualInside);

        String name3 = "John";
        boolean isNameAndName3equal =name1==name3;
        System.out.println(isNameAndName3equal);

        String name4 ="John";
        String name5 ="john";
        boolean isEqualIfIgnoreCase = name1.equalsIgnoreCase(name5);
        System.out.println(isEqualIfIgnoreCase);

        name4= name4 + "Doe";
        name4 =name4 +"newname";
        System.out.println(name4);
    }
}
