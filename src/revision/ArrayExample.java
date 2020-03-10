package revision;

public class ArrayExample {
    public static void main(String[] args) {
        char[] myFile = {'T','o','d','a','y','\0','i','s','\0',
                'f','u','n','\0','d','a','y','\1'
        };
        System.out.println(countNumberOfChars(myFile));
    }
    public static int countNumberOfChars(char[] fileArray){
        int numberOfChars=0;
        for(int i=0 ; i<fileArray.length ; i++){
            if(fileArray[i]!='\0' || fileArray[i]!='\1'){
                numberOfChars++;
            }
        }
        return numberOfChars;
    }

}
