import java.util.Scanner;

public class FactorialCalculatorTwo { 
    public static void main ( String[] args ) {
        Scanner scan = new Scanner(System.in);

        int number;
        System.out.println("<-------FACTORIAL CALCULATOR------->");

        for ( int x = 1; x <= 5; x++ ) {
            int factorial = 1;
            System.out.print("ENTER A POSITIVE INTEGER: ");
            number = scan.nextInt();
        
            if ( number < 0 ) {
                System.out.println("INVALID INPUT, PROGRAM STOPPED!");
                break;
            } else{ 
                System.out.print(number + "! = ");
                for ( int y = 1; y <= number; y++ ) {
                    System.out.print(y); 

                    if ( y < number ) { 
                        System.out.print(" X ");       
                    }
                    factorial *= y;
                }
                System.out.println();
                System.out.println("THE FACTORIAL OF " + number + " IS: " + factorial);
            }
        }
    }
}