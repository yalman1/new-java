package arrayAndExceptions;

public class CommonElements {
    public static void main(String[] args) {
        int array1 []={1,2,3,4,5,6,7,8,9};
        int array2[]={5,7,12,4,55,67,99};
        commonElementsArray(array1,array2);
    }
    public static void commonElementsArray (int a[], int b[]){
        for (int i=0; i<a.length; i++){
            for (int j=0; j<b.length; j++){
                if (a[i]==b[j]){
                    System.out.println(a[i]);
                }
            }
        }
    }
    static void findCommons(int a[],int[] b){
        for(int i=0;i<a.length;i++){
            int counter=0;
            for(int j=0;j<b.length;j++){
                if(a[i]==b[j]){
                    counter++;
                }
            }
            if(counter>0){
                System.out.println(a[i]);
            }
        }
    }
}
