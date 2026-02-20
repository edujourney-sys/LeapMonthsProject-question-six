
package leapmonthsproject;

import java.util.Scanner;


public class LeapMonthsProject {

  
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

        System.out.print("Enter Year: ");
        int year = input.nextInt();

        boolean isLeapMonth;

        // Leap year logic
        isLeapMonth = (year % 4 == 0);
        isLeapMonth = isLeapMonth && (year % 100 != 0);
        isLeapMonth = isLeapMonth || (year % 400 == 0);

        if (isLeapMonth) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is NOT a Leap Year.");
        }

        input.close();
    }
    
}
