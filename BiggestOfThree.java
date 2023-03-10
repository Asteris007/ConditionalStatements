import java.util.Scanner;

public class BiggestOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b =scanner.nextInt();
        int c= scanner.nextInt();
        int d= scanner.nextInt();
        int e=scanner.nextInt();
        int maxOfFive = a;

        if(b>maxOfFive){
            maxOfFive=b;
        }if(c>maxOfFive){
            maxOfFive =c;
        }if(d>maxOfFive){
            maxOfFive=d;
        }if(e>maxOfFive){
            maxOfFive=e;
        }
        System.out.println(maxOfFive);
    }
}
