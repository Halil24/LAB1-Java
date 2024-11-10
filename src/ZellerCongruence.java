import java.util.Scanner;

public class ZellerCongruence {

    public static void main(String [] args){

      Scanner in = new Scanner(System.in);
      int dayof,year,month,date;

      System.out.println("Enter year:");
      year=in.nextInt();
      System.out.println("Enter month:");
      month=in.nextInt();

      System.out.println("Enter day of the month:");
      date=in.nextInt();
        if (month<3){
            month=month+12;
            year -= 1;
        }
        dayof=(date+(26*(month+1))/10+(year%100)+((year%100)/4)+((year/100)/4)+5*(year/100))%7;
      if(dayof==0){
          System.out.println("Day of the week is Saturday");
      }else if(dayof==1){
          System.out.println("Day of the week is Sunday");
      }else if(dayof==2){
          System.out.println("Day of the week is Monday");
      }else if(dayof==3){
          System.out.println("Day of the week is Tuesday");
      }else if(dayof==4){
          System.out.println("Day of the week is Wednesday");
      }else if(dayof==5){
          System.out.println("Day of the week is Thursday");
      }else if(dayof==6){
          System.out.println("Day of the week is Friday");
      }

    }
}
