package constructor;

public class personInfoTest {
    public static void main(String[] args) {
        personInfo relation =new personInfo("bahar",
                3000, "brown", 180);
        System.out.println("she is "+relation.herName+
                "\t\nShe earns "+relation.herSalary+"$"+"\t\nher hair color is "+relation.herHairColor
                +"\t\nshe is "+relation.herHeight+" cm long");
        relation.relation(" sister");
        relation.salary(400);
    }
}
