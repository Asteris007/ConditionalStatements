import java.util.Scanner;

public class DogYears {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int humanYears =scanner.nextInt();

        if(humanYears<=2){
            System.out.println(humanYears*10);
        }
        if (humanYears>2 &&humanYears<16){
            System.out.println((humanYears - 2)*4 +20);
        }

    }
}
