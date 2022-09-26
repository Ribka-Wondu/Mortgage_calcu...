import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        byte Month_In_Year=12;
                byte Percent=100;
                Scanner scanner = new Scanner(System.in);
        System.out.println("principal: ");
        int principal= scanner.nextInt();
        System.out.println("AnnualInterestRate: ");
        Double AnnualInterestRate= scanner.nextDouble();
         Double Monthly_Interest_Rate=AnnualInterestRate/Percent/Month_In_Year;
                System.out.println("Peroid: ");
        int Peroid= scanner.nextInt();
        System.out.println("NumberOfPaymentAllYear: ");
        Double numberOfPaymentAllYear = scanner.nextDouble();
        int numberOfPaymenAllYear =Peroid*Month_In_Year;
        Double A = principal * (Monthly_Interest_Rate) * Math.pow((1 + Monthly_Interest_Rate),numberOfPaymenAllYear);
        Double B=Math.pow((1 + Monthly_Interest_Rate), numberOfPaymenAllYear) - 1;
        Double mortgage=A/B;
        NumberFormat currency= NumberFormat.getCurrencyInstance();
        String result=currency.format(mortgage);
        System.out.println(result);
        //MORTGAGE CALCULATOR......
    }
}

