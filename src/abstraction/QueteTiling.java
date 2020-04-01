package abstraction;

public class QueteTiling  extends Quete{
    String materials;

     QueteTiling(String costumerName, int totalSquareFeet, double price, String materials) {
        super(costumerName, totalSquareFeet, price);
        this.materials = materials;
    }
    QueteTiling() {
        super();
    }

    public String getMaterials() {
        return materials;
    }

    public void setMaterials(String materials) {
        this.materials = materials;
    }
    double calculateTotalMaterialPrice (){
         if(this.materials.equalsIgnoreCase("wood")){
             return this.getTotalSquareFeet()*2.4;
         }
         else if (this.materials.equalsIgnoreCase("tile")){
             return this.getTotalSquareFeet()*1.99;
         }
         else {
             System.out.println("wrong material");
             return 0.0 ;
         }
    }
    double  calculateTotalPrice (){
         this.setPrice(this.calculateTotalMaterialPrice()+4*this.getTotalSquareFeet());
         return this.getPrice();
    }
    void printQuete (){
        System.out.println(""+
                "customer Name : \t"+this.getCostumerName()+
                "total sqrFeet :\t "+this.getTotalSquareFeet()+
                "Materials price : "+this.calculateTotalMaterialPrice()+
                "total price : "+ this.getPrice());


    }


    @Override
    public String toString() {
        return "QueteTiling{" +
                "materials='" + materials + '\'' +
                '}';
    }
}
