package switchStatement;
import java.util.Scanner;
public class homework2weather {
    public static void main(String[] args) {
        Scanner scan =new Scanner (System.in);
        System.out.println("Please enter the day");
        String day =scan.next();


        String description1="thunderstorm", description2 ="sunny", description3 ="cloudy";
        int precip1=80, precip2=20, precip3=40, precip4=30;
        String wind1= "ESE 10 mph" ,wind2= "ESE 4 mph", wind3= "WNW 4 mph",wind4= "WSW 4 mph", wind5= "ESE 8 mph";
        int humidity1=92, humidity2=73, humidity3=69,humidity4=72, humidity5=71;
        String which ="monday", which2="tuesday", which3="wednesday", which4="thurday",which5="friday";
        System.out.println("Day"+"\t"+"\tDescription"+"\t\tPrecip"+"\tWind"+"\t\tHumidity");

        switch (day){

        case  "monday":
            System.out.println(which+"\t"+description1 + "\t"+precip1+"%" + "\t"+"\t"+wind1 + "\t"+humidity1+"%");

            break;

        case "tuesday":
            System.out.println(which2+"\t"+description2 + "\t"+"\t"+precip2+"%" + "\t"+wind2 + "\t"+humidity2+"%");
            break;

        case "wednesday":
            System.out.println(which3+"\t"+description1 + "\t"+"\t"+precip3+"%" +"\t"+ wind3 + "\t"+humidity3+"%");
            break;

        case "thursday":
            System.out.println(which4+"\t"+description3 +"\t"+"\t"+ precip3+"%" +"\t"+ wind4 +"\t"+ humidity4+"%");
            break;

        case "friday":
            System.out.println(which5+"\t"+description1 + "\t"+"\t"+precip4+"%" + "\t"+wind5 + "\t"+humidity5+"%");
            break;

        default:
            System.out.println("Enter only weekdays");
            break;
        }



    }
}
