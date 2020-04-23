package arrays;

public class CityNamesString {
    public static void main(String[] args) {
        String [] cities={"NEW YORK","SEATTLE","SAN DIEGO","BOULDER","ANN ARBOR"};
        for (int i=0; i<=4; i++){
            System.out.println(cities[i]);

        }
        System.out.println();
        for (int i=cities.length-1; i>=0; i--){
            System.out.println(cities[i]);
    }
    }
}
