package hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class EntrySetNameAndPhoneNumber {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.print("How many entries ?");
            int n = scan.nextInt();
            HashMap<String,Integer> pb = new HashMap<>();
            String name;
            int phoneNumber;
            for (int i = 0; i < n; i++) {
                System.out.print("Enter Name ? ");
                name=scan.next();
                System.out.print("Enter Phone Number ? ");
                phoneNumber = scan.nextInt();
                pb.put(name,phoneNumber);
            }
            //query starts
            int numberOfQuestions=3;
            String query;
            while(numberOfQuestions>=0){
                System.out.print("Enter name for the entry : ");
                query=scan.next();
                if(pb.containsKey(query)){
                    System.out.println(query+"="+ pb.get(query));
                }
                else{
                    System.out.println("Not found");
                }
                numberOfQuestions--;
        }

            // second implementation
        HashMap<String, Integer> phoneBook = new HashMap<>();
        Scanner scn = new Scanner(System.in);
        String names;
        int number;
        for(int i=0 ; i<3 ; i++){
            System.out.print("Enter name: ");
            names = scn.next();
            System.out.print("Enter phone number: ");
            number = scn.nextInt();
            phoneBook.put(names,number);
        }
        //System.out.println(phoneBook);
        String nameToFind;
        for(int i=0 ; i<3 ; i++){
            System.out.print("Which name : ");
            nameToFind=scn.next();
            if(phoneBook.containsKey(nameToFind)){
                System.out.println(nameToFind+"="+phoneBook.get(nameToFind));
            }
            else{
                System.out.println("Not found");
            }
        }
    }
}
