import java.util.Scanner;

public class ChessSquareColor {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String input = scanner.nextLine();
        int r = scanner.nextInt();
        if(input.length()==1){
            char l = input.charAt(0);

            if(l>='a' && l<= 'h'){
                if(r>=1&& r<=8){
                    switch (l){

                        case 'a':
                        case 'A':
                        case 'c':
                        case 'C':
                        case 'e':
                        case 'E':
                        case 'g':
                        case 'G':
                            if(r==1||r==3||r==5||r==7){
                                System.out.println("dark");
                            }else{
                                System.out.println("light");
                            }
                            break;

                        case 'b':
                        case 'B':
                        case 'd':
                        case 'D':
                        case 'f':
                        case 'F':
                        case 'h':
                        case 'H':
                            if(r==1||r==3||r==5||r==7){
                                System.out.println("light");
                            }else{
                                System.out.println("dark");
                            }
                            break;
                    }
                }
            }
        }

    }
}
