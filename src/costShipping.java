import java.util.Scanner;

public class costShipping {

    public static void main(String[]args){

        Scanner in = new Scanner(System.in);
            double weight;
            System.out.println("Enter weight:");
            weight=in.nextDouble();

            if(weight>0 && weight <=2) {
                System.out.println("Cost of shipping is 2.5");
            }else if(weight<=4){
                System.out.println("Cost of shipping is 4.5");
            }else if (weight<=10){
                System.out.println("Cost of shipping is 7.5");
            }else if (weight<=20){
            System.out.println("Cost of shipping is 10.5");
            }else if (weight>20) {
                System.out.println("Package cannot be shipped!");
            }
        }
    }


