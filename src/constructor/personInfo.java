package constructor;

public class personInfo {
    String herName;
    int herSalary;
    String herHairColor;
    int herHeight;

    public personInfo(String herName, int herSalary,String herHairColor, int herHeight){
        this.herName=herName;
        this.herSalary=herSalary;
        this.herHairColor=herHairColor;
        this.herHeight=herHeight;
        }
        public void relation (String relative){
            System.out.println("she is my"+relative);
    }
    public void salary (int pay){
        this.herSalary+=pay;
    }
}
