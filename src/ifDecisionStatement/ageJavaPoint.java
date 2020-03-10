package ifDecisionStatement;
public class ageJavaPoint {
    public static void main(String[] args) {
       int age=20;
       int javaScore =90;
       if((age >=20 && age<=30) && javaScore>= 80){
           System.out.println(age*1.5 +javaScore<80);
        }
       else if( (age >=20 && age<=30) && javaScore< 80){
           System.out.println(age*1.5 +javaScore*3.5);
       }
       else if (age >30 &&javaScore >=80){
           System.out.println(age*1.1 + javaScore*1.5);
       }
       else if (age >30 && javaScore >=80) {

       }
       else {
           System.out.println("please enter a valid age or Java score");
       }
    }

}
