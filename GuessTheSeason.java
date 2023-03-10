import java.util.Locale;
import java.util.Scanner;

public class GuessTheSeason {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int date = scanner.nextInt();

        switch (month.toLowerCase()) {
            case "december":
                if(date>=1&&date<=20){
                    System.out.println("Autumn");
                }
                else if(date>=21&&date<=31){
                    System.out.println("Winter");
                }
                break;
            case "january":
            case "february":
            {
                System.out.println("Winter");
            }
            break;


            case "march":
                if(date>=1&&date<=19){
                    System.out.println("Winter");
                }
                else if(date>=20){
                    System.out.println("Spring");
                }
                break;
            case "april":
            case "may":
            {
                System.out.println("Spring");
            }
            break;
            case "june":
                if(date>=1&&date<=20){
                    System.out.println("Spring");
                } else if (date>=21) {
                    System.out.println("Summer");

                }
                break;

            case "july":
            case "august":
                if(date>=1&&date<=31){
                    System.out.println("Summer");
                }
                break;
            case "september":
                if(date>=1&&date<=21){
                    System.out.println("Summer");
                }
                else if(date>=21&&date<=30){
                    System.out.println("Autumn");
                }
                break;

            case "october":

            case "november":
            {
                System.out.println("Autumn");
            }
            break;

        }
    }
}
