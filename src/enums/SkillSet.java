package enums;

public class SkillSet {
    enum skillSet {
        JAVA,
        SQL,
        SELENIUM,
    }

    public static void main(String[] args) {
        skillSet mySkill = skillSet.JAVA;
        switch (mySkill){
            case SQL:
                System.out.println("Practice Relational Database");
                break;
            case JAVA:
                System.out.println("Solve problem a lot");
                break;
            case SELENIUM:
                System.out.println("Prepare your framework");
                break;
        }

    }

}
