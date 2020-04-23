package arrays;

public class SymmetricArray {
    public static void main(String[] args) {
        int number []={1,2,3,3,2,4,1};
        isItSymmetric(number);
    }

    public static void isItSymmetric (int[] arr){

        int index=arr.length-1;
        //System.out.println(index);
        int counter=0;
        for (int i=0; i<arr.length; i++){
            if (arr[i] != arr[index]) {
                counter++;
                index--;
            }
        }
        if(counter<0){
            System.out.println("Symmetric");
        }
        else {
            System.out.println("Not Symmetric");
        }
    }
}
