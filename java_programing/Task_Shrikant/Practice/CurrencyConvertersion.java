import java.util.Scanner;

class CurrencyConvertersion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (;;) {
            System.out.println("\n************ Welcome to Currency Converter ************");

            System.out.println("\nAvailable Currencies:");
            System.out.println("1.USD  2.EUR  3.GBP  4.JPY  5.AUD");
            System.out.println("6.CAD  7.SGD  8.AED  9.CNY  10.RUB ");

            System.out.print("\nEnter a currency: ");
            String currency = sc.next().toUpperCase();

            System.out.print("Enter the amount (INR): ");
            double userCurr = sc.nextDouble();

            double curr = 0;

            if (currency.equals("USD")) {
                curr = userCurr / 90.82;
            } else if (currency.equals("EUR")) {
                curr = userCurr / 98.45;
            } else if (currency.equals("GBP")) {
                curr = userCurr / 115.67;
            } else if (currency.equals("JPY")) {
                curr = userCurr / 0.60;
            } else if (currency.equals("AUD")) {
                curr = userCurr / 60.12;
            } else if (currency.equals("CAD")) {
                curr = userCurr / 66.45;
            } else if (currency.equals("SGD")) {
                curr = userCurr / 67.89;
            } else if (currency.equals("AED")) {
                curr = userCurr / 24.73;
            } else if (currency.equals("CNY")) {
                curr = userCurr / 12.54;
            } else if (currency.equals("RUB")) {
                curr = userCurr / 1.02;
            } else {
                System.out.println("Invalid Currency Entered");
                return;
            }

            System.out.println("\nConverted Amount = " + curr + " " + currency);
        }
    }
}