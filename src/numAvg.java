import java.util.Scanner;

public class numAvg {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

    int number=1,sum=0,neg=0,pos=0;
    System.out.println("Enter an integer, an input ends if it is 0:");
    do{
        number=in.nextInt();
        if (number<0){
            neg++;
        }
        if (number>0){
            pos++;
        }
         sum=sum+number;

    }while(number!=0);

if(pos+neg==0){
    System.out.println("No numbers are entered except 0");
}else{
             float avg = (float) sum / (neg + pos);

            System.out.printf("The number of positives is %d\n", pos);
            System.out.printf("The number of negatives is %d\n", neg);
            System.out.printf("The total is %d\n", sum);
            System.out.printf("The average is %.2f", avg);
        }
    }
}
