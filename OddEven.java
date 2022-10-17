import java.util.Scanner;

public class OddEven {

        public static void main(String args[])
        {
            int num;
            System.out.print("Enter an Integer number: ");

            //The input provided by user is stored in num
            Scanner input = new Scanner(System.in);
            num = input.nextInt();

            // If number is divisible by 2 then it's an even number
            //else it is an odd number
            if ( num % 2 == 0 ) {
                System.out.println(num+" is an EVEN number.");
            } else
                System.out.println(num+" is an ODD number.");
        }
    }

