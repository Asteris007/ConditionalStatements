import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String year = scanner.next();

        switch (year){
            case "1964":
            case "1976":
            case "1988":
            case "2000":
            case"2012":
                System.out.println("Dragon");
                break;
            case "1965":
            case "1977":
            case "1989":
            case "2001":
            case"2013":
                System.out.println("Snake");
                break;
            case "1966":
            case "1978":
            case "1990":
            case "2002":
            case"2014":
                System.out.println("Horse");
                break;
            case "1967":
            case "1979":
            case "1991":
            case "2003":
            case"2015":
                System.out.println("Sheep");
                break;
            case "1968":
            case "1980":
            case "1992":
            case "2004":
            case"2016":
                System.out.println("Monkey");
                break;
                case "1969":
            case "1981":
            case "1993":
            case "2005":
            case"2017":
                System.out.println("Rooster");
                break;
            case "1970":
            case "1982":
            case "1994":
            case "2006":
            case"2018":
                System.out.println("Dog");
                break;
            case "1971":
            case "1983":
            case "1995":
            case "2007":
            case"2019":
                System.out.println("Pig");
                break;
            case "1972":
            case "1984":
            case "1996":
            case "2008":
            case"2020":
                System.out.println("Rat");
                break;
            case "1973":
            case "1985":
            case "1997":
            case "2009":
            case"2021":
                System.out.println("Ox");
                break;
            case "1974":
            case "1986":
            case "1998":
            case "2010":
            case"2022":
                System.out.println("Tiger");
                break;
            case "1975":
            case "1987":
            case "1999":
            case "2011":
            case"2023":
                System.out.println("Hare");
                break;
        }

    }
}
