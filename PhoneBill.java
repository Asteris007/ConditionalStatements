import java.util.Scanner;

public class PhoneBill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int textMes = scanner.nextInt();
        int minutes = scanner.nextInt();

        double phoneTax = 12.00;
        double message, messLeft;
        double addMessage;
        double phoneMinute, minutesLeft;
        double addMinute;
        double salesTax;
        double totalBill;

        if (textMes > 20 && minutes > 60) {
            addMessage = 0.06;
            messLeft = textMes - 20;
            message = messLeft * addMessage;
            System.out.printf("%.0f additional messages for %.2f levas\n", messLeft, message);

            addMinute = 0.10;
            minutesLeft = minutes - 60;
            phoneMinute = minutesLeft * addMinute;
            System.out.printf("%.0f additional minutes for %.2f levas\n", minutesLeft, phoneMinute);

            salesTax = (message + phoneMinute) * 0.2;
            System.out.printf("%.2f additional taxes\n", salesTax);

            totalBill = phoneTax + message + phoneMinute + salesTax;
            System.out.printf("%.2f total bill", totalBill);

        } else if (textMes <= 20 && minutes <= 60) {
            message = 0;
            addMessage = 0.00;

            addMinute = 0;
            phoneMinute = 0.00;
            salesTax = 0.00;


            System.out.printf("%.0f additional messages for %.2f levas\n", message, addMessage);
            System.out.printf("%.0f additional minutes for %.2f levas\n", addMinute, phoneMinute);

            System.out.printf("%.2f additional taxes\n", salesTax);
            System.out.printf("%.2f total bill", phoneTax);

        } else if (textMes <= 20 && minutes > 60) {

            message = 0;
            addMessage = 0.00;
            System.out.printf("%.0f additional messages for %.2f levas\n", message, addMessage);

            addMinute = 0.10;
            minutesLeft = minutes - 60;
            phoneMinute = minutesLeft * addMinute;
            System.out.printf("%.0f additional minutes for %.2f levas\n", minutesLeft, phoneMinute);

            salesTax = phoneMinute * 0.20;
            System.out.printf("%.2f additional taxes\n", salesTax);

            totalBill = phoneTax + message + phoneMinute + salesTax;
            System.out.printf("%.2f total bill", totalBill);

        } else if (textMes > 20 && minutes <= 60) {
            addMessage = 0.06;
            messLeft = textMes - 20;
            message = messLeft * addMessage;
            System.out.printf("%.0f additional messages for %.2f levas\n", messLeft, message);

            addMinute = 0;
            phoneMinute = 0.00;
            System.out.printf("%.0f additional minutes for %.2f levas\n", addMinute, phoneMinute);

            salesTax = message * 0.2;
            System.out.printf("%.2f additional taxes\n", salesTax);

            totalBill = phoneTax + message + phoneMinute + salesTax;
            System.out.printf("%.2f total bill", totalBill);
        }
    }
}
