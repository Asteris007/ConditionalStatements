import java.util.Scanner;

public class SortThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a= scanner.nextInt();
        int b= scanner.nextInt();
        int c= scanner.nextInt();

        int smallest = Math.min(Math.min(a,b),c);
        int largest = Math.max(Math.min(a,b),c);
        int middle= (a+b+c) - (smallest + largest);

        System.out.printf("%d %d %d",largest,middle, smallest);


/*
        int first= scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();

        int smallest = first;
        int middle= second;
        int largest= third;

        if(first>largest){
            largest=first;
        }
        if(second>largest){
            largest=second;
        }
        if(second<smallest){
            smallest=second;
        }
        if(third<smallest){
            smallest=third;
        }
        if(first>=smallest && first<=largest){
            middle = first;
        }
        if(third>=smallest&& third<=largest){
            middle = third;
        }


        System.out.printf("%d %d %d", largest,middle,smallest);
    */
    }

}