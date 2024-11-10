import java.util.Scanner;
public float pow(float a,float b) {

    public class loanApp {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            double loanAmount;
            int years;
            float interest;

            loanAmount = in.nextDouble();
            years = in.nextInt();
            interest = in.nextFloat();
            int months = years * 12;
            float monthlyInterest = interest / 100;
            float k = Math.pow((1 + monthlyInterest), months);
            float monthlyPayments = (float) loanAmount * ((monthlyInterest * k) / (k - 1));
        }
    }
}
