import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;


class Calculate{
    static void agecalculate(int d,int m,int y,int dd,int mm,int yyyy){
        int Dcount = (y-yyyy)*365;
        int Mcount = (y-yyyy)*12+(m-mm);
        System.out.println((y-yyyy)+"Years "+Math.abs(m-mm)+"Months "+Math.abs(d-dd)+"Days old");
        System.out.println("Days  : "+Dcount);
        System.out.println("Months : "+Mcount);
        
    }
}
class getDetails{
    Date d = new Date();
    LocalDate today = LocalDate.now();
    int month = today.getMonthValue();
    int day = today.getDayOfMonth();
    int year = today.getYear();

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("<<<<<<<<<<<<<<<AGE CALCULATOR>>>>>>>>>>>>>>>");
        System.out.println("<<<<<<<<<<<<<<<-------------->>>>>>>>>>>>>>>");
        getDetails ob = new getDetails();
        int d = ob.getDay();
        int m = ob.getMonth();
        int y = ob.getYear();
        System.out.println("<<<<<<<<<<<<<Enter Date of Birth>>>>>>>>>>>>");
        System.out.print("Enter a day  :");
        int dd = sc.nextInt();
        System.out.print("Enter a month:");
        int mm = sc.nextInt();
        System.out.print("Enter a year :");
        int yyyy = sc.nextInt();
        System.out.println("<<<<<<<<<<<<<<<-------------->>>>>>>>>>>>>>>");
        Calculate.agecalculate(d,m,y,dd,mm,yyyy);
        System.out.println("<<<<<<<<<<<<<<<-------------->>>>>>>>>>>>>>>");
    }
}
