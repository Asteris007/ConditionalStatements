import java.util.Scanner;

public class CalculateChange {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        double price = input.nextDouble();
        double payment = input.nextDouble();


        int changeSt = (int) ((payment - price) * 100);


        int lev = changeSt / 100;
        changeSt %= 100;
        int fifty = changeSt / 50;
        changeSt %= 50;
        int twenty = changeSt / 20;
        changeSt %= 20;
        int ten = changeSt / 10;
        changeSt %= 10;
        int five = changeSt / 5;
        changeSt %= 5;
        int two = changeSt / 2;
        changeSt %= 2;
        int one = changeSt;


        if (lev > 0) {
            System.out.printf("%d x 1 lev\n", lev);
        }
        if (fifty > 0) {
            System.out.printf("%d x 50 stotinki\n", fifty);
        }
        if (twenty > 0) {
            System.out.printf("%d x 20 stotinki\n", twenty);
        }
        if (ten > 0) {
            System.out.printf("%d x 10 stotinki\n", ten);
        }
        if (five > 0) {
            System.out.printf("%d x 5 stotinki\n", five);
        }
        if (two > 0) {
            System.out.printf("%d x 2 stotinki\n", two);
        }
        if (one > 0) {
            System.out.printf("%d x 1 stotinka\n", one);
        }
    }
}







